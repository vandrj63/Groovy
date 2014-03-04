  public class XmlTest{
  static void main(args){
    def xmldocument = '''
    <animals>
      <animal> <name age="1">Ted</name>  <breed>teacup yorkie </breed>
      <photo> ted.jpg </photo>
     
      </animal>
      <animal> <name age="4">Chase</name>  <breed>chocalate lab</breed>
      <photo> chase.jpg </photo>
      </animal>
    </animals>
    '''
    def animals = new XmlParser().parseText(xmldocument);
    def allRecords = animals.animal.size()
    

    println("Number of animals is: $allRecords")
    def animal = animals.animal[0]
    
    def sw = new StringWriter()
def html = new groovy.xml.MarkupBuilder(sw)
html.html{
  head{
    title("Animals")
  }
  body{
    h1("Here my pets")
    table(border:1){
      tr{
        th("Name")
        th("Breed")
        th("Picture")
      }
      for (p in animals.animal){
      tr{
        td("${p.name.text()}")
        td("${p.breed.text()}")
        td{img( src:"${p.photo.text()}")}
        
      }
      
      }
    }
  }
  
  def f = new File("animals.html")
  f.write(sw.toString())
}
    // name is the name of the XML tag
    println("Name of the animal tag is:" + animal.name())
    // text gets the text of the node firstname
    println(animal.name.text())
   
    // Lets print out all important information
    for (p in animals.animal){
      println "${p.name.text()}  ${p.breed.text()} ${p.photo.text()}"
    }
  }
 
}
 