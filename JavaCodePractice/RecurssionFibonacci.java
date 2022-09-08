import java.util.*;
public class RecurssionFibonacci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Fibonacci series: ");
        int range = sc.nextInt();
        int a =0;
        int b= 1;
        if (range < 1){
            System.out.println("Input is invalid");

        }
        if (range == 1 ){
            System.out.println(a);
        }
        if (range == 2 ){
            System.out.println(a);
            System.out.println(b);
        }
        else{
            System.out.println(a);
            System.out.println(b);
            printFibonacci(a,b,range-2);
        }
       sc.close(); 
    }
    public static void printFibonacci(int a, int b, int range){
        if (range == 0){
            return;
        }
        else{
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            printFibonacci(a, b, range-1);
        }

         
        
           
    }
}
