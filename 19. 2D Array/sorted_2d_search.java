public class sorted_2d_search {
    public static void main(String args[]){
        int arr[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        search(arr,32 );
    }
    public static void search(int arr[][],int key){
        int i=arr.length-1;
        int j=0;
        while(i!=0 && j!=arr.length-1 ){
            if(key==arr[i][j]){
                System.out.println("i = "+i+" , j = "+j);
                return;
            }
            else if(key<arr[i][j]){
                i--;
            }
            else{
                j++;
            }
        }
        System.out.println("Does not exist");
        return;
    }
}
