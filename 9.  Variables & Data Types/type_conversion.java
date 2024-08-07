import java.util.*;
public class type_conversion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextLong();
        float b=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        sc.close();
        // possible conversion is byte>short>int>float>long>double
    }
}
