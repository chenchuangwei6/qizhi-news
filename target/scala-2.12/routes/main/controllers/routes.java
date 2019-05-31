
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/qizhi/qizhi-news/conf/routes
// @DATE:Fri May 31 16:23:57 CST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseNewsController NewsController = new controllers.ReverseNewsController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseNewsController NewsController = new controllers.javascript.ReverseNewsController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
