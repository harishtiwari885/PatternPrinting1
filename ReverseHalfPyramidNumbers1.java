import java.util.*;
public class ReverseHalfPyramidNumbers1 { // Renamed class with numbering
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = rows; a >= 1 ; a--){
            for(int b = rows ; b >= a  ; b--){
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
