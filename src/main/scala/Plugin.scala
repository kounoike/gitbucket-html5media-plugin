import javax.servlet.ServletContext

import gitbucket.core.plugin.PluginRegistry
import gitbucket.core.service.SystemSettingsService.SystemSettings
import gitbucket.html5media.{Html5VideoRenderer, Html5AudioRenderer, PDFRenderer}
import io.github.gitbucket.solidbase.model.Version

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "html5media"
  override val pluginName: String = "HTML5 media Plugin"
  override val description: String = "Provides HTML5 video/audio player and PDF viewer for GitBucket."
  override val versions: List[Version] = List(
    new Version("1.0.0"),
    new Version("1.0.1"),
    new Version("1.1.0")
  )

  override def initialize(registry: PluginRegistry, context: ServletContext, settings: SystemSettings): Unit = {
    val html5v = new Html5VideoRenderer()
    val html5a = new Html5AudioRenderer()
    val pdf = new PDFRenderer()
    registry.addRenderer("mp4", html5v)
    registry.addRenderer("webm", html5v)
    registry.addRenderer("ogv", html5v)
    registry.addRenderer("mp3", html5a)
    registry.addRenderer("aac", html5a)
    registry.addRenderer("ogg", html5a)
    registry.addRenderer("flac", html5a)
    registry.addRenderer("wav", html5a)
    registry.addRenderer("pdf", pdf)
    super.initialize(registry, context, settings)
  }
}
