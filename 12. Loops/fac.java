import java.util.*;
public class fac {
    public static void main(String args[]){
        int fac=1;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num;i>1;i--){
            fac*=i;
        }
        System.out.println(fac);
        sc.close();
    }
}
                                                                  