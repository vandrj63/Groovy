def sw = new StringWriter()
pic="chase.jpg"
def html = new groovy.xml.MarkupBuilder(sw)
html.html{
head{
title("Links")
}
body{ 
h1("Here are my HTML bookmarks")
table(border:1){
tr{
th("what")
th("where")
}
tr{
td("Groovy Articles")
td{img(src:"$pic")}//pic is defined up above
}
}
}
}
def f = new File("index2.html")
f.write(sw.toString())