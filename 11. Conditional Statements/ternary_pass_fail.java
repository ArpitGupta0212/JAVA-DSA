import java.util.*;
public class ternary_pass_fail {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String result=marks<33 ? "fail":"pass";
        System.out.println(result);
        sc.close();
    }
}
