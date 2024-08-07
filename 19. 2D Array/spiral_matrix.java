public class spiral_matrix {
    public static void spiral_print(int arr[][]){
        int start_row=0;
        int last_row=arr.length-1;
        int start_colm=0;
        int last_colm=arr[0].length-1;
        while(start_row<=last_row && start_colm<=last_colm){
            // top boundry
            for(int j=start_colm;j<=last_colm;j++){
            System.out.print(arr[start_row][j]+" ");
            }
            // right boundry
            for(int i=start_row+1;i<=last_row;i++){
            System.out.print(arr[i][last_colm]+" ");
            }
            // bottom boundry
            for(int j=last_colm-1;j>=start_colm;j--){
                // 
                if(start_row==last_row){
                    break;
                }
            System.out.print(arr[last_row][j]+" ");
            }
            // left boundry 
            for(int i=last_row-1;i>=start_row+1;i--){
                // 
                if(last_colm==start_colm){
                    break;
                }
                System.out.print(arr[i][start_colm]+" ");
            }
            start_row++;
            start_colm++;
            last_row--;
            last_colm--;
        }        
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiral_print(arr);
    }
}
