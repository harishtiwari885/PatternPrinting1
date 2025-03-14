public class HalfDiamondPatternInverted1{
    public static void main(String[] args){
        int row = 9;
        int nst = 1;
        int nsp = 4 ;
        for(int a = 1 ; a <= row ; a++){
            for(int sp = 1 ; sp <= nsp ; sp++){
                System.out.print(" ");
            }
            for(int b = 1 ; b <= nst ; b++){
                System.out.print("*");
            }
            if(a < 5){
                nst++;
                nsp--;
            }
            else{
                nst--;
                nsp++;
            }
            System.out.println();
        }
    }
}