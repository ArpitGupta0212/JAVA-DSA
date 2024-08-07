public class diagnol_sum {
    public static int diag_sum(int arr[][]){
        int primary_diag=0;
        int secondry_diag=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             primary_diag+=arr[i][j];
        //         }
        //         if(i+j==arr.length-1){
        //             secondry_diag+=arr[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<arr.length;i++){
            primary_diag+=arr[i][i];
            if(i!=arr.length-1-i){
            secondry_diag+=arr[i][arr.length-1-i];//i+j=n-1=>j=n-1-i put this behalf of j
        }
    }
        return primary_diag+secondry_diag;
    }
    public static void main(String args[]){
    // int arr[][]={
    //     {1,2,3,4},
    //     {5,6,7,8},
    //     {9,10,11,12},
    //     {13,14,15,16},
    // };
    int arr[][]={
        {1,1,1,1,1},
        {2,2,2,2,2},
        {3,3,3,3,3},
        {4,4,4,4,4},
        {5,5,5,5,5}
    };
    System.out.println(diag_sum(arr));        
    }
}
