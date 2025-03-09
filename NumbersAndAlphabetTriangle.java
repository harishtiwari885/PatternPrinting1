public class NumbersAndAlphabetTriangle{
    public static void main(String[] args){
        int rows = 5;
        for(int a= 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= a ; b++){
                if(a == 2 || a== 4){
                    int c = b + 64;
                    char ch = (char) c ;
                    System.out.print(ch + " ");
                }
                else{
                    System.out.print(b + " ");
                }
            }
            System.out.println();
        }
    }
}