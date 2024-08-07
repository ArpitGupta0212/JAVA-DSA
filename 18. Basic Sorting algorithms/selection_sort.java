public class selection_sort{
    public static void selection(int arr[]){
        // 1st loop for count for turns
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
    public static void main(String args[]){
        int arr[]={7,8,-9,7,5};
        selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}