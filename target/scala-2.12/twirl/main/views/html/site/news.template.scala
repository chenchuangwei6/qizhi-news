
package views.html.site

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object news extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[News,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(n: News):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.11*/("""

"""),format.raw/*3.1*/("""<html xmlns="http://www.w3.org/1999/xhtml">
    <head lang="en">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="Cache-Control" content="no-cache" />
        <meta name="format-detection" content="telephone=no">
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
        <meta name="apple-mobile-web-app-capable" content="yes" />
        <title>"""),_display_(/*11.17*/{n.title}),format.raw/*11.26*/("""-奇智机器人</title>
        <link href="css/css.css" rel="stylesheet" type="text/css" />
        <link href="css/new.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery.pack.js"></script>
        <script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
    </head>

    <body>
            <!--head-->
            <div class="header bg01">
            <div class="head">
                <div class="logo fl"><a href="index.html"><img src="images/logo.png" /></a></div>
                <div class="deng fr">
                    <span><a>登录</a>
                        <ul>
                            <li><a href="javascript:;" class="loginRobot">登录机器人系统</a></li>
                            <li><a href="javascript:;" class="loginKf">登录在线客服系统</a></li>
                        </ul>
                    </span>
                    <span><a href="javascript:;" class="reg">注册</a></span>
                </div>
                <ul class="nav fr">
                    <li><a href="index.html">首页</a><b></b></li>
                    <li><a>产品&nbsp;&nbsp;<i><img src="images/xia.png" /></i><em><img src="images/xia01.png" /></em><label><img src="images/xia02.png" /></label></a><b></b>
                        <dl>
                            <dt><a href="duihua.html">
                                <strong><img src="images/nav1.png" /></strong>
                                <span>对话机器人</span>
                            </a></dt>
                            <dt><a href="zaixian.html">
                                <strong><img src="images/nav2.png" /></strong>
                                <span>在线客服系统</span>
                            </a></dt>
                            <dt><a href="duolun.html">
                                <strong><img src="images/nav3.png" /></strong>
                                <span>多轮对话</span>
                            </a></dt>
                            <dt><a href="shuju.html">
                                <strong><img src="images/nav4.png" /></strong>
                                <span>数据分析</span>
                            </a></dt>
                            <dt><a href="gongdan.html">
                                <strong><img src="images/nav5.png" /></strong>
                                <span>工单系统</span>
                            </a></dt>
                        </dl>
                    </li>
                    <li><a href="jishu.html">技术优势</a><b></b></li>
                    <li><a href="jiage.html">价格</a><b></b></li>
                    <li><a href="anli.html">案例</a><b></b></li>
                    <li><a href="yanshi.html">演示</a><b></b></li>
                    <li class="on"><a href="dongtai.html">动态</a><b></b></li>
                    <li><a href="guanyu.html">关于我们</a><b></b></li>
                </ul>

                <div class="sav fr"><span><img src="images/nav01.png" /></span><a><img src="images/nav01.png" /></a></div>
                <div class="zcs fr"><a href="javascript:;" class="reg">注册</a></div>
            </div>
        </div>

            <!--下拉-->
        <div class="xia ov">
            <ul>
                <li><a href="index.html">首页</a></li>
                <li><p>产品&nbsp;&nbsp;&gt;</p>
                    <dl class="dis">
                        <dt><a href="duihua.html">
                            <strong><img src="images/nav1.png" /></strong>
                            <span>对话机器人</span>
                        </a></dt>
                        <dt><a href="zaixian.html">
                            <strong><img src="images/nav2.png" /></strong>
                            <span>在线客服系统</span>
                        </a></dt>
                        <dt><a href="duolun.html">
                            <strong><img src="images/nav3.png" /></strong>
                            <span>多轮对话</span>
                        </a></dt>
                        <dt><a href="shuju.html">
                            <strong><img src="images/nav4.png" /></strong>
                            <span>数据分析</span>
                        </a></dt>
                        <dt><a href="gongdan.html">
                            <strong><img src="images/nav5.png" /></strong>
                            <span>工单系统</span>
                        </a></dt>
                    </dl>
                </li>
                <li><a href="jishu.html">技术优势</a></li>
                <li><a href="jiage.html">价格</a></li>
                <li><a href="anli.html">案例</a></li>
                <li><a href="yanshi.html">演示</a></li>
                <li><a href="dongtai.html">动态</a></li>
                <li><a href="guanyu.html">关于我们</a></li>
            </ul>
            <dl class="zc ov">
                <dt><a href="zhuce.html">注册</a></dt>
                <dd class="fl"><a href="denglu.html">登录机器人系统</a></dd>
                <dd class="fr"><a href="denglu.html">登录在线客服系统</a></dd>
            </dl>
        </div>
        <script>
window.onbeforeunload = function()"""),format.raw/*113.35*/("""{"""),format.raw/*113.36*/("""
    """),format.raw/*114.5*/("""//刷新后页面自动回到顶部
    document.documentElement.scrollTop = 0;  //ie下
    document.body.scrollTop = 0;  //非ie
"""),format.raw/*117.1*/("""}"""),format.raw/*117.2*/("""
"""),format.raw/*118.1*/("""</script>
        <script>
$(document).ready(function () """),format.raw/*120.31*/("""{"""),format.raw/*120.32*/("""
    """),format.raw/*121.5*/("""var navtop = $(".header").offset().top;
    $(window).scroll(function () """),format.raw/*122.34*/("""{"""),format.raw/*122.35*/("""
        """),format.raw/*123.9*/("""var t = $(window).scrollTop();
        if (t > navtop) """),format.raw/*124.25*/("""{"""),format.raw/*124.26*/("""
            """),format.raw/*125.13*/("""$(".header").addClass("bg");
        """),format.raw/*126.9*/("""}"""),format.raw/*126.10*/(""" """),format.raw/*126.11*/("""else """),format.raw/*126.16*/("""{"""),format.raw/*126.17*/("""
            """),format.raw/*127.13*/("""$(".header").removeClass("bg");
        """),format.raw/*128.9*/("""}"""),format.raw/*128.10*/("""
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/(""")
"""),format.raw/*130.1*/("""}"""),format.raw/*130.2*/(""");
</script>
        <script>
