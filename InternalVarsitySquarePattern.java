public class InternalVarsitySquarePattern{
    public static void main(String[] args){
        int rows = 4;
        int col = 3;
        int c=1;
        for(int a = 1 ; a <= rows ; a++){
            for(int b = 1 ; b <= col ; b++){
                if(a== 1 || a== rows || b==1 || b== col){
                    System.out.print("3");
                }
                else{
                    System.out.print(c);
                    c++;
                }
            }
            System.out.println();
            
        }
    }
}