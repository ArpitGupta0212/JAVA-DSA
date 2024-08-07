import java.util.*;
public class sum_even_odd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum_even=0;
        int sum_odd=0;
        // enter n=0 for stop the program
        while(true){
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num%2==0){
                sum_even+=num;
            }
            else{
                sum_odd+=num;
            }
            System.out.println("For stop the loop enter the 0");
        }
        System.out.println(sum_even);
        System.out.println(sum_odd);
        sc.close();
    }
}
