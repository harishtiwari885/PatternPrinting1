import java.util.*;
public class LeftHalfNumberTriangleWithStars36 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1; a <= rows ; a++){
            for(int nst = 1 ; nst <= rows - a; nst++){
                System.out.print("*" + " ");
            }
            for(int b = 1 ; b <= a ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}