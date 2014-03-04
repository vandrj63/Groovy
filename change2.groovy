class ChangeMap {
      public static void main(String []args){
      def coins=["quarter":25,"dime":10,"nickel":5,"penny":1]
     
      Scanner br = new Scanner(new FileReader("data.txt"))
     
      while(br.hasNext()){
     
      def pennies = br.nextInt()
      println "pennies is $pennies"
      def change=pennies
      def q=new int[4]
      def i=0
      coins.each
      {q[i]=change/it.value
      println "${q[i]} many  ${it.key}s"
      change=change%it.value
      i++
      }
      }
      }//while loop
     
}