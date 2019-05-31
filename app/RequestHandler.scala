import javax.inject.Inject

import controllers.routes
import play.api.http._
import play.api.mvc.Results._
import play.api.mvc._
import play.api.routing.Router


class RequestHandler @Inject()(router: Router, errorHandler: HttpErrorHandler,
                               configuration: HttpConfiguration, filters: HttpFilters) extends DefaultHttpRequestHandler(router, errorHandler, configuration, filters) {

  override def routeRequest(request: RequestHeader) = {
    if (request.session.get("login").isEmpty &&  !request.path.contains("/assets/") && !request.path.contains("/login") && !request.path.contains("/doLogin") && !request.path.contains("/msg")) {
      Some(Action(Redirect(routes.NewsController.login)))
      //未登录
    } else {
      super.routeRequest(request)
    }

    //super.routeRequest(request)
  }
}
