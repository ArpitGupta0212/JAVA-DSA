
public class sum_digits {
    public static int sumdigit(int n){
        int sum=0;
        int digit=0;
        while(n!=0){
            digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(sumdigit(87363));  
    }
}
