
def xml = """
<langs type="current">
  <language>Java</language>
  <language>Groovy</language>
  <language>JavaScript</language>
</langs>
"""
 
def langs = new XmlParser().parseText(xml)
println "type = ${langs.attribute("type")}"
langs.language.each{
  println it.text()
}
 