package test.requests
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import test.config.Configuration.app_url

object GetOnceBooking {


  val getBookingOnce = exec(http("getBookingOnce")
    .get(app_url + "/booking/1")
    .headers(Map("Authorization" -> "bearer ${token}")))

    
}
