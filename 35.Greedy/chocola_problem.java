import java.util.*;
public class chocola_problem {
    public static void main(String[] args) {
        int n=4;int m=6;
        Integer horizintal[]={4,1,2};
        Integer vertical[]={2,1,3,1,4};
       Arrays.sort(horizintal,Collections.reverseOrder());
       Arrays.sort(vertical, Collections.reverseOrder());
       int h=0;
       int v=0;
       int hp=1;
       int vp=1;
       int cost=0;
       while (h<horizintal.length && v<vertical.length) {
        if(horizintal[h]>=vertical[v]){
            cost+=(horizintal[h]*vp);
            h++;
            hp++;
        }else{
            cost+=(vertical[v]*hp);
            v++;
            vp++;
        }
       }
       while (h<horizintal.length) {
            cost+=(horizintal[h]*vp);
            h++;
            hp++;
       }
       while (v<vertical.length) {
            cost+=(vertical[v]*hp);
            vp++;
            v++;
       }
       System.out.println();
       System.out.println(cost);
    }
}
