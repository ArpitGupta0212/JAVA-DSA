import java.util.*;
public class ternary_even_odd {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    String output=num%2==0? "even":"odd";
    System.out.println(output);
    sc.close();
   } 
}
