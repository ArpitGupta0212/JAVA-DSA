import java.util.*;
public class product_function {
    public static int multi(int a,int b){
        int mul=a*b;
        return mul;
    }   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2=sc.nextInt();
        int product=multi(num1, num2);
        System.out.println(product);
        sc.close();
    }
}
