addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")
addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.15.1")
libraryDependencies += {
  "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
}
