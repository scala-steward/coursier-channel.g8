addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.13.0")
libraryDependencies += {
  "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
}
