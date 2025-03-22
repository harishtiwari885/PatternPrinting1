import java.util.*;
public class FloydsTriangle28 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        int c = 1;
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1; b <= a ; b++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}