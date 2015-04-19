package example

import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.html
import scalajs.js

case class Point(x: Int, y: Int) {
  def +(p: Point) = Point(x + p.x, y + p.y)

  def /(d: Int) = Point(x / d, y / d)
}

@JSExport
object ScalaJSExample {
  @JSExport
  def main(canvas: html.Canvas): Unit = {

    val renderer = canvas.getContext("2d")
      .asInstanceOf[dom.CanvasRenderingContext2D]

    canvas.width = canvas.parentElement.parentElement.clientWidth
    canvas.height = canvas.parentElement.parentElement.clientHeight

    println("Canvas size: " + canvas.width + " " + canvas.height)

    renderer.fillStyle = "#f8f8f8"
    renderer.fillRect(0, 0, canvas.width, canvas.height)

    renderer.fillStyle = "black"

    val gradient = renderer.createLinearGradient(
      canvas.width / 2 - 100, 0, canvas.width / 2 + 100, 0
    )
    gradient.addColorStop(0, "red")
    gradient.addColorStop(0.5, "green")
    gradient.addColorStop(1, "blue")
    renderer.fillStyle = gradient
    //renderer.fillStyle = "black"

    renderer.textAlign = "center"
    renderer.textBaseline = "middle"

    def render() = {
      val date = new js.Date()
      renderer.clearRect(
        0, 0, canvas.width, canvas.height
      )

      renderer.font = "75px sans-serif"
      renderer.fillText(
        Seq(
          date.getHours(),
          date.getMinutes(),
          date.getSeconds()
        ).mkString(":"),
        canvas.width / 2,
        canvas.height / 2
      )
    }
    dom.setInterval(render _, 1000)

  }
}
