public class decimal_to_binary {
    public static int decimal(int n){
        int mod=0;
        int result=0;
        int pow=0;
        while (n!=0) {
            mod=n%2;
            result+=mod*Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(decimal(3));
    }
}
