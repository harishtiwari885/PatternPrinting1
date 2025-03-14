public class Parallelogram {
    public static void main(String[] args){
        int row = 4;
        int col = 6;
        for(int a = 1; a <= row ; a++){
            for(int sp = 1; sp <= (a +3) - row ;sp++){
                System.out.print(" ");
            }
            for(int b = 1; b <= col ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}