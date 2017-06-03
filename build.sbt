val Organization = "io.github.kounoike"
val ProjectName = "gitbucket-html5media-plugin"
val ProjectVersion = "1.0.0"

lazy val root = project in file(".")

organization := Organization
name := ProjectName
version := ProjectVersion
scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "io.github.gitbucket" %% "gitbucket"          % "4.13.0" % "provided",
  "javax.servlet"        % "javax.servlet-api"  % "3.1.0"  % "provided"
)

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true