$(document).ready(function()"""),format.raw/*133.29*/("""{"""),format.raw/*133.30*/("""
    """),format.raw/*134.5*/("""$(".sav").click(function()"""),format.raw/*134.31*/("""{"""),format.raw/*134.32*/("""
        """),format.raw/*135.9*/("""$(".xia").toggleClass("dis")
        $(".header").toggleClass("kk")
    """),format.raw/*137.5*/("""}"""),format.raw/*137.6*/(""");
    $(".xia p").click(function()"""),format.raw/*138.33*/("""{"""),format.raw/*138.34*/("""
        """),format.raw/*139.9*/("""$(".xia dl").toggleClass("dis")
    """),format.raw/*140.5*/("""}"""),format.raw/*140.6*/(""");
"""),format.raw/*141.1*/("""}"""),format.raw/*141.2*/(""");
</script>

            <!--banner-->
        <section class="updata_pas" style="padding:0.5em;width: 1200px;margin: 5em auto;">
                <!--<div class="brand"><a href="../index.html">首页</a>/<a href="updata.html">新闻列表</a></div>-->
            <ol class="brand breadcrumb">
                <li><a href="index.html"><span style="color: #41C6E3;">首页</span></a> <span style="color: #ccc;">/</span> <a href="dongtai.html"><span style="color: #41C6E3;">新闻列表</span></a></li>
                """),format.raw/*149.58*/("""
            """),format.raw/*150.13*/("""</ol>
            <h1 style="text-align:center;font-size: 36px;" class="updata_title">"""),_display_(/*151.82*/n/*151.83*/.title),format.raw/*151.89*/("""</h1>
            <p style="text-align:center;margin:20px;">"""),_display_(/*152.56*/utils/*152.61*/.DateTimeUtil.toString(n.updateTime, "yyyy-MM-dd HH:mm")),format.raw/*152.117*/("""</p>
            <div class="passage">
            """),_display_(/*154.14*/Html(n.content.get)),format.raw/*154.33*/("""
            """),format.raw/*155.13*/("""</div>
        </section>

                <!--fanye-->
                """),format.raw/*164.25*/("""

                """),format.raw/*166.17*/("""<!--免费试用-->
            <div class="mbox mt ov">
                <div class="title ov">
                    <span>立即开通奇智机器人，免费试用全部功能</span>
                    <p><b></b><a>free trial all features</a><b></b></p>
                </div>
                <div class="title01 ov">
                    <span>立即开通奇智机器人<br />免费试用全部功能</span>
                    <p><b></b><a>free trial all features</a><b></b></p>
                </div>

                <div class="sbox ov">
                    <strong><img src="images/tel.jpg" /></strong>
                    <p><input type="text" placeholder="请输入您的手机号..." id="phoneNum" /></p >
                    <span><input type="button" value="免费试用"  class="freeUse"/></span>
                </div>
            </div>
                <!--[if lt IE 9]>

                <![endif]-->

                <!--foot-->
        <div class="footer ov">
            <div class="foot ov">
                <div class="logo fl"><img src="images/logo.png" /></div>
                <div class="xw fl">
                    <ul>
                        <li><a href="https://weibo.com/p/1005055792483262/" target="_blank"><img src="images/fb03.png" /></a></li>
                        <li class="on"><a><img src="images/fb02.png" /></a><p><img src="images/wx.jpg" /></p></li>
                        <li><a href="https://shang.qq.com/wpa/qunwpa?idkey=c54b25c8520c54afb7d9125f4e1cd50e86c4d50ddff1dd92a4d060d3b1df6c4e"  alt="奇智机器人官方QQ群" title="官方QQ群: 476248184" target="_blank"><img src="images/fb01.png" /></a></li>
                    </ul>
                </div>
                <ul class="lx fl">
                    <li><strong><img src="images/f01.png" /></strong><p><a href="tel:400-604-5033" title="" style="color: white;">电话: 400-604-5033</a></p></li>
                    <li><strong><img src="images/f02.png" /></strong><p>商务合作: market@chatbot.cn</p></li>
                    <li><strong><img src="images/f03.png" /></strong><p>技术支持: support@chatbot.cn</p></li>
                    <li><strong><img src="images/f04.png" /></strong><p>公司地址:上海市浦东新区祖冲之路1559号创意大厦7001</p></li>
                </ul>
                <dl class="nav fl">
                    <dt><a href="duihua.html">产品</a><a href="jishu.html">技术优势</a><a href="jiage.html">价格</a><a href="anli.html">案例</a><a href="yanshi.html">演示</a><a href="dongtai.html">动态</a><a href="guanyu.html">关于我们</a></dt>
                    <dd><span><a href="anli.html">客户案例</a></span><p><a href="anli.html?key=lkl"><img src="images/c01.png" /></a></p><p><a href="anli.html?key=ge"><img src="images/footer-ge.png" /></a></p><p><a href="anli.html?key=58"><img src="images/footer-58.png" /></a></p><p><a href="anli.html?key=zgcyh"><img src="images/footer-zgcyh.png" /></a></p></dd>
                </dl>
                <div class="bottom fl">
                    <p>奇智机器人-专业的人机智能交互解决方案提供商</p>
                    <span>Copyright@2017 上海八斗智能技术有限公司 | 沪ICP备17004486号-1|</span>
                </div>
            </div>
        </div>
