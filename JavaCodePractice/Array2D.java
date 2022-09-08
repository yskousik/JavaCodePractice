import java.util.*;
public class Array2D {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: i ," +"j ");
        int arrayrowSize = sc.nextInt();
        int arraycolumnSize = sc.nextInt();
        int array[][] = new int[arrayrowSize][arraycolumnSize];
        for(int i = 0; i< arrayrowSize; i++){
         for(int j = 0; j< arraycolumnSize; j++){
            System.out.println("Enter the array elements: " + i + "," + j);

            array[i][j]= sc.nextInt();
         }
        }
        for(int i = 0; i< arrayrowSize; i++){
         System.out.println();
         for(int j = 0; j< arraycolumnSize; j++){
            System.out.print(array[i][j]+" ");

            
         }
        }
     sc.close();   
   }
}
