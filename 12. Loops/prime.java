import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean prime=true;
        if(n==2){
            prime=true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){//if u want to use n-1 in place of Math.srt(n)
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime==true){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not prime number");
        }
        sc.close();
    }
}
