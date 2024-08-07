public class counting_sort_descending {
    public static void counting_sort(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int count_frequency[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count_frequency[arr[i]]++;
        }
        for(int j=0,i=count_frequency.length-1;i>=0;i--){
            while(count_frequency[i]>0){
                arr[j]=i;
                j++;          
                count_frequency[i]--;
            }
        }
    }
    public static void main(String args[]){
    int arr[]={3,6,2,1,8,7,4,5,3,1};
    counting_sort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }        
    }    
}
