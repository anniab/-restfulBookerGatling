package test.requests
import io.gatling.core.Predef.*
import io.gatling.http.Predef.*
import test.config.Configuration.app_url

object UpdateBooking {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")
  val updateBook = exec(http("updateBooking")
    .put(app_url + "/booking/1")
    .headers(sentHeaders)
    .body(StringBody(
      s"""{
      "firstname" : "Jims",
      "lastname" : "Jimebbbbbs",
      "totalprice" :"1114",
      "depositpaid" : true,
      "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Lunch"
        }"""
    )).asJson
  )
}