<script>
        $(".freeUse").click(function()"""),format.raw/*215.39*/("""{"""),format.raw/*215.40*/("""
            """),format.raw/*216.13*/("""window.open("https://cloud.chatbot.cn/cloud/register?phone="+$("#phoneNum").val())
        """),format.raw/*217.9*/("""}"""),format.raw/*217.10*/(""")
</script>
<script type="text/javascript">
                $(document).ready(function()"""),format.raw/*220.45*/("""{"""),format.raw/*220.46*/("""
                    """),format.raw/*221.21*/("""$(".footer .on").click(function()"""),format.raw/*221.54*/("""{"""),format.raw/*221.55*/("""
                        """),format.raw/*222.25*/("""$(".footer .on p").toggleClass("dis")
                    """),format.raw/*223.21*/("""}"""),format.raw/*223.22*/(""");
                """),format.raw/*224.17*/("""}"""),format.raw/*224.18*/(""");

             $(document).ready(function() """),format.raw/*226.43*/("""{"""),format.raw/*226.44*/("""
                 """),format.raw/*227.18*/("""// val()无参数是取值，有参数是设置
                 // 为了更好的兼容性，将下面的val()设置与input中的placeholder的值设置相同
                 $(".sbox p input").val("");
                 textFill($('input.text1'));
             """),format.raw/*231.14*/("""}"""),format.raw/*231.15*/(""");

             function textFill(input) """),format.raw/*233.39*/("""{"""),format.raw/*233.40*/("""
                 """),format.raw/*234.18*/("""var originalvalue = input.val();
                 input.focus(function() """),format.raw/*235.41*/("""{"""),format.raw/*235.42*/("""
                     """),format.raw/*236.22*/("""if ($.trim(input.val()) == originalvalue) """),format.raw/*236.64*/("""{"""),format.raw/*236.65*/("""
                         """),format.raw/*237.26*/("""input.val('');
                     """),format.raw/*238.22*/("""}"""),format.raw/*238.23*/("""
                 """),format.raw/*239.18*/("""}"""),format.raw/*239.19*/(""");
                 input.blur(function() """),format.raw/*240.40*/("""{"""),format.raw/*240.41*/("""
                     """),format.raw/*241.22*/("""if ($.trim(input.val()) == '') """),format.raw/*241.53*/("""{"""),format.raw/*241.54*/("""
                         """),format.raw/*242.26*/("""input.val(originalvalue);
                     """),format.raw/*243.22*/("""}"""),format.raw/*243.23*/("""
                 """),format.raw/*244.18*/("""}"""),format.raw/*244.19*/(""");
             """),format.raw/*245.14*/("""}"""),format.raw/*245.15*/("""
