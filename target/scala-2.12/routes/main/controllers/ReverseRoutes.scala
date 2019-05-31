
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/qizhi/qizhi-news/conf/routes
// @DATE:Fri May 31 16:23:57 CST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseNewsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def remove(_id:String, isRecommended:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "remove" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("_id", _id)), if(isRecommended == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("isRecommended", isRecommended)))))
    }
  
    // @LINE:11
    def generateToFile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "generateToFile")
    }
  
    // @LINE:10
    def doAdd(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "add")
    }
  
    // @LINE:15
    def newList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newsList")
    }
  
    // @LINE:14
    def msg(msg:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "msg" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("msg", msg)))))
    }
  
    // @LINE:6
    def doLogin(password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "doLogin" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:7
    def index(page:Int = 1, isRecommended:Boolean = false): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(isRecommended == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("isRecommended", isRecommended)))))
    }
  
    // @LINE:8
    def add(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add")
    }
  
    // @LINE:9
    def edit(_id:String, isRecommended:Boolean, category:String = "default", page:Int, isRecommendedEdit:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("_id", _id)), Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("isRecommended", isRecommended)), if(category == "default") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("category", category)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(isRecommendedEdit == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("isRecommendedEdit", isRecommendedEdit)))))
    }
  
    // @LINE:13
    def recommended(_id:String, isRecommendedc:Boolean, page:Int = 1, isRecommended:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recommended" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("_id", _id)), Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("isRecommendedc", isRecommendedc)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)), if(isRecommended == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("isRecommended", isRecommended)))))
    }
  
    // @LINE:5
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
