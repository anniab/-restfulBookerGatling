package test.scenarios
import io.gatling.core.Predef._
import test.requests.{GetBooking, GetOnceBooking, GetTokenRequest, PostBooking, UpdateBooking}

object BookingScenario {

  val bookingScenario = scenario("Booking scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetBooking.getBook)
    .exec(GetOnceBooking.getBookingOnce)
    .exec(UpdateBooking.updateBook)
    .exec(PostBooking.postBook)
    
}
