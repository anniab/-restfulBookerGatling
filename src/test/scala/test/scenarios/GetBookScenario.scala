package test.scenarios
import io.gatling.core.Predef.scenario
import test.requests.{GetTokenRequest, GetBook}
import test.requests.GetBook.getBook
object GetBookScenario {

  val createUserScenario = scenario("Create user")
    .exec(GetTokenRequest.get_token)
    .exec(GetBook.getBook)
}
