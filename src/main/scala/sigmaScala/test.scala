package sigmaScala

import org.scalajs.dom
import dom.html
import scala.scalajs.js
import scalajs.js.annotation.JSExport


@JSExport
object UI {
  @JSExport
  def main(target: html.Div):Unit = {

    import js.Dynamic.{ global => jsGlo, newInstance => jsNew ,literal=>jsLit}

    val s =  jsNew(jsGlo.sigma)("container")

    val node0=jsLit(id="n0", label="Hello", x=0,y= 0,size=1, color="#f00")
    val node1=jsLit(id="n1", label="World", x=1,y= 1,size=1, color="#00f")
    val edge=jsLit(id="e0", source="n0",target="n1")

    s.graph.addNode(node0)
    s.graph.addNode(node1)
    s.graph.addEdge(edge)

    s.refresh()


  }
}