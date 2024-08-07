public class palindrome {
    public static boolean palin(int n){
        int rev=0;
        int num=n;
        while(n!=0){
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        if(rev==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(palin(165));
    }
}
