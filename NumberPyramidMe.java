public class NumberPyramidMe{
    // same don by didi
    public static void main(String[] args){
        int rows = 5;
        for(int a = 1 ; a <= rows ; a++){
            for(int sp =1 ; sp <= rows - a ; sp++){
                System.out.print(" ");
            }
            for(int b = 1 ; b <= a ; b++){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}