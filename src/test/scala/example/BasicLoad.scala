package example

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

class BasicLoad extends Simulation {
  val httpConf = http.baseURL("http://computer-database.gatling.io")

  val req = http("senario1").get("/").check(status.is(200))
  val scn = scenario("BasicSimulation1").exec(req)

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)
}
