name := "MiserableFuture"

scalaVersion := "2.12.3"

enablePlugins(TutPlugin)

libraryDependencies += "com.storm-enroute" %% "scalameter" % "0.8.2"
libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.0-MF"

parallelExecution in Test := false
logBuffered := false
testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:higherKinds",
//  "-Xlint",
  "-Ypartial-unification"
)
