class ChangeMap {
      public static void main(String []args){
     
      Scanner br = new Scanner(new FileReader("data2.txt"))
      
      def a, b, citya, cityb
      citya = br.next()
      a = br.nextInt()
      
      b = 0
      cityb = null
      
      while(br.hasNext()){
      cityb = br.next()
      b = br.nextInt()
      if(b>a){
        a = b;
        citya = cityb;
      }
      }
     
     
     println citya
     }
}