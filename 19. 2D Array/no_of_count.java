public class no_of_count {
    public static void main(String args[]){
        int arr[][]={{4,7,8},
    {8,8,7}
    };
    int n=7;
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==n){
                count++;
            }
        }
    }
    System.out.println(count);
    }
}
