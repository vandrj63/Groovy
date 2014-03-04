def baseUrl = "http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topsongs/limit=10/xml"
  def url = baseUrl
  def xml = url.toURL().text
  def i = 0
 
  def rss = new XmlSlurper().parseText(xml)
  println rss.title
  println "\n"
 
  rss.entry.eachWithIndex{ entry, num ->
      i++
      println "#" + i
      println entry.title
      println "\n"
  }