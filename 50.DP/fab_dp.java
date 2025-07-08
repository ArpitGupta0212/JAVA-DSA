public class fab_dp{
    public static void main(String[] args) {
        int dp[]=new int[6];
        System.out.println();
        System.out.println(fab(5,dp)) ;
    }
    public static int fab(int n,int dp[]){
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        
        dp[n]=fab(n-1, dp)+ fab(n-2, dp);
        return dp[n];
    }
}