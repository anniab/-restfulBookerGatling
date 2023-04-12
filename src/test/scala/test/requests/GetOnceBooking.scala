package test.requests
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.Predef.{http, status}
import test.config.Configuration.app_url

object GetOnceBooking {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val getBook = exec(http("getBookingOnce")
    .get(app_url + "/booking/1")
    .headers(sentHeaders)
    .check(status is 200))
}
