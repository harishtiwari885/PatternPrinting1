public class SolidRohumbusMe1{
    public static void main(String[] args){
        int rows = 5;
        int space = 4;
        for(int a = 1 ; a <= rows ; a++){
            for(int sp = 1 ; sp <= space ; sp++){
                System.out.print(" ");
            }
            for(int b = 1 ; b <= rows ; b++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
    }
}