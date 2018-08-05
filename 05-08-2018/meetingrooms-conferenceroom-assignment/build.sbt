name := "meetingrooms-conferenceroom-assignment"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.24"

lazy val db = project in file ("database")
lazy val root = (project in file(".")).dependsOn(db)