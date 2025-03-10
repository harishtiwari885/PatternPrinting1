public class PalindromicPatternMe{
    public static void main(String[] args){
        int rows = 5;
        for(int a = 1 ; a <= rows ; a++){
            for(int sp =1 ; sp <= rows - a ; sp++){
                System.out.print(" ");
            }
            for(int b = a ; b >= 1 ; b--){
                System.out.print(b);
            }
            for(int c =2 ; c <= a ; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}