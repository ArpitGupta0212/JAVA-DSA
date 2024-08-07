public class tapping_water1 {
    public static int tapped(int height[],int width){
        int left_max[]=new int [height.length];
        int right_max[]=new int [height.length];
        // calculate for left max array
        for(int i=0;i<height.length;i++){
            if(i==0){
                left_max[i]=height[i];
            }
            else{
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }}
       // calculate for left max array
        for(int i=height.length-1;i>=0;i--){
            if(i==height.length-1){
                right_max[i]=height[i];
            }
            else{  
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }}
        int water=0;
        int total_water=0;
        for(int i=0;i<height.length;i++){
            water=(Math.min(left_max[i],right_max[i])-height[i])*width;
            total_water+=water;
        }    
        return total_water;    
    }
    public static void main(String args[]){
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(tapped(height,1));
    }
}
