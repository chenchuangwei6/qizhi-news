
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/qizhi/qizhi-news/conf/routes
// @DATE:Fri May 31 16:23:57 CST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
