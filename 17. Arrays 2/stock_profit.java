public class stock_profit {
    public static int profit(int prize[]){
        int buy=Integer.MAX_VALUE;
        int maxprofit1=0;
        for(int i=0;i<prize.length;i++){
            if(buy<prize[i]){
                int profit1=prize[i]-buy; //today's profit
                maxprofit1=Math.max(profit1,maxprofit1);
            }
            else{
                buy=prize[i];
            }
        }
        if(maxprofit1<=0){
            return 0;
        }
        else{
            return maxprofit1;
        }
    }
    public static void main(String args[]){
        int prize[]={7, 6, 4,  3, 1};
        System.out.println(profit(prize));
    }   
}
