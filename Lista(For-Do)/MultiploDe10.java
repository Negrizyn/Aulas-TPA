package pares;
public class MultiploDe10 {
    public static void main(String[] args) {
        int i;
        for(i=1; i<101; i=i+1){
            if(i%10==0) {
                System.out.println(i+" Multiplo de 10");
            }else{
                System.out.println(+i);
            }
        }
    }
    
}