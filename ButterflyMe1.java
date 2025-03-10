public class ButterflyMe1{
    public static void main(String[] args){
        int rows = 9;
        int nst = 1 ;
        int nsp=8;
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= nst ; b++){
                System.out.print("*");
            }
            for(int sp = 1 ; sp <= nsp ; sp++){
                System.out.print(" ");
            }
            for(int c =1 ; c <= nst ; c++){
                System.out.print("*");
            }
            if(a <= 4){
                nst++;
                nsp -=2;
            }
            else{
                nst--;
                nsp += 2;
            }
            System.out.println();
        }
    }
}