package test.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import test.config.Configuration.app_url
object PostBook {
  val sentHeaders = Map("Authorization" -> "bearer ${token}")

  val postBook = exec(http("postBook")
    .post(app_url + "/booking")
    .headers(sentHeaders)
    .body(StringBody(
      s"""{
      "firstname" : "Jims",
      "lastname" : "Jimes",
      "totalprice" :"111",
      "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
        }"""
    )).asJson
  )
}
