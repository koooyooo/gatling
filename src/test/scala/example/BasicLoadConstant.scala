package example

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicLoadConstant extends Simulation {
  val httpConf = http.baseURL("http://computer-database.gatling.io")

  val req = http("senario1").get("/").check(status.is(200))
  val scn = scenario("BasicSimulation2").exec(req)

  setUp(
    scn.inject(constantUsersPerSec(10) during(10 seconds))
  ).protocols(httpConf)
}
