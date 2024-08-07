public class selection_sort_descending{
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int max=i;
            for(int j=i;j<arr.length;j++){
            if(arr[j]>arr[max]){
                max=j;
            }}
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }

    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selection_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    } 
}