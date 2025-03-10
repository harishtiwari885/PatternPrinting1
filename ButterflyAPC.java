public class ButterflyAPC{
    public static void main(String[] args){
        int rows = 4;
        for(int a = 1 ; a <= rows ; a++){
            //for upper half
            for(int b=1 ; b <=a ; b++){
                System.out.print("*");
            }
            for(int sp = 1 ; sp <= 2 * (rows -a) ; sp++){
                System.out.print(" ");
            }
            for(int c =1 ; c <= a ; c++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int d = rows ; d >=1 ; d--){
            for(int f = 1 ; f <= d ; f++){
                System.out.print("*");
            }
            for(int sp1 = 1 ; sp1 <= 2 * (rows -d) ; sp1++){
                System.out.print(" ");
            }
            for(int h = 1 ; h <= d ; h++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}