// Kth largest odd number in a given range
import java.util.*;
public class kth_lagest_odd {
    public static void main(String[] args) {
        int l=-10;
        int r=10;
        int k=8;
        int ans=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=r;i>=l;i--){
            if(i%2!=0){
                ans=i;
                c++;
                if(c==k){
                    break;
                }
            }
        }
        System.out.println();
        System.out.println(ans);
    }
}
