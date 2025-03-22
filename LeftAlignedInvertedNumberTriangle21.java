mport java.util.*;
public class LeftAlignedInvertedNumberTriangle21 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1 ; a <= rows ; a++){
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