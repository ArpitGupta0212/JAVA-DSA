public class prefix_sum_array {
    public static  int prefix_sum(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int prefix_arr[]=new int[arr.length];
        for(int i=1;i<prefix_arr.length;i++){
            prefix_arr[0]=arr[0];
            prefix_arr[i]=arr[i]+prefix_arr[i-1];
        }
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){//start
            for(int j=i;j<arr.length;j++){//end
                pre_sum=i==0?prefix_arr[j]:prefix_arr[j]-prefix_arr[i-1];
                if(pre_sum>max_sum){
                    max_sum=pre_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        System.out.println(prefix_sum(arr));
    } 
}
