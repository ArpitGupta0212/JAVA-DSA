public class pair_array {
    public static void pair(int num[]){
        int total_pair=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println(total_pair);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        pair(arr);
    }
}
