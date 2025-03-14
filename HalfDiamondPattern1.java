public class HalfDiamondPattern1{
    public static void main(String[] args){
        int row = 9;
        int nst = 1;
        for(int a = 1 ; a <= row ; a++){
            for(int b = 1 ; b <= nst ; b++){
                System.out.print("*");
            }
            if(a < 5){
                nst++;
            }
            else{
                nst--;
            }
            System.out.println();
        }
    }
}