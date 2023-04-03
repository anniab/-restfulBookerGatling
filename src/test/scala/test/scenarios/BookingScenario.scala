package test.scenarios
import io.gatling.core.Predef.scenario
import test.requests.{GetBooking, GetOnceBooking, GetTokenRequest, PostBooking, UpdateBooking}
import test.requests.GetBooking.getBook
import test.requests.GetOnceBooking.getBook
import test.requests.PostBooking.postBook
import test.requests.UpdateBooking.updateBook
object BookingScenario {

  val bookingScenario = scenario("Booking scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetBooking.getBook)
    .exec(GetOnceBooking.getBook)
    .exec(UpdateBooking.updateBook)
    .exec(PostBooking.postBook)
    .exec(UpdateBooking.updateBook)
}
