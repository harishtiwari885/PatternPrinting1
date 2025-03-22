import java.util.*;
public class DiagonalNumberPattern25 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 0 ; a < rows ; a++){
            for(int b = 0; b < rows ; b++){
                if(a == b){
                    System.out.print(a);
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}