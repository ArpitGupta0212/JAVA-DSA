import java.util.*;
public class creation_two_d_array{
    public static void main(String args[]){
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int m=arr.length,n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    sc.close();
    }
}