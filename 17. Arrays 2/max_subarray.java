public class max_subarray{
    public static int max_sub(int arr[]){
        int sum_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){//for start
            for(int j=i;j<arr.length;j++){//for end
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(sum+" ");
                    if(sum>sum_max){
                        sum_max=sum;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        return sum_max;
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        System.out.println("sum is = "+max_sub(arr));
    }
}