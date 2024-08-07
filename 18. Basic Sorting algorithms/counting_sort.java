public class counting_sort {
    public static void counting(int arr[]){
        int max=arr[0];
        // max value for array
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        // frequency for in count array
        int count_frequency[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count_frequency[arr[i]]++;
        }
        // for sorting in count array
        int j=0;
        for(int i=0;i<count_frequency.length;i++){
            while(count_frequency[i]>0){
                arr[j]=i;
                j++;
                count_frequency[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        counting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
