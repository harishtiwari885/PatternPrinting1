import java.util.*;
public class RightAngledNumberTriangle24 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1 ; a <= rows ; a++){
            for(int b = rows - 1 ; b >= a ; b--){
                System.out.print("1");
            }
            for(int c = 1 ; c <= a ; c++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}