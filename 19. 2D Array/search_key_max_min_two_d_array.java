import java.util.*;
public class search_key_max_min_two_d_array {
    public static boolean search_key(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.println(i+","+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static int search_max(int arr[][]){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                   max=arr[i][j];
                }
            }
        }
        return max;
    }    
    public static int search_min(int arr[][]){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        search_key(arr,6);
        System.out.println(search_max(arr));
        System.out.println(search_min(arr));
    sc.close();
    }
}
