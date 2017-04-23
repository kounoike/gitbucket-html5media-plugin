package gitbucket.html5media

import gitbucket.core.plugin.{Renderer, RenderRequest}
import play.twirl.api.Html

class Html5AudioRenderer extends Renderer {
  def render(request: RenderRequest): Html = {
    Html(s"""<audio src="${request.context.request.getRequestURL}?raw=true" controls autoplay/>""")
  }
}

class Html5VideoRenderer extends Renderer {
  def render(request: RenderRequest): Html = {
    Html(s"""<video src="${request.context.request.getRequestURL}?raw=true" autoplay width="100%"/>""")
  }
}

class PDFRenderer extends Renderer {
  def render(request: RenderRequest): Html = {
    Html(
      s"""<object data="${request.context.request.getRequestURL}?raw=true" width="100%" height="700">
         |<p>Your browser does not support render inline PDF. Please download from this
         | <a href="${request.context.request.getRequestURL}?raw=true">Link</a></p>
         |</object>""".stripMargin)
  }
}
