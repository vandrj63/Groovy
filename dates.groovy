def months=["jan":31,"feb":28,"mar":31,"apr":30,"may":31,"jun":30,"jul":30,"aug":31,"sep":30,"oct":31,"nov":30,"dec":31]
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
print "Enter number of days: "
def d = br.readLine()
def days = Integer.parseInt(d)
if(days>0 && days<32){
print "January $days"
}
if(days>31 && days<58){
days = days - 31
print "February $days"
}
if(days>59 && days<91){
days = days - 59
print "March $days"
}
if(days>90 && days<121){
days = days - 90
print "April $days"
}
if(days>120 && days<152){
days = days - 120
print "May $days"
}
if(days>151 && days<182){
days = days - 151
print "June $days"
}
if(days>181 && days<213){
days = days - 181
print "July $days"
}
if(days>212 && days<244){
days = days - 212
print "August $days"
}
if(days>243 && days<274){
days = days - 243
print "September $days"
}
if(days>273 && days<305){
days = days - 273
print "October $days"
}
if(days>304 && days<335){
days = days - 304
print "November $days"
}
if(days>334 && days<366){
days = days - 334
print "December $days"
}