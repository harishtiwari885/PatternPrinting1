import java.util.*;
public class StarNumberTriangle27 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b < 2 * a ; b++){
                if(a == b){
                    System.out.print(a);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}