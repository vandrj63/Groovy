def months=["jan":31,"feb":28,"mar":31,"apr":30,"may":31,"jun":30,"jul":30,"aug":31,"sep":30,"oct":31,"nov":30,"dec":31]

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
println "Enter number of days: "
def d = br.readLine()
def days = Integer.parseInt(d)

q=new int[12]
def i=0
months.each
{q[i]=days/it.value
println "${q[i]} many  ${it.key}s"//outputs how many quarters, dimes, etc
days=days%it.value
i++
}