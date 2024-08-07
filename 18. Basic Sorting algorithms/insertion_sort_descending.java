public class insertion_sort_descending {
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String args[]){
    int arr[]={3,6,2,1,8,7,4,5,3,1};
    insertion_sort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
