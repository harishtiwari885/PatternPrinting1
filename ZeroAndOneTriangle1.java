public class ZeroAndOneTriangle1{
    public static void main(String[] args){
        int row = 5;
        int a = 1;
        int c;
        while(a <= row){
            if(a==1){
                c=1;
            }
            else{
                c= 0;
            }
            int b = 1;
            while(b <=a){
                System.out.print(c + " ");
                if(c==1){
                    c=0;
                }
                else{
                    c=1;
                }
                b++;
            }
            System.out.println();
            a++;
        }
    }
}