import java.util.Scanner;

public class LeftHalfNumberAlphabetTriangle34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking rows value from the user
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");

        char ch = 'A';
         
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
             
            for (int j = i + 1; j <= rows; j++) {
                System.out.print(ch);
            }
             
            ch++;
             
            System.out.println();
        }

        // Close the scanner resource
        sc.close();
    }
}