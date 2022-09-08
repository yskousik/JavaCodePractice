public class HCF{
    public static void main(String[] args){
        int num1=9;
        int num2=27;
        int hcf=1;
        for(int i=1;i<=num1||i<=num2;i++){
            
            if(num1%i==0 && num2%i==0){
                if (hcf<i){
                    hcf=i;
                }
                else{
                    continue;
                }
                

            }
        }
        System.out.println(hcf);    
    }
}