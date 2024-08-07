public class trapping_water {
    public static int trapping(int height[],int width){
        if(height.length<3){
            return 0;
        }
        int left_max[]=new int [height.length];
        int right_max[]=new int [height.length];
        // calculate the left max array i.e helping array 
        for(int i=0;i<height.length;i++){
            if(i==0){
                left_max[i]=height[i];
            }
            else{
                left_max[i]=Math.max(height[i],left_max[i-1]);
            }
        }
        // calculate the right max array i.e helping array
        for(int i=height.length-1;i>=0;i--){
            if(i==(height.length)-1){
                right_max[i]=height[i];
            }
            else{
                right_max[i]=Math.max(height[i],right_max[i+1]);
            }
        }
        int volume=0;
        int water=0; 
         
        for(int i=0;i<height.length;i++){  
            // calculate water level by using min function between the rightmax and left max
            water=Math.min(right_max[i],left_max[i]);
            // calculate the trapped water
            volume+=water-height[i];

        }
        return volume;
    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(trapping(arr,1));
    }
}
