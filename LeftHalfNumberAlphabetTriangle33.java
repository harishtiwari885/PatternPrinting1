import java.util.*;
public class LeftHalfNumberAlphabetTriangle33 {
    public static void main(String[] args){
        Scanner j = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = j.nextInt();
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= rows ; b++){
                if(b <= a){
                    System.out.print(b + " ");
                }
                else{
                    int d = a + 64;
                    char ch = (char) d ;
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
}