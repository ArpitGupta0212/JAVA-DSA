import java.util.*;
public class mltiple_10_continue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    do{
        int num=sc.nextInt();
         if(num==0){
            break;
        }
        if(num%10==0){
            continue;
        }
       
        System.out.println(num);
    }while(true);
    sc.close();
    }
}
