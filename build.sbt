name := """play-java-hello-world-web"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, SwaggerPlugin)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.12.6", "2.11.12")

libraryDependencies += guice
libraryDependencies += "org.webjars" % "swagger-ui" % "3.20.2"

// Swagger
swaggerV3 := true
swaggerFileName := "openapi.json"
swaggerRoutesFile := "api.routes"
swaggerDomainNameSpaces := Seq("models")
