public class binary_to_decimal {
    public static int binary(int n){
        int last=0;
        int pow=0;
        int num=0;
        while(n!=0){
            last=n%10;
            num+=last*Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        return num;
    }
    public static void main(String args[]){
        System.out.println(binary(10));
    }
}

