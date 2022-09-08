public class RecurssionNumber {
    public static void main(String [] args){
        int range = 9;
        printnum(range);
    }    

        public static void printnum(int range){
        
        if (range > 0){
            System.out.println(range);
            printnum(range-1);
            
        }
        
    
        
    }
    
}
