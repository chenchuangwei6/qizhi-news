package utils;

import com.jcraft.jsch.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SftpUtil {

    public String host;
    public Integer port;
    public String user;
    public String pwd;
    public String targetPath;

    public SftpUtil(String host, Integer port, String user, String pwd, String targetPath) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.pwd = pwd;
        this.targetPath = targetPath;
    }

    public void upload(String indexPath, String listPath) {
        InputStream inputStream = null;
        ChannelSftp sftp = null;
        try {
            sftp = this.createSftp();
            inputStream = new FileInputStream(new File(indexPath + "dongtai.html"));
            doUploadFile(sftp, "dongtai.html", inputStream, targetPath);

            File file = new File(listPath);
            String[] fileList = file.list();
            for (int i = 0; i < fileList.length; i++) {
                inputStream = new FileInputStream(new File(listPath + fileList[i]));
                doUploadFile(sftp, fileList[i], inputStream, targetPath + "news/");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (sftp != null) {
                this.disconnect(sftp);
            }
        }
    }

    public boolean doUploadFile(ChannelSftp sftp, String fileName, InputStream inputStream, String targetPath) throws Exception {
        System.out.println("path :" + targetPath + fileName);
        try {
            sftp.cd(targetPath);
            sftp.put(inputStream, fileName);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    private ChannelSftp createSftp() throws Exception {
        JSch jsch = new JSch();

        Session session = createSession(jsch);
        session.setPassword(pwd);
        session.connect(15000);

        Channel channel = session.openChannel("sftp");
        channel.connect(15000);

        return (ChannelSftp) channel;
    }

    private Session createSession(JSch jsch) throws Exception {
        Session session = null;

        if (port <= 0){
            session = jsch.getSession(user, host);
        }else {
            session = jsch.getSession(user, host, port);
        }

        if (session == null){
            throw new Exception(host + " session is null");
        }

        session.setConfig("StrictHostKeyChecking", "no");
        return session;
    }

    private void disconnect(ChannelSftp sftp){
        try{
            if (sftp != null){
                if (sftp.isConnected()){
                    sftp.disconnect();
                }else if (sftp.isClosed()){
                }
                if (null != sftp.getSession()){
                    sftp.getSession().disconnect();
                }
            }
        }catch (JSchException e){
        }
    }
}
