public class BasicRightTriangleNumberDecrementingPattern{
    public static void main(String[] args){
        int rows = 4;
        int c= 6;
        for(int a = rows ; a >= 1 ; a--){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(c);
            }
            System.out.println();
            c--;
        }
    }
}