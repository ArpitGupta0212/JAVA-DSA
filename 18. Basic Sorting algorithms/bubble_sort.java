public class bubble_sort{
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);}
    }
}