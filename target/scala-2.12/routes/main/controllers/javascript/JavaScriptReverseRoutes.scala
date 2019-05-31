
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/qizhi/qizhi-news/conf/routes
// @DATE:Fri May 31 16:23:57 CST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers.javascript {

  // @LINE:5
  class ReverseNewsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.remove",
      """
        function(_id0,isRecommended1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remove" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("_id", _id0), (isRecommended1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("isRecommended", isRecommended1))])})
        }
      """
    )
  
    // @LINE:11
    def generateToFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.generateToFile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "generateToFile"})
        }
      """
    )
  
    // @LINE:10
    def doAdd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.doAdd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
        }
      """
    )
  
    // @LINE:15
    def newList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.newList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newsList"})
        }
      """
    )
  
    // @LINE:14
    def msg: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.msg",
      """
        function(msg0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "msg" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("msg", msg0)])})
        }
      """
    )
  
    // @LINE:6
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.doLogin",
      """
        function(password0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "doLogin" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password0)])})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.index",
      """
        function(page0,isRecommended1) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("page", page0)), (isRecommended1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("isRecommended", isRecommended1))])})
        }
      """
    )
  
    // @LINE:8
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.add",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add"})
        }
      """
    )
  
    // @LINE:9
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.edit",
      """
        function(_id0,isRecommended1,category2,page3,isRecommendedEdit4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("_id", _id0), (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("isRecommended", isRecommended1), (category2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("category", category2)), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("page", page3), (isRecommendedEdit4 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("isRecommendedEdit", isRecommendedEdit4))])})
        }
      """
    )
  
    // @LINE:13
    def recommended: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.recommended",
      """
        function(_id0,isRecommendedc1,page2,isRecommended3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommended" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("_id", _id0), (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("isRecommendedc", isRecommendedc1), (page2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("page", page2)), (isRecommended3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("isRecommended", isRecommended3))])})
        }
      """
    )
  
    // @LINE:5
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.NewsController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
