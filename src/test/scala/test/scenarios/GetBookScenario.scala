package test.scenarios
import io.gatling.core.Predef.scenario
import test.requests.{GetBook, GetOnceBook, GetTokenRequest, PostBook}
import test.requests.GetBook.getBook
import test.requests.GetOnceBook.getBook
import test.requests.PostBook.postBook
object GetBookScenario {

  val createUserScenario = scenario("Create user")
    .exec(GetTokenRequest.get_token)
    .exec(GetBook.getBook)
    .exec(GetOnceBook.getBook)
    .exec(PostBook.postBook)
}
