import java.util.Arrays;
import java.util.Collections;
public class inbuilt_sort {
   public static void main(String args[]){
    // arr act as a object of class integer
    Integer arr[]={1,2,9,7,6,2,9,0};
    // Arrays.sort(arr);
    // Arrays.sort(arr,0,4);
    // Arrays.sort(arr,Collections.reverseOrder());
    Arrays.sort(arr,0,5,Collections.reverseOrder());
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
} 
}
