import java.util.Arrays;
import java.util.Comparator;

public class activity {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int arr[][]=new int[start.length][3];
        for(int i=0;i<arr.length;i++){
            arr[i][0]=i;
            arr[i][1]=start[i];
            arr[i][2]=end[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));
        int c=1;
        int prev=arr[0][2];
        for(int i=1;i<arr.length;i++){
            if(prev<=arr[i][1]){
                c++;
                prev=arr[i][2];
            }
        }
        System.out.println();
        System.out.println(c);
    }
}
