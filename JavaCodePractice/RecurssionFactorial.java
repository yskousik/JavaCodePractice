import java.util.*;
public class RecurssionFactorial {
    
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number for calculate factorial:");
        int x = sc.nextInt();
        int y = fact(x);
        System.out.println(y);
        sc.close();
    }
    public static int fact(int x){
        int factorial =1;
        if (x>0){
        factorial = (x*fact(x-1));
        
        
        }
        return factorial;
    }

    
    
}
