public class HollowPyramidStarPattern{
    public static void main(String[] args){
        int row = 4;
        for(int a =1 ; a <= row ; a++){
            for(int sp =1 ; sp <= row -a ; sp++){
                System.out.print(" ");
            }
            for(int b= 1 ; b <= (2 * a) -1 ; b++){
                if(b== 1 || a== 4 || b==(2 *a) -1){
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