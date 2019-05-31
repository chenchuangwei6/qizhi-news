
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[News],Int,Int,Boolean,Request[AnyContent],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(list: List[News], total: Int, page: Int, isRecommended: Boolean)(implicit request: Request[AnyContent]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.106*/("""

"""),_display_(/*3.2*/main("新闻列表", request)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<div class="row" style="margin-top: 15px;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading">
                <h4>新闻列表("""),_display_(/*9.27*/total),format.raw/*9.32*/(""")</h4>
                <form id="form" action="/" style="float: right;margin-top: -30px;">
                    <input id="look" type="checkbox" name="isRecommended" value="0"/>查看推荐新闻
                    <input type="hidden" name="page" value=""""),_display_(/*12.62*/{page}),format.raw/*12.68*/(""""/>
                </form>
            </div>
            <div class="panel-body" style="padding-right: 0px;">

            </div>
            <!-- Table -->
            <table class="table">
                <thead>
                <tr>
                    <th class="col-md-2">标题</th>
                    <th class="col-md-2">介绍</th>
                    <th class="col-md-2">更新时间</th>
                    <th class="col-md-2">创建时间</th>
                    <th class="col-md-2">分类</th>
                    <th class="col-md-2">操作</th>
                </tr>
                </thead>
                <tbody>
                """),_display_(/*31.18*/for(s <- list) yield /*31.32*/{_display_(Seq[Any](format.raw/*31.33*/("""
                """),format.raw/*32.17*/("""<tr>
                    <td style="padding-top: 12px;">
                        """),_display_(/*34.26*/s/*34.27*/.title),format.raw/*34.33*/("""
                    """),format.raw/*35.21*/("""</td>
                    <td>
                        """),_display_(/*37.26*/s/*37.27*/.intro),format.raw/*37.33*/("""
                    """),format.raw/*38.21*/("""</td>
                    <td>
                        """),_display_(/*40.26*/utils/*40.31*/.DateTimeUtil.toString(s.updateTime, "yyyy-MM-dd HH:mm")),format.raw/*40.87*/("""
                    """),format.raw/*41.21*/("""</td>
                    <td>
                        """),_display_(/*43.26*/utils/*43.31*/.DateTimeUtil.toString(s.createTime, "yyyy-MM-dd HH:mm")),format.raw/*43.87*/("""
                    """),format.raw/*44.21*/("""</td>
                    <td>
                    """),_display_(/*46.22*/if(s.category.getOrElse("") == "industry")/*46.64*/{_display_(Seq[Any](format.raw/*46.65*/("""
                        """),format.raw/*47.25*/("""行业新闻
                    """)))}/*48.23*/else/*48.28*/{_display_(Seq[Any](format.raw/*48.29*/("""
                        """),_display_(/*49.26*/if(s.category.getOrElse("") == "productDynamic")/*49.74*/{_display_(Seq[Any](format.raw/*49.75*/("""
                            """),format.raw/*50.29*/("""产品动态
                        """)))}/*51.27*/else/*51.32*/{_display_(Seq[Any](format.raw/*51.33*/("""
                            """),_display_(/*52.30*/if(s.category.getOrElse("") == "customerCase")/*52.76*/{_display_(Seq[Any](format.raw/*52.77*/("""
                                """),format.raw/*53.33*/("""客户案例
                            """)))}/*54.31*/else/*54.36*/{_display_(Seq[Any](format.raw/*54.37*/("""
                                """),format.raw/*55.33*/("""其他
                            """)))}),format.raw/*56.30*/("""
                        """)))}),format.raw/*57.26*/("""
                    """)))}),format.raw/*58.22*/("""
                    """),format.raw/*59.21*/("""</td>
                    <td>
                        <a  href="/edit?_id="""),_display_(/*61.46*/s/*61.47*/._id),format.raw/*61.51*/("""&isRecommended="""),_display_(/*61.67*/{isRecommended}),format.raw/*61.82*/("""&category="""),_display_(/*61.93*/{s.category.getOrElse("default")}),format.raw/*61.126*/("""&page="""),_display_(/*61.133*/{page}),format.raw/*61.139*/("""&isRecommendedEdit="""),_display_(/*61.159*/{s.isRecommended}),format.raw/*61.176*/("""" class="btn btn-default btn-xs" >编辑</a>
                        <a  href="/remove?_id="""),_display_(/*62.48*/s/*62.49*/._id),format.raw/*62.53*/("""&isRecommended="""),_display_(/*62.69*/{isRecommended}),format.raw/*62.84*/("""" class="btn btn-default btn-xs">删除</a>
                        """),_display_(/*63.26*/if(!s.isRecommended.getOrElse(false))/*63.63*/{_display_(Seq[Any](format.raw/*63.64*/("""
                            """),format.raw/*64.29*/("""<a  href="/recommended?_id="""),_display_(/*64.57*/s/*64.58*/._id),format.raw/*64.62*/("""&isRecommendedc=true&page="""),_display_(/*64.89*/{page}),format.raw/*64.95*/("""&isRecommended="""),_display_(/*64.111*/{isRecommended}),format.raw/*64.126*/("""" class="btn btn-default btn-xs">设为推荐</a>
                        """)))}),format.raw/*65.26*/("""
                        """),_display_(/*66.26*/if(s.isRecommended.getOrElse(false))/*66.62*/{_display_(Seq[Any](format.raw/*66.63*/("""
                            """),format.raw/*67.29*/("""<a  href="/recommended?_id="""),_display_(/*67.57*/s/*67.58*/._id),format.raw/*67.62*/("""&isRecommendedc=false&page="""),_display_(/*67.90*/{page}),format.raw/*67.96*/("""&isRecommended="""),_display_(/*67.112*/{isRecommended}),format.raw/*67.127*/("""" class="btn btn-default btn-xs" style="color: red;">取消推荐</a>
                        """)))}),format.raw/*68.26*/("""
                    """),format.raw/*69.21*/("""</td>
                </tr>
                """)))}),format.raw/*71.18*/("""
                """),format.raw/*72.17*/("""</tbody>
            </table>
            <ul class="pagination  pagination-sm pull-right" style="margin-top:0px; margin-right:0px; margin-bottom:0px;">
                <li><a href="/?page="""),_display_(/*75.38*/{page - 1}),format.raw/*75.48*/("""&isRecommended="""),_display_(/*75.64*/{isRecommended}),format.raw/*75.79*/("""" """),_display_(/*75.82*/if(page <= 1)/*75.95*/{_display_(Seq[Any](format.raw/*75.96*/("""class="btn disabled"""")))}),format.raw/*75.117*/(""">&laquo; 上一页</a></li>
                <li><a href="javascript:void(0);">"""),_display_(/*76.52*/if(list.nonEmpty)/*76.69*/{_display_(Seq[Any](format.raw/*76.70*/(""" """),_display_(/*76.72*/{page + "/" + math.ceil(total/15.0).toInt + s"($total)"}),format.raw/*76.128*/(""" """)))}/*76.130*/else/*76.134*/{_display_(Seq[Any](format.raw/*76.135*/("""-""")))}),format.raw/*76.137*/("""</a></li>
                <li><a href="/?page="""),_display_(/*77.38*/{page + 1}),format.raw/*77.48*/("""&isRecommended="""),_display_(/*77.64*/{isRecommended}),format.raw/*77.79*/("""" """),_display_(/*77.82*/if(page >= math.ceil(total/15.0).toInt)/*77.121*/{_display_(Seq[Any](format.raw/*77.122*/("""class="btn disabled"""")))}),format.raw/*77.143*/(""">下一页 &raquo;</a></li>
            </ul>
        </div>
    </div>
</div>

""")))}),format.raw/*83.2*/("""

"""),format.raw/*85.1*/("""<script type="text/javascript" charset="utf-8">
    $(function () """),format.raw/*86.19*/("""{"""),format.raw/*86.20*/("""
        """),format.raw/*87.9*/("""var i = """),_display_(/*87.18*/isRecommended),format.raw/*87.31*/("""
        """),format.raw/*88.9*/("""if(i)"""),format.raw/*88.14*/("""{"""),format.raw/*88.15*/("""
            """),format.raw/*89.13*/("""$("#look").attr('checked',true);
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
        """),format.raw/*91.9*/("""$("#look").click(function()"""),format.raw/*91.36*/("""{"""),format.raw/*91.37*/("""
            """),format.raw/*92.13*/("""if($(this).is(':checked'))"""),format.raw/*92.39*/("""{"""),format.raw/*92.40*/("""
                """),format.raw/*93.17*/("""$(this).val(1);
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""else """),format.raw/*94.19*/("""{"""),format.raw/*94.20*/("""
                """),format.raw/*95.17*/("""$(this).val(0);
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/("""
            """),format.raw/*97.13*/("""$("#form").submit();
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/(""");
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/(""");
</script>
"""))
      }
    }
  }

  def render(list:List[News],total:Int,page:Int,isRecommended:Boolean,request:Request[AnyContent]): play.twirl.api.HtmlFormat.Appendable = apply(list,total,page,isRecommended)(request)

  def f:((List[News],Int,Int,Boolean) => (Request[AnyContent]) => play.twirl.api.HtmlFormat.Appendable) = (list,total,page,isRecommended) => (request) => apply(list,total,page,isRecommended)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 31 16:23:57 CST 2019
                  SOURCE: E:/qizhi/qizhi-news/app/views/index.scala.html
                  HASH: 233e09996d1f35d82d6bff7e2b8f8a6e645441de
                  MATRIX: 769->1|969->105|999->110|1028->131|1067->133|1095->135|1350->364|1375->369|1649->616|1676->622|2346->1265|2376->1279|2415->1280|2461->1298|2572->1382|2582->1383|2609->1389|2659->1411|2744->1469|2754->1470|2781->1476|2831->1498|2916->1556|2930->1561|3007->1617|3057->1639|3142->1697|3156->1702|3233->1758|3283->1780|3364->1834|3415->1876|3454->1877|3508->1903|3554->1931|3567->1936|3606->1937|3660->1964|3717->2012|3756->2013|3814->2043|3864->2075|3877->2080|3916->2081|3974->2112|4029->2158|4068->2159|4130->2193|4184->2229|4197->2234|4236->2235|4298->2269|4362->2302|4420->2329|4474->2352|4524->2374|4629->2452|4639->2453|4664->2457|4707->2473|4743->2488|4781->2499|4836->2532|4871->2539|4899->2545|4947->2565|4986->2582|5102->2671|5112->2672|5137->2676|5180->2692|5216->2707|5309->2773|5355->2810|5394->2811|5452->2841|5507->2869|5517->2870|5542->2874|5596->2901|5623->2907|5667->2923|5704->2938|5803->3006|5857->3033|5902->3069|5941->3070|5999->3100|6054->3128|6064->3129|6089->3133|6144->3161|6171->3167|6215->3183|6252->3198|6371->3286|6421->3308|6499->3355|6545->3373|6765->3566|6796->3576|6839->3592|6875->3607|6905->3610|6927->3623|6966->3624|7019->3645|7120->3719|7146->3736|7185->3737|7214->3739|7292->3795|7314->3797|7328->3801|7368->3802|7402->3804|7477->3852|7508->3862|7551->3878|7587->3893|7617->3896|7666->3935|7706->3936|7759->3957|7870->4038|7901->4042|7996->4109|8025->4110|8062->4120|8098->4129|8132->4142|8169->4152|8202->4157|8231->4158|8273->4172|8342->4214|8371->4215|8408->4225|8463->4252|8492->4253|8534->4267|8588->4293|8617->4294|8663->4312|8720->4341|8749->4342|8782->4347|8811->4348|8857->4366|8914->4395|8943->4396|8985->4410|9042->4440|9071->4441|9106->4449|9134->4450
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|34->9|34->9|37->12|37->12|56->31|56->31|56->31|57->32|59->34|59->34|59->34|60->35|62->37|62->37|62->37|63->38|65->40|65->40|65->40|66->41|68->43|68->43|68->43|69->44|71->46|71->46|71->46|72->47|73->48|73->48|73->48|74->49|74->49|74->49|75->50|76->51|76->51|76->51|77->52|77->52|77->52|78->53|79->54|79->54|79->54|80->55|81->56|82->57|83->58|84->59|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|87->62|87->62|87->62|87->62|87->62|88->63|88->63|88->63|89->64|89->64|89->64|89->64|89->64|89->64|89->64|89->64|90->65|91->66|91->66|91->66|92->67|92->67|92->67|92->67|92->67|92->67|92->67|92->67|93->68|94->69|96->71|97->72|100->75|100->75|100->75|100->75|100->75|100->75|100->75|100->75|101->76|101->76|101->76|101->76|101->76|101->76|101->76|101->76|101->76|102->77|102->77|102->77|102->77|102->77|102->77|102->77|102->77|108->83|110->85|111->86|111->86|112->87|112->87|112->87|113->88|113->88|113->88|114->89|115->90|115->90|116->91|116->91|116->91|117->92|117->92|117->92|118->93|119->94|119->94|119->94|119->94|120->95|121->96|121->96|122->97|123->98|123->98|124->99|124->99
                  -- GENERATED --
              */
          