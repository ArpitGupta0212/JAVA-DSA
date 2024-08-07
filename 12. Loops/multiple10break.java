import java.util.*;
public class multiple10break {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i!=0){
            int num=sc.nextInt();
            i=num%10;
            
            if(num%10==0){
                break;
            }
            System.out.println(num);
        }
        sc.close();
    }
}
