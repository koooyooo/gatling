import Dependencies._
import sbt.Keys.libraryDependencies

enablePlugins(GatlingPlugin)

organization := "com.example"
scalaVersion := "2.11.8"
name         := "gatling"
version      := "0.1.0-SNAPSHOT"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.2.2" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.2.2" % "test"
libraryDependencies += scalaTest % Test
