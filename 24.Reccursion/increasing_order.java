public class increasing_order{
    public static void main(String[] args) {
        System.out.println();
        inc(10);
    }
    public static void inc(int n){
        if(n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);
    }
}