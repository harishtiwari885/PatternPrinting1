public class HalfDiamondPattern2{
    public static void main(String[] args){
        int row1 = 5;
        for(int a = 1 ; a <= row1 ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        int row2 = 4;
        for(int c = row2 ; c >= 1 ; c--){
            for(int d = 1 ; d <=  c ; d++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}