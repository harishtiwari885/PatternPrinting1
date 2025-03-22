import java.util.*;
public class HourglassNumberPattern6 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = rows ; a >= 1 ; a--){
            for(int b = 1; b <= a ; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
        for(int c = 2 ; c <= rows ; c++){
            for(int d = 1 ; d <= c ;d++){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }
}