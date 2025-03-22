import java.util.*;
public class LeftHalfNumberTriangle29 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= rows ; b++){
                if(b <= a){
                    System.out.print(b + " ");
                }
                else{
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}