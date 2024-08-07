import java.util.*;
public class check_even_odd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bitmask=1;
        int n=sc.nextInt();
        if((n & bitmask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    sc.close();
    }
}
