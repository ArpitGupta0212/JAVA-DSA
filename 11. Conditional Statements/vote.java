import java.util.*;
public class vote{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("elligible for voting");
        }
       else if (age>13 && age<18) {
            System.out.println("teenager");
        }
        else{
            System.out.println("Not elligble for voting");
        }
        sc.close();
    }
}