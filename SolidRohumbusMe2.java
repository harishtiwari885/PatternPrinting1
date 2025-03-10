public class SolidRohumbusMe2{
// shradha mam has done the same but i have done this.
    public static void main(String[] args){
        int rows = 5;
        for(int a = 1 ; a <= rows ; a++){
            for(int sp = 1 ; sp <= rows - a ; sp++){
                System.out.print(" ");
            }
            for(int b = 1 ; b <= rows ; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}