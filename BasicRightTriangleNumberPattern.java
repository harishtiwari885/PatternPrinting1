public class BasicRightTriangleNumberPattern{
    public static void main(String[] args){
        int rows = 5;
        int c= 1;
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}