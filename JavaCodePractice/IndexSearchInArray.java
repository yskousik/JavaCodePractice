import java.util.*;
public class IndexSearchInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size valu of array: ");
        int arraySize = sc.nextInt();
        int numberList[] = new int [arraySize];
        for (int i =0 ; i< arraySize ; i++){
            numberList[i] = sc.nextInt();
        }
        System.out.print("Enter the number of which you wants to search the index: ");
        int searchIndexofNum = sc.nextInt();
        for (int i =0 ; i< numberList.length ; i++){
            if (numberList[i] == searchIndexofNum){
                System.out.println("Index of " + searchIndexofNum +" is " + i);
            }
            
        }
        sc.close();    

    }
    
}
