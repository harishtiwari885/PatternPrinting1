import java.util.*;
public class DiamondNumberPattern5 { // Renamed class with numbering
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
        for(int c = rows - 1 ; c >= 1 ; c--){
            for(int d = 1; d <= c ; d++){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}