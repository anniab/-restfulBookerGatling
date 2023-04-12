package test.requests
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import test.config.Configuration.app_url
object GetBooking {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val getBook = exec(http("getBooking")
    .get(app_url + "/booking")
    .headers(sentHeaders)
    .check(status is 200))
   
}
