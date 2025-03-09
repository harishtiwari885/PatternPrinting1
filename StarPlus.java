public class StarPlus{
    public static void main(String[] args){
        int rows = 5;
        for(int a = 1 ; a <= rows ; a++){
            for(int b= 1 ; b <= rows ; b++){
                if(a == 3 || b==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}