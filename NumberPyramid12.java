import java.util.*;
public class NumberPyramid12 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1 ; a <= rows ; a++){
            for(int sp = 1 ; sp <= (rows - a) * 2 ; sp++){
                System.out.print(" ");
            }
            for(int b = 1 ; b <= a ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}