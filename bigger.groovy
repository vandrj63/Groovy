def a = System.console().readLine 'Enter a number '
println "You entered: $a"

def b = System.console().readLine 'Enter another number '
println "you entered: $b"

def c = System.console().readLine 'Enter another number '
println "you entered: $c"

if (a>b && a>c){big=a;}
else if(b >a && b > c){big=b;}
else if (c>a && c >b){big=c;}

println big


