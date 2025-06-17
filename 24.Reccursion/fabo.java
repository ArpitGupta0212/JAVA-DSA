public class fabo{
    public static int fabo(int n){
        if(n==0 || n==1 ){
            return 1;
        }
         int x=fabo(n-1)+fabo(n-2);
         return x;
    }
    public static void main(String args[]){
        System.out.println();
        System.out.println(fabo(5));
    }
}