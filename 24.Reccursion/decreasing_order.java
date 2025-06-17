public class decreasing_order{
    public static void main(String[] args) {
        System.out.println();
        dec(10);
    }
    public static void dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }
}