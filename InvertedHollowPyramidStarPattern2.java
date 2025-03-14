public class InvertedHollowPyramidStarPattern2{
    public static void main(String[] args){
        int row = 4 ;
        int nst = 7;
        for(int a = row ; a >= 1 ; a--){
            for(int sp = 1 ; sp <= row -a; sp++){
                System.out.print(" ");
            }
            for(int b= 1 ; b <= nst ; b++){
                if(a == 4 || b== 1 || b== (2 * a) -1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            nst -= 2;
        }
    }
}