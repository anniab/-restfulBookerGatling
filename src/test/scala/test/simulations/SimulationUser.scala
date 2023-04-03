package test.simulations
import io.gatling.core.Predef._
import scala.concurrent.duration._
import test.scenarios.BookingScenario
import test.config.Configuration.users
class SimulationUser extends Simulation {
  private val bookingScenarioExec = BookingScenario.bookingScenario
    .inject(
      atOnceUsers(users),
      rampUsers(users).during(2))

  setUp(bookingScenarioExec)
}
