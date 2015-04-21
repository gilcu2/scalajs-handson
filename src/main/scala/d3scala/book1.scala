package d3scala

import org.scalajs.dom
import dom.html
import scala.scalajs.js
import scalajs.js.annotation.JSExport

@JSExport
object Book1 {
  @JSExport
  def main(target: html.Div) = {

    val d3 = js.Dynamic.global.d3

    d3.select("#full_window").append("p").text("New paragraph!")

  }
}