
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

object newsIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[News],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(news: List[News]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<html xmlns="http://www.w3.org/1999/xhtml">
 <head lang="en">
  <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta http-equiv="Cache-Control" content="no-cache" />
  <meta name="format-detection" content="telephone=no">
  <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
  <meta name="apple-mobile-web-app-capable" content="yes" />
  <title>奇智机器人</title>
  <link href="css/css.css" rel="stylesheet" type="text/css" />
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
     <li ><a>产品&nbsp;&nbsp;<i><img src="images/xia.png" /></i><em><img src="images/xia01.png" /></em><label><img src="images/xia02.png" /></label></a><b></b>
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

    <div class="sav fr"><span><img src="images/nav.png" /></span><a><img src="images/nav01.png" /></a></div>
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
window.onbeforeunload = function()"""),format.raw/*112.35*/("""{"""),format.raw/*112.36*/("""
 """),format.raw/*113.2*/("""//刷新后页面自动回到顶部
 document.documentElement.scrollTop = 0;  //ie下
 document.body.scrollTop = 0;  //非ie
"""),format.raw/*116.1*/("""}"""),format.raw/*116.2*/("""
"""),format.raw/*117.1*/("""</script>
  <script>
$(document).ready(function () """),format.raw/*119.31*/("""{"""),format.raw/*119.32*/("""
 """),format.raw/*120.2*/("""var navtop = $(".header").offset().top;
 $(window).scroll(function () """),format.raw/*121.31*/("""{"""),format.raw/*121.32*/("""
  """),format.raw/*122.3*/("""var t = $(window).scrollTop();
  if (t > navtop) """),format.raw/*123.19*/("""{"""),format.raw/*123.20*/("""
   """),format.raw/*124.4*/("""$(".header").addClass("bg");
  """),format.raw/*125.3*/("""}"""),format.raw/*125.4*/(""" """),format.raw/*125.5*/("""else """),format.raw/*125.10*/("""{"""),format.raw/*125.11*/("""
   """),format.raw/*126.4*/("""$(".header").removeClass("bg");
  """),format.raw/*127.3*/("""}"""),format.raw/*127.4*/("""
 """),format.raw/*128.2*/("""}"""),format.raw/*128.3*/(""")
"""),format.raw/*129.1*/("""}"""),format.raw/*129.2*/(""");
</script>
  <script>
$(document).ready(function()"""),format.raw/*132.29*/("""{"""),format.raw/*132.30*/("""
 """),format.raw/*133.2*/("""$(".sav").click(function()"""),format.raw/*133.28*/("""{"""),format.raw/*133.29*/("""
  """),format.raw/*134.3*/("""$(".xia").toggleClass("dis")
  $(".header").toggleClass("kk")
 """),format.raw/*136.2*/("""}"""),format.raw/*136.3*/(""");
 $(".xia p").click(function()"""),format.raw/*137.30*/("""{"""),format.raw/*137.31*/("""
  """),format.raw/*138.3*/("""$(".xia dl").toggleClass("dis")
 """),format.raw/*139.2*/("""}"""),format.raw/*139.3*/(""");
"""),format.raw/*140.1*/("""}"""),format.raw/*140.2*/(""");
</script>

   <!--banner-->
  <div class="ban bb ov">
   <div class="tu ov"><strong><img src="images/banner09.png" /></strong><b><img src="images/wapbanner09.png" /></b></div>
   <div class="wen02 ov">
    <div>
     <p style=" font-weight:normal;">人工智能前沿报道</p>
     <span>奇智新闻依据您的兴趣精准的为您推荐最新资讯</span>
    </div>
   </div>
  </div>

  <div class="xwen ov">
   <div class="title ov">
    <span>新闻动态</span>
    <p><b></b><a>ourNEWS</a><b></b></p>
   </div>

   <div class="list ov">
    <ul>
        """),_display_(/*162.10*/for(n <- news) yield /*162.24*/ {_display_(Seq[Any](format.raw/*162.26*/("""
            """),format.raw/*163.13*/("""<li><a href="news-"""),_display_(/*163.32*/{n._id}),format.raw/*163.39*/(""".html">
                <strong><img src=""""),_display_(/*164.36*/{n.image}),format.raw/*164.45*/("""" />
                    <span>"""),_display_(/*165.28*/utils/*165.33*/.DateTimeUtil.toString(n.updateTime, "yyyy-MM-dd")),format.raw/*165.83*/("""</span></strong>
                <h1>"""),_display_(/*166.22*/{n.title}),format.raw/*166.31*/("""</h1>
                <b></b>
                <p>"""),_display_(/*168.21*/{n.intro}),format.raw/*168.30*/("""</p>
            </a>
            </li>
        """)))}),format.raw/*171.10*/("""
    """),format.raw/*172.5*/("""</ul>
   </div>
  </div>

    <!--fanye-->
   """),format.raw/*182.11*/("""

   """),format.raw/*184.4*/("""<!--免费试用-->
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
      <li><strong><img src="images/f01.png" /></strong><p>电话: 400-604-5033</p></li>
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
        $(".freeUse").click(function()"""),format.raw/*235.39*/("""{"""),format.raw/*235.40*/("""
         """),format.raw/*236.10*/("""window.open("https://cloud.chatbot.cn/cloud/register?phone="+$("#phoneNum").val())
        """),format.raw/*237.9*/("""}"""),format.raw/*237.10*/(""")
</script>
<script type="text/javascript">
             $(document).ready(function()"""),format.raw/*240.42*/("""{"""),format.raw/*240.43*/("""
              """),format.raw/*241.15*/("""$(".footer .on").click(function()"""),format.raw/*241.48*/("""{"""),format.raw/*241.49*/("""
               """),format.raw/*242.16*/("""$(".footer .on p").toggleClass("dis")
              """),format.raw/*243.15*/("""}"""),format.raw/*243.16*/(""");
             """),format.raw/*244.14*/("""}"""),format.raw/*244.15*/(""");

             $(document).ready(function() """),format.raw/*246.43*/("""{"""),format.raw/*246.44*/("""
                 """),format.raw/*247.18*/("""// val()无参数是取值，有参数是设置
                 // 为了更好的兼容性，将下面的val()设置与input中的placeholder的值设置相同
                 $(".sbox p input").val("");
                 textFill($('input.text1'));
             """),format.raw/*251.14*/("""}"""),format.raw/*251.15*/(""");

             function textFill(input) """),format.raw/*253.39*/("""{"""),format.raw/*253.40*/("""
                 """),format.raw/*254.18*/("""var originalvalue = input.val();
                 input.focus(function() """),format.raw/*255.41*/("""{"""),format.raw/*255.42*/("""
                     """),format.raw/*256.22*/("""if ($.trim(input.val()) == originalvalue) """),format.raw/*256.64*/("""{"""),format.raw/*256.65*/("""
                         """),format.raw/*257.26*/("""input.val('');
                     """),format.raw/*258.22*/("""}"""),format.raw/*258.23*/("""
                 """),format.raw/*259.18*/("""}"""),format.raw/*259.19*/(""");
                 input.blur(function() """),format.raw/*260.40*/("""{"""),format.raw/*260.41*/("""
                     """),format.raw/*261.22*/("""if ($.trim(input.val()) == '') """),format.raw/*261.53*/("""{"""),format.raw/*261.54*/("""
                         """),format.raw/*262.26*/("""input.val(originalvalue);
                     """),format.raw/*263.22*/("""}"""),format.raw/*263.23*/("""
                 """),format.raw/*264.18*/("""}"""),format.raw/*264.19*/(""");
             """),format.raw/*265.14*/("""}"""),format.raw/*265.15*/("""
"""),format.raw/*266.1*/("""</script>
   <script>
$(document).ready(function()"""),format.raw/*268.29*/("""{"""),format.raw/*268.30*/("""
 """),format.raw/*269.2*/("""$(".footer .on").click(function()"""),format.raw/*269.35*/("""{"""),format.raw/*269.36*/("""
  """),format.raw/*270.3*/("""$(".footer .on p").toggleClass("dis")
 """),format.raw/*271.2*/("""}"""),format.raw/*271.3*/(""");
"""),format.raw/*272.1*/("""}"""),format.raw/*272.2*/(""");
// 从地址栏获取参数
(function ($) """),format.raw/*274.15*/("""{"""),format.raw/*274.16*/("""
 """),format.raw/*275.2*/("""$.getUrlParam = function (name) """),format.raw/*275.34*/("""{"""),format.raw/*275.35*/("""
  """),format.raw/*276.3*/("""var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
  var r = window.location.search.substr(1).match(reg);
  if (r != null) return decodeURI(r[2]); return null;
 """),format.raw/*279.2*/("""}"""),format.raw/*279.3*/("""
"""),format.raw/*280.1*/("""}"""),format.raw/*280.2*/(""")(jQuery);
var currentKey = $.getUrlParam('key');

if(currentKey =="58")"""),format.raw/*283.22*/("""{"""),format.raw/*283.23*/("""
 """),format.raw/*284.2*/("""$('.biao a').eq(2).addClass("on").siblings().removeClass('on')
"""),format.raw/*285.1*/("""}"""),format.raw/*285.2*/("""else if(currentKey =="ge")"""),format.raw/*285.28*/("""{"""),format.raw/*285.29*/("""
 """),format.raw/*286.2*/("""$('.biao a').eq(3).addClass("on").siblings().removeClass('on')
"""),format.raw/*287.1*/("""}"""),format.raw/*287.2*/("""else if(currentKey =="zgcyh")"""),format.raw/*287.31*/("""{"""),format.raw/*287.32*/("""
 """),format.raw/*288.2*/("""$(".tab01 ul li").eq(2).addClass("on").siblings().removeClass('on')
"""),format.raw/*289.1*/("""}"""),format.raw/*289.2*/("""
"""),format.raw/*290.1*/("""</script>
<script src="./js/main.js" charset="utf-8"></script>
<script src='http://cloud.chatbot.cn/cloud/robot/webjs/5b3c47952400008a1b1f05c3' language="JavaScript"></script>
         <!--百度统计-->
     <script>
    var _hmt = _hmt || [];
    (function () """),format.raw/*296.18*/("""{"""),format.raw/*296.19*/("""
        """),format.raw/*297.9*/("""var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?c1ca7e2ebb1260ee586994702dcb5f5c";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    """),format.raw/*301.5*/("""}"""),format.raw/*301.6*/(""")();
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

  def render(news:List[News]): play.twirl.api.HtmlFormat.Appendable = apply(news)

  def f:((List[News]) => play.twirl.api.HtmlFormat.Appendable) = (news) => apply(news)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 31 16:23:58 CST 2019
                  SOURCE: E:/qizhi/qizhi-news/app/views/site/newsIndex.scala.html
                  HASH: 0408e58966843a1b6439e547c808c55a20c8b747
                  MATRIX: 742->1|855->19|885->23|4943->4052|4973->4053|5004->4056|5134->4158|5163->4159|5193->4161|5275->4214|5305->4215|5336->4218|5436->4289|5466->4290|5498->4294|5577->4344|5607->4345|5640->4350|5700->4382|5729->4383|5758->4384|5792->4389|5822->4390|5855->4395|5918->4430|5947->4431|5978->4434|6007->4435|6038->4438|6067->4439|6151->4494|6181->4495|6212->4498|6267->4524|6297->4525|6329->4529|6422->4594|6451->4595|6513->4628|6543->4629|6575->4633|6637->4667|6666->4668|6698->4672|6727->4673|7279->5197|7310->5211|7351->5213|7394->5227|7441->5246|7470->5253|7542->5297|7573->5306|7634->5339|7649->5344|7721->5394|7788->5433|7819->5442|7899->5494|7930->5503|8014->5555|8048->5561|8128->5874|8163->5881|10655->8347|10685->8348|10725->8359|10845->8451|10875->8452|10992->8540|11022->8541|11067->8557|11129->8590|11159->8591|11205->8608|11287->8661|11317->8662|11363->8679|11393->8680|11470->8728|11500->8729|11548->8748|11772->8943|11802->8944|11875->8988|11905->8989|11953->9008|12056->9082|12086->9083|12138->9106|12209->9148|12239->9149|12295->9176|12361->9213|12391->9214|12439->9233|12469->9234|12541->9277|12571->9278|12623->9301|12683->9332|12713->9333|12769->9360|12846->9408|12876->9409|12924->9428|12954->9429|13000->9446|13030->9447|13060->9449|13141->9501|13171->9502|13202->9505|13264->9538|13294->9539|13326->9543|13394->9583|13423->9584|13455->9588|13484->9589|13544->9620|13574->9621|13605->9624|13666->9656|13696->9657|13728->9661|13925->9830|13954->9831|13984->9833|14013->9834|14117->9909|14147->9910|14178->9913|14270->9977|14299->9978|14354->10004|14384->10005|14415->10008|14507->10072|14536->10073|14594->10102|14624->10103|14655->10106|14752->10175|14781->10176|14811->10178|15101->10439|15131->10440|15169->10450|15430->10683|15459->10684
                  LINES: 21->1|26->1|28->3|137->112|137->112|138->113|141->116|141->116|142->117|144->119|144->119|145->120|146->121|146->121|147->122|148->123|148->123|149->124|150->125|150->125|150->125|150->125|150->125|151->126|152->127|152->127|153->128|153->128|154->129|154->129|157->132|157->132|158->133|158->133|158->133|159->134|161->136|161->136|162->137|162->137|163->138|164->139|164->139|165->140|165->140|187->162|187->162|187->162|188->163|188->163|188->163|189->164|189->164|190->165|190->165|190->165|191->166|191->166|193->168|193->168|196->171|197->172|202->182|204->184|255->235|255->235|256->236|257->237|257->237|260->240|260->240|261->241|261->241|261->241|262->242|263->243|263->243|264->244|264->244|266->246|266->246|267->247|271->251|271->251|273->253|273->253|274->254|275->255|275->255|276->256|276->256|276->256|277->257|278->258|278->258|279->259|279->259|280->260|280->260|281->261|281->261|281->261|282->262|283->263|283->263|284->264|284->264|285->265|285->265|286->266|288->268|288->268|289->269|289->269|289->269|290->270|291->271|291->271|292->272|292->272|294->274|294->274|295->275|295->275|295->275|296->276|299->279|299->279|300->280|300->280|303->283|303->283|304->284|305->285|305->285|305->285|305->285|306->286|307->287|307->287|307->287|307->287|308->288|309->289|309->289|310->290|316->296|316->296|317->297|321->301|321->301
                  -- GENERATED --
              */
          