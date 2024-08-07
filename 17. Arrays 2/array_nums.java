import java.util.*;
public class array_nums {
    public static boolean repeat(int num[]){
        int count=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[j]==num[i]){
                    count++;
                }
            }
        }
        if(count!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        // length of array input
        int length=sc.nextInt();
        int num[]= new int[length];
        for(int i=0;i<length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(repeat(num));
        sc.close();
    }
}
