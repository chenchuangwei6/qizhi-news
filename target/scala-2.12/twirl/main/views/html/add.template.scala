
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

object add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Option[News],Boolean,String,Int,Boolean,Request[AnyContent],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(newsOpt: Option[News], isRecommended: Boolean, category: String, page: Int, isRecommendedEdit :Boolean)(implicit request: Request[AnyContent]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.145*/("""

"""),_display_(/*3.2*/main("添加新闻", request)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" href="/assets/plugins/quill/quill.snow.css">
<style>
/* Set default font-family */
#quill-container """),format.raw/*7.18*/("""{"""),format.raw/*7.19*/("""
  """),format.raw/*8.3*/("""font-family: "Helvetica Neue", Helvetica, "PingFang SC", 微软雅黑, "STHeiti Light", Tahoma, Arial, sans-serif;
  font-size: 14px;
  height: 500px;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
"""),format.raw/*12.1*/(""".layui-upload-file, .layui-upload-button """),format.raw/*12.42*/("""{"""),format.raw/*12.43*/(""" """),format.raw/*12.44*/("""display: none;"""),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""

"""),format.raw/*14.1*/(""".ql-editor p, .ql-editor ol, .ql-editor ul, .ql-editor pre, .ql-editor blockquote, .ql-editor h1, .ql-editor h2, .ql-editor h3, .ql-editor h4, .ql-editor h5, .ql-editor h6 """),format.raw/*14.173*/("""{"""),format.raw/*14.174*/("""
    """),format.raw/*15.5*/("""margin: 5px 0px 5px;
    padding: 10px 0px 5px;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""</style>
<div class="row" style="margin-top: 15px;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <!-- Default panel contents -->
            <div class="panel-heading"><h4>添加新闻</h4></div>
            <div class="panel-body" style="padding-right: 0px;">
                <form id="form" action="/add" method="post">
                    <input type="hidden" name="page" value=""""),_display_(/*26.62*/{page}),format.raw/*26.68*/(""""/>
                    <input type="hidden" name="isRecommended" value=""""),_display_(/*27.71*/{isRecommended}),format.raw/*27.86*/(""""/>
                    <input type="hidden" name="isRecommendedEdit" value=""""),_display_(/*28.75*/{isRecommendedEdit}),format.raw/*28.94*/(""""/>
                    <div class="form-group">
                        <label>新闻标题</label>
                        <input name="title" class="form-control" value='"""),_display_(/*31.74*/newsOpt/*31.81*/.map(_.title).getOrElse("")),format.raw/*31.108*/("""'>
                    </div>
                    <div class="form-group">
                        <label>新闻简介</label>
                        <input name="intro" class="form-control" value='"""),_display_(/*35.74*/newsOpt/*35.81*/.map(_.intro).getOrElse("")),format.raw/*35.108*/("""'>
                    </div>
                    """),format.raw/*37.40*/("""
                    """),format.raw/*38.21*/("""<div class="form-group">
                        <label>新闻分类</label>
                        <select name="category" class="form-control input-small category" style="width: auto;">
                            <option value="default">请选择</option>
                            <option value="industry">行业新闻</option>
                            <option value="productDynamic">产品动态</option>
                            <option value="customerCase">客户案例</option>
                        </select>
                    </div>
                    """),format.raw/*47.40*/("""
                    """),format.raw/*48.21*/("""<div class="form-group">
                        <label>封面图片</label>
                        <input id="file" type="file">
                        <input id="fileHidden" name="image" type="hidden"  value='"""),_display_(/*51.84*/newsOpt/*51.91*/.map(_.image).getOrElse("")),format.raw/*51.118*/("""'>
                        <p class="help-block">"""),_display_(/*52.48*/newsOpt/*52.55*/.map(_ => "封面图片已上传！").getOrElse("该图片作为封面显示在新闻列表页面。")),format.raw/*52.107*/("""</p>
                    </div>
                    <div class="form-group">
                        <label>新闻内容</label>
                        """),_display_(/*56.26*/if(newsOpt.nonEmpty)/*56.46*/{_display_(Seq[Any](format.raw/*56.47*/("""
                        """),format.raw/*57.25*/("""<input name="_id" type="hidden" value='"""),_display_(/*57.65*/newsOpt/*57.72*/.get._id),format.raw/*57.80*/("""'>
                        """)))}),format.raw/*58.26*/("""
                        """),format.raw/*59.25*/("""<input id="content" name="content" type="hidden" value='"""),_display_(/*59.82*/newsOpt/*59.89*/.map(_.content).getOrElse("")),format.raw/*59.118*/("""'>
                        <div id="quill-container">"""),_display_(/*60.52*/Html(newsOpt.map(_.content.get).getOrElse(""))),format.raw/*60.98*/("""</div>
                    </div>
                    <button class="btn btn-primary">确认提交</button>
                </form>
            </div>
        </div>
    </div>
</div>

""")))}),format.raw/*69.2*/("""

"""),format.raw/*71.1*/("""<script type="text/javascript" src="/assets/plugins/quill/quill.min.js"></script>
<script>
var quill = new Quill('#quill-container', """),format.raw/*73.43*/("""{"""),format.raw/*73.44*/("""
  """),format.raw/*74.3*/("""theme: 'snow',
  modules: """),format.raw/*75.12*/("""{"""),format.raw/*75.13*/("""
    """),format.raw/*76.5*/("""toolbar: """),format.raw/*76.14*/("""{"""),format.raw/*76.15*/("""
      """),format.raw/*77.7*/("""container : [
        ["""),format.raw/*78.10*/("""{"""),format.raw/*78.11*/(""" """),format.raw/*78.12*/("""'size': [] """),format.raw/*78.23*/("""}"""),format.raw/*78.24*/("""],
        [ 'bold', 'italic', 'underline', 'strike' ],
        ["""),format.raw/*80.10*/("""{"""),format.raw/*80.11*/(""" """),format.raw/*80.12*/("""'color': [] """),format.raw/*80.24*/("""}"""),format.raw/*80.25*/(""", """),format.raw/*80.27*/("""{"""),format.raw/*80.28*/(""" """),format.raw/*80.29*/("""'background': [] """),format.raw/*80.46*/("""}"""),format.raw/*80.47*/("""],
        ["""),format.raw/*81.10*/("""{"""),format.raw/*81.11*/(""" """),format.raw/*81.12*/("""'script': 'super' """),format.raw/*81.30*/("""}"""),format.raw/*81.31*/(""", """),format.raw/*81.33*/("""{"""),format.raw/*81.34*/(""" """),format.raw/*81.35*/("""'script': 'sub' """),format.raw/*81.51*/("""}"""),format.raw/*81.52*/("""],
        ["""),format.raw/*82.10*/("""{"""),format.raw/*82.11*/(""" """),format.raw/*82.12*/("""'header': 1 """),format.raw/*82.24*/("""}"""),format.raw/*82.25*/(""", """),format.raw/*82.27*/("""{"""),format.raw/*82.28*/(""" """),format.raw/*82.29*/("""'header': 2 """),format.raw/*82.41*/("""}"""),format.raw/*82.42*/(""", """),format.raw/*82.44*/("""{"""),format.raw/*82.45*/(""" """),format.raw/*82.46*/("""'header': [1, 2, 3, 4, 5, 6, false] """),format.raw/*82.82*/("""}"""),format.raw/*82.83*/("""],
        ['blockquote', 'code-block' ],
        ["""),format.raw/*84.10*/("""{"""),format.raw/*84.11*/(""" """),format.raw/*84.12*/("""'list': 'ordered' """),format.raw/*84.30*/("""}"""),format.raw/*84.31*/(""", """),format.raw/*84.33*/("""{"""),format.raw/*84.34*/(""" """),format.raw/*84.35*/("""'list': 'bullet'"""),format.raw/*84.51*/("""}"""),format.raw/*84.52*/(""", """),format.raw/*84.54*/("""{"""),format.raw/*84.55*/(""" """),format.raw/*84.56*/("""'indent': '-1' """),format.raw/*84.71*/("""}"""),format.raw/*84.72*/(""", """),format.raw/*84.74*/("""{"""),format.raw/*84.75*/(""" """),format.raw/*84.76*/("""'indent': '+1' """),format.raw/*84.91*/("""}"""),format.raw/*84.92*/("""],
        [ 'direction', """),format.raw/*85.24*/("""{"""),format.raw/*85.25*/(""" """),format.raw/*85.26*/("""'align': [] """),format.raw/*85.38*/("""}"""),format.raw/*85.39*/("""],
        [ 'link', 'image' ],
        [ 'clean' ]
      ]
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""
  """),format.raw/*90.3*/("""}"""),format.raw/*90.4*/("""
"""),format.raw/*91.1*/("""}"""),format.raw/*91.2*/(""");

$('#form').submit(function()"""),format.raw/*93.29*/("""{"""),format.raw/*93.30*/("""
  """),format.raw/*94.3*/("""$('#content').val(quill.root.innerHTML);
"""),format.raw/*95.1*/("""}"""),format.raw/*95.2*/(""");

$('#file').on('change', function()"""),format.raw/*97.35*/("""{"""),format.raw/*97.36*/("""
    """),format.raw/*98.5*/("""let reader = new FileReader();
    reader.onload = (e) => """),format.raw/*99.28*/("""{"""),format.raw/*99.29*/("""
      """),format.raw/*100.7*/("""$('#fileHidden').val(e.target.result);
    """),format.raw/*101.5*/("""}"""),format.raw/*101.6*/(""";
    reader.readAsDataURL($('#file')[0].files[0]);
"""),format.raw/*103.1*/("""}"""),format.raw/*103.2*/(""");

$(".category option").each(function () """),format.raw/*105.40*/("""{"""),format.raw/*105.41*/("""
    """),format.raw/*106.5*/("""if($(this).val().trim() == """"),_display_(/*106.34*/category),format.raw/*106.42*/("""")"""),format.raw/*106.44*/("""{"""),format.raw/*106.45*/("""
        """),format.raw/*107.9*/("""$(this).attr('selected',true);
        return
    """),format.raw/*109.5*/("""}"""),format.raw/*109.6*/("""
"""),format.raw/*110.1*/("""}"""),format.raw/*110.2*/(""");

</script>

"""))
      }
    }
  }

  def render(newsOpt:Option[News],isRecommended:Boolean,category:String,page:Int,isRecommendedEdit:Boolean,request:Request[AnyContent]): play.twirl.api.HtmlFormat.Appendable = apply(newsOpt,isRecommended,category,page,isRecommendedEdit)(request)

  def f:((Option[News],Boolean,String,Int,Boolean) => (Request[AnyContent]) => play.twirl.api.HtmlFormat.Appendable) = (newsOpt,isRecommended,category,page,isRecommendedEdit) => (request) => apply(newsOpt,isRecommended,category,page,isRecommendedEdit)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 31 16:23:57 CST 2019
                  SOURCE: E:/qizhi/qizhi-news/app/views/add.scala.html
                  HASH: b3a898c67d09bc28a8b85c9a44cdf19a740686fc
                  MATRIX: 780->1|1019->144|1049->149|1078->170|1117->172|1145->174|1298->300|1326->301|1356->305|1529->451|1557->452|1586->454|1655->495|1684->496|1713->497|1755->511|1784->512|1815->516|2016->688|2046->689|2079->695|2156->745|2184->746|2213->748|2661->1169|2688->1175|2790->1250|2826->1265|2932->1344|2972->1363|3168->1532|3184->1539|3233->1566|3456->1762|3472->1769|3521->1796|3601->1867|3651->1889|4226->2455|4276->2477|4512->2686|4528->2693|4577->2720|4655->2771|4671->2778|4745->2830|4922->2980|4951->3000|4990->3001|5044->3027|5111->3067|5127->3074|5156->3082|5216->3111|5270->3137|5354->3194|5370->3201|5421->3230|5503->3285|5570->3331|5787->3518|5818->3522|5981->3657|6010->3658|6041->3662|6096->3689|6125->3690|6158->3696|6195->3705|6224->3706|6259->3714|6311->3738|6340->3739|6369->3740|6408->3751|6437->3752|6532->3819|6561->3820|6590->3821|6630->3833|6659->3834|6689->3836|6718->3837|6747->3838|6792->3855|6821->3856|6862->3869|6891->3870|6920->3871|6966->3889|6995->3890|7025->3892|7054->3893|7083->3894|7127->3910|7156->3911|7197->3924|7226->3925|7255->3926|7295->3938|7324->3939|7354->3941|7383->3942|7412->3943|7452->3955|7481->3956|7511->3958|7540->3959|7569->3960|7633->3996|7662->3997|7743->4050|7772->4051|7801->4052|7847->4070|7876->4071|7906->4073|7935->4074|7964->4075|8008->4091|8037->4092|8067->4094|8096->4095|8125->4096|8168->4111|8197->4112|8227->4114|8256->4115|8285->4116|8328->4131|8357->4132|8412->4159|8441->4160|8470->4161|8510->4173|8539->4174|8634->4242|8662->4243|8693->4247|8721->4248|8750->4250|8778->4251|8840->4285|8869->4286|8900->4290|8969->4332|8997->4333|9065->4373|9094->4374|9127->4380|9214->4439|9243->4440|9279->4448|9351->4492|9380->4493|9462->4547|9491->4548|9565->4593|9595->4594|9629->4600|9686->4629|9716->4637|9747->4639|9777->4640|9815->4650|9895->4702|9924->4703|9954->4705|9983->4706
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|32->7|32->7|33->8|36->11|36->11|37->12|37->12|37->12|37->12|37->12|37->12|39->14|39->14|39->14|40->15|42->17|42->17|43->18|51->26|51->26|52->27|52->27|53->28|53->28|56->31|56->31|56->31|60->35|60->35|60->35|62->37|63->38|72->47|73->48|76->51|76->51|76->51|77->52|77->52|77->52|81->56|81->56|81->56|82->57|82->57|82->57|82->57|83->58|84->59|84->59|84->59|84->59|85->60|85->60|94->69|96->71|98->73|98->73|99->74|100->75|100->75|101->76|101->76|101->76|102->77|103->78|103->78|103->78|103->78|103->78|105->80|105->80|105->80|105->80|105->80|105->80|105->80|105->80|105->80|105->80|106->81|106->81|106->81|106->81|106->81|106->81|106->81|106->81|106->81|106->81|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|107->82|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|109->84|110->85|110->85|110->85|110->85|110->85|114->89|114->89|115->90|115->90|116->91|116->91|118->93|118->93|119->94|120->95|120->95|122->97|122->97|123->98|124->99|124->99|125->100|126->101|126->101|128->103|128->103|130->105|130->105|131->106|131->106|131->106|131->106|131->106|132->107|134->109|134->109|135->110|135->110
                  -- GENERATED --
              */
          