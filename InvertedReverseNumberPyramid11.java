import java.util.*;
public class InvertedReverseNumberPyramid11 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = rows ; a >= 1 ; a--){
            for(int sp = 1 ; sp <= (rows - a ) * 2 ; sp++){
                System.out.print(" ");
            }
            for(int b = a ; b >= 1 ; b--){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}