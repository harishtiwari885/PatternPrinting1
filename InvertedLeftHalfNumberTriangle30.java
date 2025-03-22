import java.util.*;
public class InvertedLeftHalfNumberTriangle30 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = rows ; a >= 1 ; a--){
            for(int b = 1 ; b <= rows ; b++){
                if(b < a){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(b + " ");
                }
            }
            System.out.println();
        }
    }
}