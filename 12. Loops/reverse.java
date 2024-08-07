import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int rem=1;
        for(;0<num;num=num/10){
            rem=num%10;
            System.out.print(rem+"");
        }

    }
}
