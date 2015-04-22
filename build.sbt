//import com.lihaoyi.workbench.Plugin._

enablePlugins(ScalaJSPlugin)

//workbenchSettings

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "com.lihaoyi" %%% "scalatags" % "0.4.6"
  //,  "org.webjars" % "d3js" % "3.5.3"
)

//bootSnippet := "d3scala.Book1().main(document.getElementById('canvas'));"

//updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)

//sources in Compile <<= (sources in Compile).map(_ filter(_.name != "ScalaJSExample.scala"))