import java.util.*;
public class positive_negative{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("positive number");
        }
        sc.close();
    }
}