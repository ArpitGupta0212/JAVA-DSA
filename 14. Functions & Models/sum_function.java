import java.util.*;
public class sum_function {
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(sum(num1,num2));
        sc.close();    
    }
}
