import java.util.*;
public class count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            String sub=str.substring(i,i+1);
            if(sub.compareTo("a")>=0 && sub.compareTo("z")<=1 ){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
