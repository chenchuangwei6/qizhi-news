
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

object msg extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Request[AnyContent],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msg: String)(implicit request: Request[AnyContent]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("提示消息", request)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<div class="row" style="margin-top: 100px;">
    <div class="col-md-offset-4 col-md-4">
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading"><h4>系统提示</h4></div>
            <div class="panel-body" style="padding-right: 0px;">
                """),_display_(/*10.18*/msg),format.raw/*10.21*/("""
            """),format.raw/*11.13*/("""</div>
        </div>
    </div>
</div>

""")))}),format.raw/*16.2*/("""

"""),format.raw/*18.1*/("""<script type="text/javascript" charset="utf-8">
</script>
"""))
      }
    }
  }

  def render(msg:String,request:Request[AnyContent]): play.twirl.api.HtmlFormat.Appendable = apply(msg)(request)

  def f:((String) => (Request[AnyContent]) => play.twirl.api.HtmlFormat.Appendable) = (msg) => (request) => apply(msg)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 31 16:23:57 CST 2019
                  SOURCE: E:/qizhi/qizhi-news/app/views/msg.scala.html
                  HASH: 8160437b66e83911b618356b21c87e6d31de7734
                  MATRIX: 747->1|894->53|924->58|953->79|992->81|1020->83|1368->404|1392->407|1434->421|1511->468|1542->472
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|35->10|35->10|36->11|41->16|43->18
                  -- GENERATED --
              */
          