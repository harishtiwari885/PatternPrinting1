public class HollowRectangle1{
    public static void main(String[] args){
        int row = 4;
        int col = 5;
        //outer loop
        for(int a= 1; a <= row ; a++){
            //inner loop
            for(int b = 1 ; b <= col ; b++){
                if(a==1 || b==1 || a==row || b==col){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}