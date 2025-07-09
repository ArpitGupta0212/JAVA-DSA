import java.util.*;
public class Indian_coin {
    public static void main(String args[]) {
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int amount=1059;
        int count=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    amount-=coins[i];
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
