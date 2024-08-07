public class kadanes_sub_array_sum {
    public static int kadanes_algo(int num[]){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            if(sum<0){
                sum=0;
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanes_algo(arr));
    }
}
