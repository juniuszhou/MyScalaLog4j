name := "MyScalaLog4j"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.2"
// if add provided then we can not run tryLog4j directly.
// % "provided"
