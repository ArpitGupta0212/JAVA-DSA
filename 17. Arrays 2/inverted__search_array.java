public class inverted__search_array {
    public static int inverted(int arr[],int target){
        int mini=min(arr);
        // find in sorted left
        if(arr[mini]<=target && target<=arr[arr.length-1]){
            return search(arr,mini,arr.length-1,target);
        }
        // find in sorted right
        else{
            return search(arr,0,mini,target);
        }
    }
    public static int search(int arr[],int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int min(int arr[]){
        int start=0,end=arr.length-1,mid=0;
        while(start<end){
            mid=(start+end)/2;
            if(mid>0 && arr[mid-1]>arr[mid]){
                return mid;
            }
            else if(arr[mid-1]<arr[mid] && arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
             
        }
        return end;
    }
    public static void main(String args[]){
        int arr[]={4,  5, 6, 7, 0, 1, 2};
        System.out.println(inverted(arr,3));
    }
}
