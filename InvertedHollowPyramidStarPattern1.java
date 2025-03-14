public class InvertedHollowPyramidStarPattern1{
    public static void main(String[] args){
        int row = 4;
        for(int a = row ; a >= 1 ; a--){
            for(int sp = 1 ; sp <= row -a ; sp++){
                System.out.print(" ");
            }
            for(int b= 1 ; b <= ( 2 * a) -1 ; b++){
                if(a == 4 || b== 1 || b==(2 * a) - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}