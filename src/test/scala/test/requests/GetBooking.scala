package test.requests
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import test.config.Configuration.app_url
object GetBooking {


  val getBook = exec(http("getBooking")
    .get(app_url + "/booking")
    .headers(Map("Authorization" -> "bearer ${token}"))
    .check(status is 200))
}
