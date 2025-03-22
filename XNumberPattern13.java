import java.util.*;
public class XNumberPattern13 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1; a <= rows ; a++){
            for(int sp = 1; sp <= (a - 1) * 2 ; sp++){
                System.out.print(" ");
            }
            for(int b = a  ; b <= rows ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
        for(int c = rows - 1; c >= 1; c--){
            for(int sp = 1 ; sp <= (c - 1) * 2; sp++){
                System.out.print(" ");
            }
            for(int d = c; d <= rows; d++){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}