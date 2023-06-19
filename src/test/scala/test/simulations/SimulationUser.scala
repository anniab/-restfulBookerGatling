package test.simulations
import io.gatling.core.Predef._
import scala.concurrent.duration._
import test.scenarios.BookingScenario

class SimulationUser extends Simulation {

  private val bookingScenarioExec = BookingScenario.bookingScenario.inject(
    rampUsers(400).during(10))

  private val bookingScenarioAssertion= setUp(
    bookingScenarioExec).assertions(
    forAll.successfulRequests.percent.gt(95)
  )
}
