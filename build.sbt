name := """testaws"""
organization := "bigprime"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

libraryDependencies += guice
dockerExposedPorts in Docker := Seq(80)