public class ZeroAndOneTriangle{
    public static void main(String[] args){
        int row = 5;
        for(int a =1 ; a <= row ; a++){
            for(int b = 1; b <= a ; b++){
                if((a + b) % 2 == 0){
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}