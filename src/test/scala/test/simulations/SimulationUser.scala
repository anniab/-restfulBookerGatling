package test.simulations
import io.gatling.core.Predef.{forAll, _}

import scala.concurrent.duration._
import test.scenarios.BookingScenario

class SimulationUser extends Simulation {

  private val bookingScenarioExec = BookingScenario.bookingScenario.inject(
    nothingFor(5), // Pause for a given duration
    atOnceUsers(10),
    rampUsers(400).during(10))

  private val bookingScenarioAssertion= setUp(
    bookingScenarioExec).assertions(
    forAll.successfulRequests.percent.gt(95)
  ).assertions(
    forAll.responseTime.mean.lte(500))
}
