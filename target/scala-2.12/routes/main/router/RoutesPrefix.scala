// @GENERATOR:play-routes-compiler
// @SOURCE:D:/desarrollo/bigprime/examples/testaws/conf/routes
// @DATE:Sun Nov 04 02:23:59 COT 2018


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
