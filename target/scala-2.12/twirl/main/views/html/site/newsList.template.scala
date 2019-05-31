
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

object newsList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[News],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(news: List[News]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

    <head lang="en">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="Cache-Control" content="no-cache" />
        <meta name="format-detection" content="telephone=no">
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
        <meta name="apple-mobile-web-app-capable" content="yes" />
        <title>奇智机器人_在线智能客服机器人_微信聊天机器人_人工客服系统</title>
        <meta property="og:site_name" content="奇智机器人_在线智能客服机器人_微信聊天机器人_人工客服系统">
        <meta property="og:description" content="奇智智能客服机器人采用最前沿的深度学习技术，问答准确率业内领先；能够自动从聊天记录中学习并在线生成知识库；拥有的多轮对话技术涉及到微信、客服、app系统，满足售前、售后多种应用场景的需求">
        <meta name="keywords" content="客服机器人,微信机器人,智能客服,对话机器人,聊天机器人,问答系统,在线客服机器人,在线客服,智能机器人,对话系统,APP机器人,APP智能客服,客服,云客服,在线客服系统">
        <meta name="description" content="奇智智能客服机器人采用最前沿的深度学习技术，问答准确率业内领先；能够自动从聊天记录中学习并在线生成知识库；拥有的多轮对话技术涉及到微信、客服、app系统，满足售前、售后多种应用场景的需求。">
        <link href="css/css.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="js/jquery.pack.js"></script>
        <script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
    </head>

    <body>
            <!--head-->
        <div class="header">
            <div class="head">
                <div class="logo fl">
                    <a href="index.html">
                        <img src="images/logo.png" />
                    </a>
                </div>
                <div class="deng fr">
                    <span>
                        <a>登录</a>
                        <ul>
                            <li>
                                <a href="javascript:;" class="loginRobot">登录机器人系统</a>
                            </li>
                            <li>
                                <a href="javascript:;" class="loginKf">登录在线客服系统</a>
                            </li>
                        </ul>
                    </span>
                    <span>
                        <a href="javascript:;" class="reg">注册</a>
                    </span>
                </div>
                <ul class="nav fr">
                    <li class="on">
                        <a href="index.html">首页</a>
                        <b></b>
                    </li>
                    <li class="ss">
                        <a>产品&nbsp;&nbsp;
                            <i>
                                <img src="images/xia.png" />
                            </i>
                            <em>
                                <img src="images/xia01.png" />
                            </em>
                            <label>
                                <img src="images/xia02.png" />
                            </label>
                        </a>
                        <b></b>
                        <dl>
                            <dt>
                                <a href="duihua.html">
                                    <strong>
                                        <img src="images/nav1.png" />
                                    </strong>
                                    <span>对话机器人</span>
                                </a>
                            </dt>
                            <dt>
                                <a href="zaixian.html">
                                    <strong>
                                        <img src="images/nav2.png" />
                                    </strong>
                                    <span>在线客服系统</span>
                                </a>
                            </dt>
                            <dt>
                                <a href="duolun.html">
                                    <strong>
                                        <img src="images/nav3.png" />
                                    </strong>
                                    <span>多轮对话</span>
                                </a>
                            </dt>
                            <dt>
                                <a href="shuju.html">
                                    <strong>
                                        <img src="images/nav4.png" />
                                    </strong>
                                    <span>数据分析</span>
                                </a>
                            </dt>
                            <dt>
                                <a href="gongdan.html">
                                    <strong>
                                        <img src="images/nav5.png" />
                                    </strong>
                                    <span>工单系统</span>
                                </a>
                            </dt>
                        </dl>
                    </li>
                    <li>
                        <a href="jishu.html">技术优势</a>
                        <b></b>
                    </li>
                    <li>
                        <a href="jiage.html">价格</a>
                        <b></b>
                    </li>
                    <li>
                        <a href="anli.html">案例</a>
                        <b></b>
                    </li>
                    <li>
                        <a href="yanshi.html">演示</a>
                        <b></b>
                    </li>
                    <li>
                        <a href="dongtai.html">动态</a>
                        <b></b>
                    </li>
                    <li>
                        <a href="guanyu.html">关于我们</a>
                        <b></b>
                    </li>
                </ul>

                <div class="sav fr">
                    <span>
                        <img src="images/nav.png" />
                    </span>
                    <a>
                        <img src="images/nav01.png" />
                    </a>
                </div>
                <div class="zcs fr">
                    <a href="javascript:;" class="reg">注册</a>
                </div>
            </div>
        </div>


            <!--下拉-->
        <div class="xia ov">
            <ul>
                <li>
                    <a href="index.html">首页</a>
                </li>
                <li>
                    <p>产品&nbsp;&nbsp;&gt;</p>
                    <dl class="dis">
                        <dt>
                            <a href="duihua.html">
                                <strong>
                                    <img src="images/nav1.png" />
                                </strong>
                                <span>对话机器人</span>
                            </a>
                        </dt>
                        <dt>
                            <a href="zaixian.html">
                                <strong>
                                    <img src="images/nav2.png" />
                                </strong>
                                <span>在线客服系统</span>
                            </a>
                        </dt>
                        <dt>
                            <a href="duolun.html">
                                <strong>
                                    <img src="images/nav3.png" />
                                </strong>
                                <span>多轮对话</span>
                            </a>
                        </dt>
                        <dt>
                            <a href="shuju.html">
                                <strong>
                                    <img src="images/nav4.png" />
                                </strong>
                                <span>数据分析</span>
                            </a>
                        </dt>
                        <dt>
                            <a href="gongdan.html">
                                <strong>
                                    <img src="images/nav5.png" />
                                </strong>
                                <span>工单系统</span>
                            </a>
                        </dt>
                    </dl>
                </li>
                <li>
                    <a href="jishu.html">技术优势</a>
                </li>
                <li>
                    <a href="jiage.html">价格</a>
                </li>
                <li>
                    <a href="anli.html">案例</a>
                </li>
                <li>
                    <a href="yanshi.html">演示</a>
                </li>
                <li>
                    <a href="dongtai.html">动态</a>
                </li>
                <li>
                    <a href="guanyu.html">关于我们</a>
                </li>
            </ul>
            <dl class="zc ov">
                <dt>
                    <a href="zhuce.html" class="reg">注册</a>
                </dt>
                <dd class="fl">
                    <a href="denglu.html" class="loginRobot">登录机器人系统</a>
                </dd>
                <dd class="fr">
                    <a href="denglu.html" class="loginKf">登录在线客服系统</a>
                </dd>
            </dl>
        </div>
        <script>
    window.onbeforeunload = function () """),format.raw/*233.41*/("""{"""),format.raw/*233.42*/("""
        """),format.raw/*234.9*/("""//刷新后页面自动回到顶部
        document.documentElement.scrollTop = 0; //ie下
        document.body.scrollTop = 0; //非ie
    """),format.raw/*237.5*/("""}"""),format.raw/*237.6*/("""

  """),format.raw/*239.3*/("""</script>
        <script>
    $(document).ready(function () """),format.raw/*241.35*/("""{"""),format.raw/*241.36*/("""
        """),format.raw/*242.9*/("""var navtop = $(".header").offset().top;
        $(window).scroll(function () """),format.raw/*243.38*/("""{"""),format.raw/*243.39*/("""
            """),format.raw/*244.13*/("""var t = $(window).scrollTop();
            if (t > navtop) """),format.raw/*245.29*/("""{"""),format.raw/*245.30*/("""
                """),format.raw/*246.17*/("""$(".header").addClass("bg");
            """),format.raw/*247.13*/("""}"""),format.raw/*247.14*/(""" """),format.raw/*247.15*/("""else """),format.raw/*247.20*/("""{"""),format.raw/*247.21*/("""
                """),format.raw/*248.17*/("""$(".header").removeClass("bg");
            """),format.raw/*249.13*/("""}"""),format.raw/*249.14*/("""
        """),format.raw/*250.9*/("""}"""),format.raw/*250.10*/(""")
    """),format.raw/*251.5*/("""}"""),format.raw/*251.6*/(""");

  </script>
        <script>
    $(document).ready(function () """),format.raw/*255.35*/("""{"""),format.raw/*255.36*/("""
        """),format.raw/*256.9*/("""$(".sav").click(function () """),format.raw/*256.37*/("""{"""),format.raw/*256.38*/("""
            """),format.raw/*257.13*/("""$(".xia").toggleClass("dis")
            $(".header").toggleClass("kk")
        """),format.raw/*259.9*/("""}"""),format.raw/*259.10*/(""");
        $(".xia p").click(function () """),format.raw/*260.39*/("""{"""),format.raw/*260.40*/("""
            """),format.raw/*261.13*/("""$(".xia dl").toggleClass("dis")
        """),format.raw/*262.9*/("""}"""),format.raw/*262.10*/(""");
    """),format.raw/*263.5*/("""}"""),format.raw/*263.6*/(""");

  </script>

            <!--banner-->
        <div class="banner ov">
            <div class="tu">
                <img src="images/banner.png" />
            </div>
            <div class="tu01">
                <img src="images/wapbanner.png" />
            </div>
            <div class="wen ov">
                <p>
                    <strong>
                        <img src="images/bz01.png" />
                    </strong>
                    <a>
                        <img src="images/bm.png" />
                    </a>
                    <strong>
                        <img src="images/bz.png" />
                    </strong>
                </p>
                <span>让机器和人自然地交流</span>
                <b>
                    <strong>
                        <a href="zhuce.html" class="tiyan">立即体验</a>
                    </strong>
                    <em>
                        <a href="javascript:;" onclick="chatBotShow()">马上咨询</a>
                    </em>
                </b>
            </div>
        </div>

            <!--我们的产品-->
        <div class="pbox ov">
            <div class="title ov">
                <span>我们的产品</span>
                <p>
                    <b></b>
                    <a>our products</a>
                    <b></b>
                </p>
            </div>
            <div class="pro ov">
                <ul>
                    <li>
                        <div>
                            <strong>
                                <img src="images/p01.png" />
                            </strong>
                            <span>智能机器人</span>
                            <p>意图识别、多轮会话、上下文理解
                                <br />知识库智能学习等多项核心优势</p>
                            <a href="duihua.html">了解更多</a>
                        </div>
                    </li>
                    <li>
                        <div>
                            <strong>
                                <img src="images/p02.png" />
                            </strong>
                            <span>在线客服系统</span>
                            <p>人机智能结合，全渠道一站式接入
                                <br /> 人工效率提升200%</p>
                            <a href="zaixian.html">了解更多</a>
                        </div>
                    </li>
                    <li>
                        <div>
                            <strong>
                                <img src="images/p03.png" />
                            </strong>
                            <span>奇智大数据</span>
                            <p>多维度数据报表,对业务情况
                                <br />客户反馈和客服绩效了如指掌</p>
                            <a href="shuju.html">了解更多</a>
                        </div>
                    </li>
                    <li>
                        <div>
                            <strong>
                                <img src="images/p04.png" />
                            </strong>
                            <span>工单系统</span>
                            <p>机器人自动收集信息并创建工单
                                <br /> 及时响应客户需求</p>
                            <a href="gongdan.html">了解更多</a>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="contentwrap ov">
                <div class="swiper-container">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide">
                            <div>
                                <strong>
                                    <img src="images/p01.png" />
                                </strong>
                                <span>智能机器人</span>
                                <h1>意图识别、多轮会话、上下文理解、知识库智能学习等多项核心优势</h1>
                                <a href="duihua.html">了解更多</a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div>
                                <strong>
                                    <img src="images/p02.png" />
                                </strong>
                                <span>在线客服系统</span>
                                <h1>人机智能结合，全渠道一站式接入 人工效率提升200%</h1>
                                <a href="zaixian.html">了解更多</a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div>
                                <strong>
                                    <img src="images/p03.png" />
                                </strong>
                                <span>奇智大数据</span>
                                <h1>多维度数据报表,对业务情况、客户反馈和客服绩效了如指掌</h1>
                                <a href="shuju.html">了解更多</a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div>
                                <strong>
                                    <img src="images/p04.png" />
                                </strong>
                                <span>工单系统</span>
                                <h1>机器人自动收集信息并创建工单, 及时响应客户需求</h1>
                                <a href="gongdan.html">了解更多</a>
                            </div>
                        </div>
                    </div>
                        <!-- Add Pagination -->
                    <div class="swiper-pagination"></div>
                </div>
            </div>

            <script src="js/swiper.min.js"></script>
            <script>
      var swiper = new Swiper('.contentwrap .swiper-container', """),format.raw/*408.65*/("""{"""),format.raw/*408.66*/("""
          """),format.raw/*409.11*/("""pagination: '.contentwrap .swiper-pagination',
          slidesPerView: 'auto',
          centeredSlides: true,
          paginationClickable: true,
          spaceBetween: 30
      """),format.raw/*414.7*/("""}"""),format.raw/*414.8*/(""");

    </script>
        </div>

            <!--多渠道支持-->
        <div class="dbox ov">
            <div class="title ov">
                <span>多渠道支持</span>
                <p>
                    <b></b>
                    <a>Multi-channel support</a>
                    <b></b>
                </p>
            </div>
            <div class="duo ov">
                <ul>
                    <li>
                        <strong>
                            <img src="images/d01.png" />
                        </strong>
                        <span>移动APP</span>
                    </li>
                    <li>
                        <strong>
                            <img src="images/d02.png" />
                        </strong>
                        <span>微信公众号</span>
                    </li>
                    <li>
                        <strong>
                            <img src="images/d03.png" />
                        </strong>
                        <span>微博</span>
                    </li>
                    <li>
                        <strong>
                            <img src="images/d04.png" />
                        </strong>
                        <span>桌面网站</span>
                    </li>
                    <li>
                        <strong>
                            <img src="images/d05.png" />
                        </strong>
                        <span>移动网站</span>
                    </li>
                    <li>
                        <strong>
                            <img src="images/d06.png" />
                        </strong>
                        <span>微信群</span>
                    </li>
                    <li>
                        <strong>
                            <img src="images/d07.png" />
                        </strong>
                        <span>小程序</span>
                    </li>
                    <li>
                        <strong>
                            <img src="images/d08.png" />
                        </strong>
                        <span>接口对接</span>
                    </li>
                </ul>
            </div>
        </div>

            <!--特色功能-->
        <div class="tbox ov">
            <div class="title ov">
                <span>特色功能</span>
                <p>
                    <b></b>
                    <a>Special feature</a>
                    <b></b>
                </p>
            </div>
            <div id="tab">
                <div class="tab_menu">
                    <ul>
                        <li class="selected">
                            <a>意图识别</a>
                        </li>
                        <li>
                            <a>多轮对话</a>
                        </li>
                        <li>
                            <a>知识库学习</a>
                        </li>
                        <li>
                            <a>智慧坐席</a>
                        </li>
                        <li>
                            <a>全语音交互</a>
                        </li>
                        <li>
                            <a>机器人协同</a>
                        </li>

                    </ul>
                </div>
                <div class="tab_box">
                    <div class="box ">
                        <div class="tu ov">
                            <a href="javascript:;">
                                <img src="images/t06.png" />
                            </a>
                        </div>
                        <div class="wen ov">
                            <span>意图识别</span>
                            <p>基于前沿神经网络技术,在亿万级数据集上训练得到的意图识别模型，能够自动抽取用户问句中的时间,地点,人名等关键性信息,自动识别同一个意思的不同问法,正确理解客户的意图</p>

                        </div>
                    </div>
                    <div class="box hide">
                        <div class="tu ov">
                            <a href="javascript:;">
                                <img src="images/t02.png" />
                            </a>
                        </div>
                        <div class="wen ov">
                            <span>多轮对话</span>
                            <p>基于RNN技术的多轮会话模型,业内独创多轮会话定制工具,用户只需要在后台绘制业务逻辑,即可自主定制多轮会话。具有流畅的交互效果，支持对接业务接口、一次性输入多个信息、中途打断、修改等复杂逻辑。</p>
                            <a href="duolun.html">了解更多</a>
                        </div>
                    </div>
                    <div class="box hide">
                        <div class="tu ov">
                            <a href="javascript:;">
                                <img src="images/t03.png" />
                            </a>
                        </div>
                        <div class="wen ov">
                            <span>知识库学习</span>
                            <p>业内独有知识库智能学习技术,机器人可以自动从历史聊天记录中发现和总结知识点, 大大降低人工编写知识库的工作知识库智能学习</p>
                            <a href="zhishi.html">了解更多</a>
                        </div>
                    </div>
                    <div class="box hide">
                        <div class="tu ov">
                            <a href="javascript:;">
                                <img src="images/t01.png" />
                            </a>
                        </div>
                        <div class="wen ov">
                            <span>智慧坐席</span>
                            <p>机器人解决85%以上的简单、常见问题，疑难问题自动转人工，人工接待时机器人进行智能辅助，实时推荐问题标准答案，大大提升客服接待效率和质量</p>
                            <a href="zaixian.html">了解更多</a>
                        </div>
                    </div>


                    <div class="box hide">
                        <div class="tu ov">
                            <a href="javascript:;">
                                <img src="images/t04.png" />
                            </a>
                        </div>
                        <div class="wen ov">
                            <span>全语音交互</span>
                            <p>当移动端用户不方便打字时，可以直接语音输入，系统自动将语音识别为文字，推送给机器人或人工客服，客服可以根据识别出的文字快速地进行回复</p>

                        </div>
                    </div>
                    <div class="box hide">
                        <div class="tu ov">
                            <a href="javascript:;">
                                <img src="images/t05.png" />
                            </a>
                        </div>
                        <div class="wen ov">
                            <span>机器人协同</span>
                            <p>集团型客户可以按部门、业务等需求创建不同的机器人，来服务不同渠道的用户。机器人与机器人之间共享基础知识库，部门间可以通过分工协作来共同维护知识库</p>

                        </div>
                    </div>

                </div>
                <div class="tab_menus">
                    <ul>
                        <li class="sel"></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
            </div>

                <!--手机端-->
            <div class="swiper ov">
                <div class="tab_menu">
                    <ul>
                        <li class="selected">
                            <a>智慧坐席</a>
                        </li>
                        <li>
                            <a>多轮对话</a>
                        </li>
                        <li>
                            <a>知识库学习</a>
                        </li>
                        <li>
                            <a>全语音交互</a>
                        </li>
                        <li>
                            <a>多机器人协同</a>
                        </li>
                        <li>
                            <a>意图识别</a>
                        </li>
                    </ul>
                </div>
                <div class="swiper-container">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide">
                            <div class="tu ov" style="height: auto!important;">
                                <a href="javascript:;">
                                    <img src="images/t01.png" />
                                </a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div class="tu ov" style="height: auto!important;">
                                <a href="javascript:;">
                                    <img src="images/t02.png" />
                                </a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div class="tu ov" style="height: auto!important;">
                                <a href="javascript:;">
                                    <img src="images/t03.png" />
                                </a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div class="tu ov" style="height: auto!important;">
                                <a href="javascript:;">
                                    <img src="images/t04.png" />
                                </a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div class="tu ov" style="height: auto!important;">
                                <a href="javascript:;">
                                    <img src="images/t05.png" />
                                </a>
                            </div>
                        </div>
                        <div class="swiper-slide">
                            <div class="tu ov" style="height: auto!important;">
                                <a href="javascript:;">
                                    <img src="images/t06.png" />
                                </a>
                            </div>
                        </div>
                    </div>
                        <!-- Add Pagination -->
                    <div class="swiper-pagination"></div>
                </div>

                    <!-- Initialize Swiper -->
                <script>
        $(function () """),format.raw/*681.23*/("""{"""),format.raw/*681.24*/("""
            """),format.raw/*682.13*/("""var mySwiper = new Swiper('.swiper .swiper-container', """),format.raw/*682.68*/("""{"""),format.raw/*682.69*/("""

                """),format.raw/*684.17*/("""pagination: '.swiper .swiper-pagination',
                paginationClickable: true,
                onTransitionEnd: function (swiper) """),format.raw/*686.52*/("""{"""),format.raw/*686.53*/("""
                    """),format.raw/*687.21*/("""$('.swiper .tab_menu li').eq(mySwiper.activeIndex).addClass('selected').siblings().removeClass(
                            'selected');
                """),format.raw/*689.17*/("""}"""),format.raw/*689.18*/("""
            """),format.raw/*690.13*/("""}"""),format.raw/*690.14*/(""")
            $('.swiper .tab_menu li').click(function () """),format.raw/*691.57*/("""{"""),format.raw/*691.58*/("""
                """),format.raw/*692.17*/("""$(this).addClass('selected').siblings().removeClass('selected');
                mySwiper.slideTo($(this).index(), 1000)
            """),format.raw/*694.13*/("""}"""),format.raw/*694.14*/(""");
        """),format.raw/*695.9*/("""}"""),format.raw/*695.10*/(""")

      </script>
            </div>
        </div>

        <script>
    $(function () """),format.raw/*702.19*/("""{"""),format.raw/*702.20*/("""
        """),format.raw/*703.9*/("""//定义一个变量用来记录li宽度的累加值
        var sumWidth = 0;

        //假设$("li")返回的就是这3个li
        $("#tab .tab_menu li").each(function () """),format.raw/*707.49*/("""{"""),format.raw/*707.50*/("""
            """),format.raw/*708.13*/("""sumWidth += $(this).width();
        """),format.raw/*709.9*/("""}"""),format.raw/*709.10*/(""");

        $("#tab .tab_menu ul").width(sumWidth);
    """),format.raw/*712.5*/("""}"""),format.raw/*712.6*/(""");

  </script>


        <script type="text/javascript">
    $(document).ready(function () """),format.raw/*718.35*/("""{"""),format.raw/*718.36*/("""
        """),format.raw/*719.9*/("""var $tab_li = $('#tab .tab_menu li');
        $tab_li.click(function () """),format.raw/*720.35*/("""{"""),format.raw/*720.36*/("""
            """),format.raw/*721.13*/("""$(this).addClass('selected').siblings().removeClass('selected');
            var index = $tab_li.index(this);
            $('.tab_box .box').eq(index).show().siblings().hide();
            $('.tab_menus li').eq(index).addClass('sel').siblings().removeClass('sel');
        """),format.raw/*725.9*/("""}"""),format.raw/*725.10*/(""");
    """),format.raw/*726.5*/("""}"""),format.raw/*726.6*/(""");

  </script>

            <!--特色功能-->
        <div class="ybox ov">
            <div class="title ov">
                <span>我们的优势</span>
                <p>
                    <b></b>
                    <a>Our advantage</a>
                    <b></b>
                </p>
            </div>
            <div class="you ov">
                <ul>
                    <div class="ov">
                        <li>
                            <strong>
                                <img src="images/y01.png" />
                            </strong>
                            <p>
                                <span>强大的技术实力</span>
                                <a>团队源自清华技术团队掌握了最前沿的深度学习技术，98%问答准确率且行业领先。出众的语义理解力，强大的泛化能力。拥有数十项技术专利。</a>
                            </p>
                        </li>
                        <li>
                            <strong>
                                <img src="images/y02.png" />
                            </strong>
                            <p>
                                <span>7*24小时快速响应</span>
                                <a>每个客户都配备专属的客服经理，直接对接客户的一切问题，后方更有专门的技术团队随时待命，快速响应客户的问题和需求。</a>
                            </p>
                        </li>
                    </div>
                    <div class="ov">
                        <li>
                            <strong>
                                <img src="images/y03.png" />
                            </strong>
                            <p>
                                <span>可靠的系统稳定性</span>
                                <a>整套系统采用无状态和异步非阻塞设计，服务器以分布式集群方式部署，具有极高的并发处理能力和系统稳定性。</a>
                            </p>
                        </li>
                        <li>
                            <strong>
                                <img src="images/y04.png" />
                            </strong>
                            <p>
                                <span>高级别的数据安全性</span>
                                <a>系统架构上针对所有数据库都创建副本集（Replica Server），物理上采用两地三中心的灾备方案，实现对客户数据的多重保护</a>
                            </p>
                        </li>
                    </div>
                </ul>
            </div>
        </div>

            <!--共同选择-->
        <div class="sec">
            <div class="xbox ov">
                <div class="title ov">
                    <span>30000+家客户的共同选择</span>
                    <p>
                        <b></b>
                        <a>30000+customers'commonchoice</a>
                        <b></b>
                    </p>
                </div>
                <ul class="xx ov">
                    <li>
                        <span>
                            <img src="images/zgpa.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/gfzq.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/hb.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/lkl.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/58.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/ge.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/zgcyh.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/lnzxyh.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/qhzx.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/msyd.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/ntzt.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/xm.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/shash.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/lv.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/51.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/sqdt.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/zgkt.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/szsm.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/hd.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/zdk.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/ga.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/hdjy.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/jyjy.png" />
                        </span>
                    </li>
                    <li>
                        <span>
                            <img src="images/caft.png" />
                        </span>
                    </li>

                </ul>
            </div>
        </div>
            <!-- 新闻模块 -->
        <div class="tbox ov newsBox">
            <div class="title ov">
                <span>新闻动态</span>
                <p>
                    <b></b>
                    <a>NEWS REPORT</a>
                    <b></b>
                </p>
            </div>
            <div class="newsList">
                <div class="newsType">
                    <div class="newsHead">
                        <div class="headImg hyxw"></div>
                        <div class="heading">行业新闻</div>
                    </div>
                    <div class="news">
                        <ul class="newsUl">
                            """),_display_(/*940.30*/for(n <- news.filter(_.category.getOrElse("") == "industry").take(5)) yield /*940.99*/{_display_(Seq[Any](format.raw/*940.100*/("""
                                """),format.raw/*941.33*/("""<li>
                                    <span class="point"></span>
                                    <span class="newsTitle">
                                        <a title=""""),_display_(/*944.52*/{n.title}),format.raw/*944.61*/("""" href="news-"""),_display_(/*944.75*/{n._id}),format.raw/*944.82*/(""".html">"""),_display_(/*944.90*/n/*944.91*/.title),format.raw/*944.97*/("""</a>
                                    </span>
                                    <span class="pushTime">"""),_display_(/*946.61*/utils/*946.66*/.DateTimeUtil.toString(n.updateTime, "MM-dd")),format.raw/*946.111*/("""</span>
                                </li>
                            """)))}),format.raw/*948.30*/("""
                        """),format.raw/*949.25*/("""</ul>
                    </div>
                </div>
                <div class="newsType">
                    <div class="newsHead">
                        <div class="headImg cydt"></div>
                        <div class="heading">产品动态</div>
                    </div>
                    <div class="news">
                        <ul class="newsUl">
                        """),_display_(/*959.26*/for(n <- news.filter(_.category.getOrElse("") == "productDynamic").take(5)) yield /*959.101*/{_display_(Seq[Any](format.raw/*959.102*/("""
                            """),format.raw/*960.29*/("""<li>
                                <span class="point"></span>
                                <span class="newsTitle">
                                    <a title=""""),_display_(/*963.48*/{n.title}),format.raw/*963.57*/("""" href="news-"""),_display_(/*963.71*/{n._id}),format.raw/*963.78*/(""".html">"""),_display_(/*963.86*/n/*963.87*/.title),format.raw/*963.93*/("""</a>
                                </span>
                                <span class="pushTime">"""),_display_(/*965.57*/utils/*965.62*/.DateTimeUtil.toString(n.updateTime, "MM-dd")),format.raw/*965.107*/("""</span>
                            </li>
                        """)))}),format.raw/*967.26*/("""
                        """),format.raw/*968.25*/("""</ul>
                    </div>
                </div>
                <div class="newsType">
                    <div class="newsHead">
                        <div class="headImg kfal"></div>
                        <div class="heading">客户案例</div>
                    </div>
                    <div class="news">
                        <ul class="newsUl">
                        """),_display_(/*978.26*/for(n <- news.filter(_.category.getOrElse("") == "customerCase").take(5)) yield /*978.99*/{_display_(Seq[Any](format.raw/*978.100*/("""
                            """),format.raw/*979.29*/("""<li>
                                <span class="point"></span>
                                <span class="newsTitle">
                                    <a title=""""),_display_(/*982.48*/{n.title}),format.raw/*982.57*/("""" href="news-"""),_display_(/*982.71*/{n._id}),format.raw/*982.78*/(""".html">"""),_display_(/*982.86*/n/*982.87*/.title),format.raw/*982.93*/("""</a>
                                </span>
                                <span class="pushTime">"""),_display_(/*984.57*/utils/*984.62*/.DateTimeUtil.toString(n.updateTime, "MM-dd")),format.raw/*984.107*/("""</span>
                            </li>
                        """)))}),format.raw/*986.26*/("""
                        """),format.raw/*987.25*/("""</ul>
                    </div>
                </div>
            </div>
        </div>
            <!--免费试用-->
        <div class="mbox mt ov">
            <div class="title ov">
                <span>立即开通奇智机器人，免费试用全部功能</span>
                <p>
                    <b></b>
                    <a>free trial all features</a>
                    <b></b>
                </p>
            </div>
            <div class="title01 ov">
                <span>立即开通奇智机器人
                    <br />免费试用全部功能</span>
                <p>
                    <b></b>
                    <a>free trial all features</a>
                    <b></b>
                </p>
            </div>

            <div class="sbox ov">
                <strong>
                    <img src="images/tel.jpg" />
                </strong>
                <p>
                    <input type="text" placeholder="请输入您的手机号..." id="phoneNum" />
                </p>
                <span>
                    <input type="button" value="免费试用" class="freeUse" />
                </span>
            </div>
        </div>

            <!--[if lt IE 9]>
<script type="text/javascript">
    $(document).ready(function() """),format.raw/*1027.34*/("""{"""),format.raw/*1027.35*/("""
        """),format.raw/*1028.9*/("""// val()无参数是取值，有参数是设置
        // 为了更好的兼容性，将下面的val()设置与input中的placeholder的值设置相同
        $(".sbox p input").val("请输入您的手机号...");
        textFill($('input.text1'));

    """),format.raw/*1033.5*/("""}"""),format.raw/*1033.6*/(""");

    function textFill(input) """),format.raw/*1035.30*/("""{"""),format.raw/*1035.31*/("""
        """),format.raw/*1036.9*/("""var originalvalue = input.val();
        input.focus(function() """),format.raw/*1037.32*/("""{"""),format.raw/*1037.33*/("""
            """),format.raw/*1038.13*/("""if ($.trim(input.val()) == originalvalue) """),format.raw/*1038.55*/("""{"""),format.raw/*1038.56*/("""
                """),format.raw/*1039.17*/("""input.val('');
            """),format.raw/*1040.13*/("""}"""),format.raw/*1040.14*/("""
        """),format.raw/*1041.9*/("""}"""),format.raw/*1041.10*/(""");
        input.blur(function() """),format.raw/*1042.31*/("""{"""),format.raw/*1042.32*/("""
            """),format.raw/*1043.13*/("""if ($.trim(input.val()) == '') """),format.raw/*1043.44*/("""{"""),format.raw/*1043.45*/("""
                """),format.raw/*1044.17*/("""input.val(originalvalue);
            """),format.raw/*1045.13*/("""}"""),format.raw/*1045.14*/("""
        """),format.raw/*1046.9*/("""}"""),format.raw/*1046.10*/(""");
    """),format.raw/*1047.5*/("""}"""),format.raw/*1047.6*/("""
    """),format.raw/*1048.5*/("""</script>
<![endif]-->

            <!--foot-->
        <div class="footer ov">
            <div class="foot ov">
                <div class="logo fl">
                    <img src="images/logo.png" />
                </div>
                <div class="xw fl">
                    <ul>
                        <li>
                            <a href="https://weibo.com/p/1005055792483262/" target="_blank">
                                <img src="images/fb03.png" />
                            </a>
                        </li>
                        <li class="on">
                            <a>
                                <img src="images/fb02.png" />
                            </a>
                            <p>
                                <img src="images/wx.jpg" />
                            </p>
                        </li>
                        <li>
                            <a href="https://shang.qq.com/wpa/qunwpa?idkey=c54b25c8520c54afb7d9125f4e1cd50e86c4d50ddff1dd92a4d060d3b1df6c4e" alt="奇智机器人官方QQ群"
                            title="官方QQ群: 476248184" target="_blank">
                                <img src="images/fb01.png" />
                            </a>
                        </li>
                    </ul>
                </div>
                <ul class="lx fl">
                    <li>
                        <strong>
                            <img src="images/f01.png" />
                        </strong>
                        <p>
                            <a href="tel:400-604-5033" title="" style="color: white;">电话: 400-604-5033</a>
                        </p>
                    </li>
                    <li>
                        <strong>
                            <img src="images/f02.png" />
                        </strong>
                        <p>商务合作: market@chatbot.cn</p>
                    </li>
                    <li>
                        <strong>
                            <img src="images/f03.png" />
                        </strong>
                        <p>技术支持: support@chatbot.cn</p>
                    </li>
                    <li>
                        <strong>
                            <img src="images/f04.png" />
                        </strong>
                        <p>公司地址:上海市浦东新区祖冲之路1559号创意大厦7001</p>
                    </li>
                </ul>
                <dl class="nav fl">
                    <dt>
                        <a href="duihua.html">产品</a>
                        <a href="jishu.html">技术优势</a>
                        <a href="jiage.html">价格</a>
                        <a href="anli.html">案例</a>
                        <a href="yanshi.html">演示</a>
                        <a href="dongtai.html">动态</a>
                        <a href="guanyu.html">关于我们</a>
                    </dt>
                    <dd>
                        <span>
                            <a href="anli.html">客户案例</a>
                        </span>
                        <p>
                            <a href="anli.html?key=lkl">
                                <img src="images/c01.png" />
                            </a>
                        </p>
                        <p>
                            <a href="anli.html?key=ge">
                                <img src="images/footer-ge.png" />
                            </a>
                        </p>
                        <p>
                            <a href="anli.html?key=58">
                                <img src="images/footer-58.png" />
                            </a>
                        </p>
                        <p>
                            <a href="anli.html?key=zgcyh">
                                <img src="images/footer-zgcyh.png" />
                            </a>
                        </p>
                    </dd>
                </dl>
                <div class="bottom fl">
                    <p>奇智机器人-专业的人机智能交互解决方案提供商</p>
                    <span>Copyright@2017 上海八斗智能技术有限公司 | 沪ICP备17004486号-1|</span>
                </div>
            </div>
        </div>

        <script src="./js/main.js" charset="utf-8"></script>
        <script src='//cloud.chatbot.cn/cloud/robot/webjs/5b3c47952400008a1b1f05c3' language="JavaScript"></script>
        <script>
    $(document).ready(function()"""),format.raw/*1154.33*/("""{"""),format.raw/*1154.34*/("""
        """),format.raw/*1155.9*/("""$(".footer .on").click(function()"""),format.raw/*1155.42*/("""{"""),format.raw/*1155.43*/("""
            """),format.raw/*1156.13*/("""$(".footer .on p").toggleClass("dis")
        """),format.raw/*1157.9*/("""}"""),format.raw/*1157.10*/(""");
    """),format.raw/*1158.5*/("""}"""),format.raw/*1158.6*/(""");
</script>
            <!--百度统计-->
        <script>
    var _hmt = _hmt || [];
    (function () """),format.raw/*1163.18*/("""{"""),format.raw/*1163.19*/("""
        """),format.raw/*1164.9*/("""var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?c1ca7e2ebb1260ee586994702dcb5f5c";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    """),format.raw/*1168.5*/("""}"""),format.raw/*1168.6*/(""")();
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

</html>
"""))
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
                  SOURCE: E:/qizhi/qizhi-news/app/views/site/newsList.scala.html
                  HASH: c2335b2f4071ce4010beed07b1803d05a95493bc
                  MATRIX: 741->1|854->19|884->23|10469->9579|10499->9580|10537->9590|10683->9708|10712->9709|10746->9715|10838->9778|10868->9779|10906->9789|11013->9867|11043->9868|11086->9882|11175->9942|11205->9943|11252->9961|11323->10003|11353->10004|11383->10005|11417->10010|11447->10011|11494->10029|11568->10074|11598->10075|11636->10085|11666->10086|11701->10093|11730->10094|11830->10165|11860->10166|11898->10176|11955->10204|11985->10205|12028->10219|12138->10301|12168->10302|12239->10344|12269->10345|12312->10359|12381->10400|12411->10401|12447->10409|12476->10410|18271->16176|18301->16177|18342->16189|18557->16376|18586->16377|29088->26850|29118->26851|29161->26865|29245->26920|29275->26921|29324->26941|29491->27079|29521->27080|29572->27102|29756->27257|29786->27258|29829->27272|29859->27273|29947->27332|29977->27333|30024->27351|30188->27486|30218->27487|30258->27499|30288->27500|30413->27596|30443->27597|30481->27607|30640->27737|30670->27738|30713->27752|30779->27790|30809->27791|30896->27850|30925->27851|31052->27949|31082->27950|31120->27960|31222->28033|31252->28034|31295->28048|31600->28325|31630->28326|31666->28334|31695->28335|39356->35968|39442->36037|39483->36038|39546->36072|39758->36256|39789->36265|39831->36279|39860->36286|39896->36294|39907->36295|39935->36301|40074->36412|40089->36417|40157->36462|40266->36539|40321->36565|40745->36961|40838->37036|40879->37037|40938->37067|41138->37239|41169->37248|41211->37262|41240->37269|41276->37277|41287->37278|41315->37284|41446->37387|41461->37392|41529->37437|41630->37506|41685->37532|42109->37928|42199->38001|42240->38002|42299->38032|42499->38204|42530->38213|42572->38227|42601->38234|42637->38242|42648->38243|42676->38249|42807->38352|42822->38357|42890->38402|42991->38471|43046->38497|44299->39720|44330->39721|44369->39731|44570->39903|44600->39904|44665->39939|44696->39940|44735->39950|44830->40015|44861->40016|44905->40030|44977->40072|45008->40073|45056->40091|45114->40119|45145->40120|45184->40130|45215->40131|45279->40165|45310->40166|45354->40180|45415->40211|45446->40212|45494->40230|45563->40269|45594->40270|45633->40280|45664->40281|45701->40289|45731->40290|45766->40296|50241->44744|50272->44745|50311->44755|50374->44788|50405->44789|50449->44803|50525->44850|50556->44851|50593->44859|50623->44860|50756->44963|50787->44964|50826->44974|51088->45207|51118->45208
                  LINES: 21->1|26->1|28->3|258->233|258->233|259->234|262->237|262->237|264->239|266->241|266->241|267->242|268->243|268->243|269->244|270->245|270->245|271->246|272->247|272->247|272->247|272->247|272->247|273->248|274->249|274->249|275->250|275->250|276->251|276->251|280->255|280->255|281->256|281->256|281->256|282->257|284->259|284->259|285->260|285->260|286->261|287->262|287->262|288->263|288->263|433->408|433->408|434->409|439->414|439->414|706->681|706->681|707->682|707->682|707->682|709->684|711->686|711->686|712->687|714->689|714->689|715->690|715->690|716->691|716->691|717->692|719->694|719->694|720->695|720->695|727->702|727->702|728->703|732->707|732->707|733->708|734->709|734->709|737->712|737->712|743->718|743->718|744->719|745->720|745->720|746->721|750->725|750->725|751->726|751->726|965->940|965->940|965->940|966->941|969->944|969->944|969->944|969->944|969->944|969->944|969->944|971->946|971->946|971->946|973->948|974->949|984->959|984->959|984->959|985->960|988->963|988->963|988->963|988->963|988->963|988->963|988->963|990->965|990->965|990->965|992->967|993->968|1003->978|1003->978|1003->978|1004->979|1007->982|1007->982|1007->982|1007->982|1007->982|1007->982|1007->982|1009->984|1009->984|1009->984|1011->986|1012->987|1052->1027|1052->1027|1053->1028|1058->1033|1058->1033|1060->1035|1060->1035|1061->1036|1062->1037|1062->1037|1063->1038|1063->1038|1063->1038|1064->1039|1065->1040|1065->1040|1066->1041|1066->1041|1067->1042|1067->1042|1068->1043|1068->1043|1068->1043|1069->1044|1070->1045|1070->1045|1071->1046|1071->1046|1072->1047|1072->1047|1073->1048|1179->1154|1179->1154|1180->1155|1180->1155|1180->1155|1181->1156|1182->1157|1182->1157|1183->1158|1183->1158|1188->1163|1188->1163|1189->1164|1193->1168|1193->1168
                  -- GENERATED --
              */
          