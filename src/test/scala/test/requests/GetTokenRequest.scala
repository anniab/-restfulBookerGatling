package test.requests
import test.config.Configuration.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._
object GetTokenRequest {
  val get_token = http("RequestName").post(app_url + "/auth")
    .formParam("username", "admin")
    .formParam("password", "password123")
    .check(status is 200)
    .check(jsonPath("$..token").saveAs("token"))
}
