public class BasicRightTriangleNumberInvertedPattern{
    public static void main(String[] args){
        int rows = 4;
        int c= 10;
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
        }
    }
}