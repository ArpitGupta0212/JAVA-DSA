import java.util.*;
public class income_tax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double income =sc.nextDouble();
        double tax;
        if(income<500000){
            tax=0;
            System.out.println(tax);
        }
        else if(income>=500000 && income<1000000){
            tax=0.2*income;
            System.out.println(tax);
        }
        else{
            tax=0.3*income;
            System.out.println(tax);
        }
        sc.close();
    }
}
