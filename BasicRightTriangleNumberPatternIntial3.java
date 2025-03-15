public class BasicRightTriangleNumberPatternIntial3{
    public static void main(String[] args){
        int rows = 4;
        int c= 3;
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
    }
}