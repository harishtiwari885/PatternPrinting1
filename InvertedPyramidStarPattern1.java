public class InvertedPyramidStarPattern1{
    public static void main(String[] args){
       int row = 4;
       int nst = 7;
       for(int a = 1 ; a <= row ; a++){
           for(int sp = 1 ; sp <= ( a+ 3) - row ; sp++){
               System.out.print(" ");
           }
           for(int b = 1 ; b <= nst ; b++ ){
               System.out.print("*");
           }
           System.out.println();
           nst -= 2;
       }
    }
}