public class ShortingInsersion {
    public static void main(String [] args){
        int [] arry =  {2,7,1,8,9,9,7,4,5,3};
        int temp;
        for(int i=1 ; i<arry.length; i++){
            int j=i;
            while (j>0){
                if(arry[j]<arry[j-1]){
                    temp = arry[j-1];
                    arry[j-1]= arry[j];
                    arry[j] =temp;
                
                }
               
                j=j-1;
            }
        }
        printarry(arry);

    }
    public static void printarry(int [] arry){
        for(int i=0 ;i<arry.length ;i++){
            System.out.println(arry[i]);

        }
    }
    
    
}
