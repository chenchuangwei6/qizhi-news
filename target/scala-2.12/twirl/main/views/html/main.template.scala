
package views.html

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Request[AnyRef],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, request: Request[AnyRef])(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">

        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <!-- Bootstrap core CSS -->
        <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="/assets/css/main.css" rel="stylesheet">
        <script src="/assets/js/jquery.min.js"></script>
        <script src="/assets/js/bootstrap.min.js"></script>
    </head>

    <body>
        <!-- Fixed navbar -->
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid" style="font-size: 15px;">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="javascript:void(0);">新闻管理工具 v1.0</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="/">新闻列表</a></li>
                        <li><a href="/add">添加新闻</a></li>
                        <li><a href="/generateToFile">发布新闻</a></li>
                    </ul>
                </div><!--/.nav-collapse -->

            </div>
        </nav>

        <!-- Begin page content -->
        <div class="container-fluid">
          """),_display_(/*47.12*/content),format.raw/*47.19*/("""
        """),format.raw/*48.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,request:Request[AnyRef],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,request)(content)

  def f:((String,Request[AnyRef]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,request) => (content) => apply(title,request)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 31 16:23:57 CST 2019
                  SOURCE: E:/qizhi/qizhi-news/app/views/main.scala.html
                  HASH: a37d8b5b6df6bc53c6dfadb0d43e04f177c4a1a4
                  MATRIX: 749->1|900->57|930->61|1405->509|1431->514|3036->2092|3064->2099|3101->2109
                  LINES: 21->1|26->1|28->3|38->13|38->13|72->47|72->47|73->48
                  -- GENERATED --
              */
          