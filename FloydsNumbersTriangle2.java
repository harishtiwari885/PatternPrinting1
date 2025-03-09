public class FloydsNumbersTriangle2{
    public static void main(String[] args){
        int row = 5 ;
        int c = 1;
        for(int a = 1 ; a<= row ; a++){
            for(int b = 1 ; b <= a ; b++){
                System.out.print(c + " ");
            }
            System.out.println();
            c++;
        }
        
    }
}