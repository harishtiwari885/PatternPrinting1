import java.util.*;
public class RepeatingNumberPyramid16 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1 ; a <= rows ; a++){
            for(int sp = 1; sp <= rows - a ; sp++){
                System.out.print(" ");
            }
            for(int b = 1 ; b <= a ; b++){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}