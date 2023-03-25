package test.simulations
import io.gatling.core.Predef._
import scala.concurrent.duration._
import test.scenarios.GetBookScenario
import test.config.Configuration.users
class SimulationUser extends Simulation {
  private val createUserExec = GetBookScenario.createUserScenario
    .inject(atOnceUsers(users))

  setUp(createUserExec)
}
