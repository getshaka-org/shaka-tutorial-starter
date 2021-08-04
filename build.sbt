lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "com.example",
    name := "shaka-tutorial-starter",
    version := "0.1.0-SNAPSHOT",
    versionScheme := Some("early-semver"),

    scalaVersion := "3.3.0",
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "shaka" % "0.6.0"
    )
  )
