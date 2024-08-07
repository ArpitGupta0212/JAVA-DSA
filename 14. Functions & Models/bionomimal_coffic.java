import java.util.*;
public class bionomimal_coffic {
    public static int fac(int n){
        int fac=1;
        for(int i=n;i>0;i--){
            fac*=i;
        }
        return fac;
    }
    public static int biono(int n,int r){
        int n_fac=fac(n);
        int r_fac=fac(r);
        int n_r_fac=fac(n-r);
        int binomial=n_fac/(r_fac*n_r_fac);
        return binomial;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(biono(n,r));
        sc.close();
    }
}
