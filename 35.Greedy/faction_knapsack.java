import java.util.*;
public class faction_knapsack {
    public static void main(String args[]){
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int c=50;
        double ratio[][]=new double [weight.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int x=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];

            if(weight[idx]<=c){
                c=c-weight[idx];
                x+=value[idx];
            }else{
                x+=(c*ratio[i][1]);
                c=0;
                break;
            }
        }
        System.out.println();
        System.out.println(x);
        
    }
}
