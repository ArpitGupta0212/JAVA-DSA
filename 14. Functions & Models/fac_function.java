import java.util.*;
public class fac_function{
    public static int fac(int n){
        int fac=1;
        for(int i=n;i>0;i--){
            fac*=i;
        }
        return fac;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=fac(num);
        System.out.println(fact);
        sc.close();
    }
}