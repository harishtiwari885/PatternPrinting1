public class DiamondPatternAPC{
    public static void main(String[] args){
        int rows = 4;
        for(int a =1 ; a <= rows ; a++){
            for(int sp = 1 ; sp <= rows -a ; sp++){
                System.out.print(" ");
            }
            for(int b =1; b <= (2 * a) -1 ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int c =rows ; c >= 1; c--){
            for(int sp =1 ; sp <= rows - c ; sp++){
                System.out.print(" ");
            }
            for(int d = 1 ; d <= (2 * c) -1 ; d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}