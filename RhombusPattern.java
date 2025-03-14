public class RhombusPattern {
    public static void main(String[] args){
        int row = 4;
        for(int a = 1; a <= row ; a++){
            for(int sp = 1; sp <= (a +3) - row ;sp++){
                System.out.print(" ");
            }
            for(int b = 1; b <= row ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}