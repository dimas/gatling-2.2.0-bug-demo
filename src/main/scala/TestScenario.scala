import io.gatling.core.Predef._
import io.gatling.http.Predef._

class TestScenario extends Simulation {

  val httpProtocol = http
    .baseURL("http://www.bbc.co.uk")
    .connectionHeader("keep-alive")

  val test =
    exec(http("test1").get("/news")
      .check(status.is(200))
    )

  val chains = test :: Nil

  val scn = scenario("Test Scenario")
    .exec(chains)

  setUp(
    scn.inject(
      atOnceUsers(1)
    )
  ).protocols(httpProtocol)
}
