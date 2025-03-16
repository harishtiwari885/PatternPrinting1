import java.util.*;
public class ReverseNumberTrianglePatternPP99 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int rows = j.nextInt();
        for(int a = rows; a >= 1; a--){
            for(int b = 1; b <= a ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