"""),format.raw/*246.1*/("""</script>
<script>
$(document).ready(function()"""),format.raw/*248.29*/("""{"""),format.raw/*248.30*/("""
    """),format.raw/*249.5*/("""$(".footer .on").click(function()"""),format.raw/*249.38*/("""{"""),format.raw/*249.39*/("""
        """),format.raw/*250.9*/("""$(".footer .on p").toggleClass("dis")
    """),format.raw/*251.5*/("""}"""),format.raw/*251.6*/(""");
"""),format.raw/*252.1*/("""}"""),format.raw/*252.2*/(""");
// 从地址栏获取参数
(function ($) """),format.raw/*254.15*/("""{"""),format.raw/*254.16*/("""
    """),format.raw/*255.5*/("""$.getUrlParam = function (name) """),format.raw/*255.37*/("""{"""),format.raw/*255.38*/("""
        """),format.raw/*256.9*/("""var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return decodeURI(r[2]); return null;
    """),format.raw/*259.5*/("""}"""),format.raw/*259.6*/("""
"""),format.raw/*260.1*/("""}"""),format.raw/*260.2*/(""")(jQuery);
var currentKey = $.getUrlParam('key');

if(currentKey =="58")"""),format.raw/*263.22*/("""{"""),format.raw/*263.23*/("""
    """),format.raw/*264.5*/("""$('.biao a').eq(2).addClass("on").siblings().removeClass('on')
"""),format.raw/*265.1*/("""}"""),format.raw/*265.2*/("""else if(currentKey =="ge")"""),format.raw/*265.28*/("""{"""),format.raw/*265.29*/("""
    """),format.raw/*266.5*/("""$('.biao a').eq(3).addClass("on").siblings().removeClass('on')
"""),format.raw/*267.1*/("""}"""),format.raw/*267.2*/("""else if(currentKey =="zgcyh")"""),format.raw/*267.31*/("""{"""),format.raw/*267.32*/("""
    """),format.raw/*268.5*/("""$(".tab01 ul li").eq(2).addClass("on").siblings().removeClass('on')
"""),format.raw/*269.1*/("""}"""),format.raw/*269.2*/("""
"""),format.raw/*270.1*/("""</script>
<script src="./js/main.js" charset="utf-8"></script>
<script src='http://cloud.chatbot.cn/cloud/robot/webjs/5b3c47952400008a1b1f05c3' language="JavaScript"></script>
            <!--百度统计-->
        <script>
    var _hmt = _hmt || [];
    (function () """),format.raw/*276.18*/("""{"""),format.raw/*276.19*/("""
        """),format.raw/*277.9*/("""var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?c1ca7e2ebb1260ee586994702dcb5f5c";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    """),format.raw/*281.5*/("""}"""),format.raw/*281.6*/(""")();
  </script>
            <!--百度统计/-->
            <!--cnzz-->
        <div style="display: none;">
            <script type="text/javascript">
      var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
      document.write(unescape("%3Cspan id='cnzz_stat_icon_1256449100'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol +
              "s95.cnzz.com/stat.php%3Fid%3D1256449100' type='text/javascript'%3E%3C/script%3E"));

    </script>
        </div>
            <!--cnzz/-->
</body>
</html>"""))
      }
    }
  }

  def render(n:News): play.twirl.api.HtmlFormat.Appendable = apply(n)

  def f:((News) => play.twirl.api.HtmlFormat.Appendable) = (n) => apply(n)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 31 16:23:57 CST 2019
                  SOURCE: E:/qizhi/qizhi-news/app/views/site/news.scala.html
                  HASH: d128c08f80c51c9b6cd10a88498ce55dea0aa7f6
                  MATRIX: 731->1|835->10|865->14|1424->546|1454->555|6620->5692|6650->5693|6684->5699|6820->5807|6849->5808|6879->5810|6967->5869|6997->5870|7031->5876|7134->5950|7164->5951|7202->5961|7287->6017|7317->6018|7360->6032|7426->6070|7456->6071|7486->6072|7520->6077|7550->6078|7593->6092|7662->6133|7692->6134|7726->6140|7755->6141|7786->6144|7815->6145|7905->6206|7935->6207|7969->6213|8024->6239|8054->6240|8092->6250|8194->6324|8223->6325|8288->6361|8318->6362|8356->6372|8421->6409|8450->6410|8482->6414|8511->6415|9042->6958|9085->6972|9201->7060|9212->7061|9240->7067|9330->7129|9345->7134|9424->7190|9506->7244|9547->7263|9590->7277|9695->7678|9744->7698|12859->10787|12889->10788|12932->10802|13052->10894|13082->10895|13202->10986|13232->10987|13283->11009|13345->11042|13375->11043|13430->11069|13518->11128|13548->11129|13597->11149|13627->11150|13704->11198|13734->11199|13782->11218|14006->11413|14036->11414|14109->11458|14139->11459|14187->11478|14290->11552|14320->11553|14372->11576|14443->11618|14473->11619|14529->11646|14595->11683|14625->11684|14673->11703|14703->11704|14775->11747|14805->11748|14857->11771|14917->11802|14947->11803|15003->11830|15080->11878|15110->11879|15158->11898|15188->11899|15234->11916|15264->11917|15294->11919|15372->11968|15402->11969|15436->11975|15498->12008|15528->12009|15566->12019|15637->12062|15666->12063|15698->12067|15727->12068|15787->12099|15817->12100|15851->12106|15912->12138|15942->12139|15980->12149|16192->12333|16221->12334|16251->12336|16280->12337|16384->12412|16414->12413|16448->12419|16540->12483|16569->12484|16624->12510|16654->12511|16688->12517|16780->12581|16809->12582|16867->12611|16897->12612|16931->12618|17028->12687|17057->12688|17087->12690|17383->12957|17413->12958|17451->12968|17712->13201|17741->13202
                  LINES: 21->1|26->1|28->3|36->11|36->11|138->113|138->113|139->114|142->117|142->117|143->118|145->120|145->120|146->121|147->122|147->122|148->123|149->124|149->124|150->125|151->126|151->126|151->126|151->126|151->126|152->127|153->128|153->128|154->129|154->129|155->130|155->130|158->133|158->133|159->134|159->134|159->134|160->135|162->137|162->137|163->138|163->138|164->139|165->140|165->140|166->141|166->141|174->149|175->150|176->151|176->151|176->151|177->152|177->152|177->152|179->154|179->154|180->155|184->164|186->166|235->215|235->215|236->216|237->217|237->217|240->220|240->220|241->221|241->221|241->221|242->222|243->223|243->223|244->224|244->224|246->226|246->226|247->227|251->231|251->231|253->233|253->233|254->234|255->235|255->235|256->236|256->236|256->236|257->237|258->238|258->238|259->239|259->239|260->240|260->240|261->241|261->241|261->241|262->242|263->243|263->243|264->244|264->244|265->245|265->245|266->246|268->248|268->248|269->249|269->249|269->249|270->250|271->251|271->251|272->252|272->252|274->254|274->254|275->255|275->255|275->255|276->256|279->259|279->259|280->260|280->260|283->263|283->263|284->264|285->265|285->265|285->265|285->265|286->266|287->267|287->267|287->267|287->267|288->268|289->269|289->269|290->270|296->276|296->276|297->277|301->281|301->281
                  -- GENERATED --
              */
          