import java.util.*;
public class RightAlignedNumberTriangle18 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = rows ; a >= 1 ; a--){
            for(int sp = 1 ; sp <= a -1 ; sp++){
                System.out.print(" ");
            }
            for(int b = a ; b <= rows ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}