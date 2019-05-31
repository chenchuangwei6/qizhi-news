
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Request[AnyContent],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: Request[AnyContent]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("系统登录", request)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<div class="row" style="margin-top: 100px;">
    <div class="col-md-offset-4 col-md-4">
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading"><h4>系统登录</h4></div>
            <div class="panel-body" style="padding-right: 0px;">
                <form id="form" action="/doLogin">
                    <div class="form-group">
                        <label>登录密码</label>
                        <input name="password" class="form-control" type="password" value=''>
                    </div>
                    <button class="btn btn-primary">立即登录</button>
                </form>
            </div>
        </div>
    </div>
</div>

""")))}),format.raw/*22.2*/("""

"""),format.raw/*24.1*/("""<script type="text/javascript" charset="utf-8">
</script>
"""))
      }
    }
  }

  def render(request:Request[AnyContent]): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (Request[AnyContent]) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 31 16:23:57 CST 2019
                  SOURCE: E:/qizhi/qizhi-news/app/views/login.scala.html
                  HASH: a8f601ed1689ba28ca60416f3b17a33f72378dbe
                  MATRIX: 742->1|878->42|908->47|937->68|976->70|1004->72|1755->793|1786->797
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|47->22|49->24
                  -- GENERATED --
              */
          