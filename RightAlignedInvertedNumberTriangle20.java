import java.util.*;
public class RightAlignedInvertedNumberTriangle20 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = rows ; a >= 1 ; a--){
            for(int sp = 1 ; sp <= a - 1 ; sp++){
                System.out.print(" ");
            }
            for(int b = rows ; b >= a ; b--){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}