name := "envoy_ws"

version := "1.0"

libraryDependencies ++= Seq(
  cache,
  "com.github.OriolLopezMassaguer" % "dataframe_2.10" % "1.2.2" classifier "assembly"
)

play.Project.playScalaSettings
