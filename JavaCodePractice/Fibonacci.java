public class Fibonacci {
  public static void main(String[] args) {
  int x=0;
  int y=1;
  int z=0;
  System.out.println(x);
  System.out.println(y);
  for(int i=0;i<10;i++){
   
  z=x+y;
  x=y;
  y=z;
  System.out.println(z);
   
  }
  }
  
}
