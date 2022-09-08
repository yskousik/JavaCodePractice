import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        int stringLength = input.length();
        boolean palindrome = false;
        if(stringLength == 1){
            palindrome = true;
        }
        else{
            int limit = stringLength/2;
            
            
            for(int i=0; i< limit; i++ ){
                if(input.charAt(i)== input.charAt((stringLength-1)-i)){
                    if(i == limit-1){
                        
                        palindrome = true;
                        
            
                    }
                    continue;
                }
                else{
                    palindrome = false;
                    break;
                    
                    
                }   
            }
        }
        return palindrome;
    }
 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to check: ");
    int number = sc.nextInt();
    boolean check = isPalindrome(number);
    System.out.println("The " +number+ " is pelindrome ?" + check);

    sc.close();
  }

    
}

