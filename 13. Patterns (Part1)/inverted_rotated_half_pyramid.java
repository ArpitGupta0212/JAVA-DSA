public class inverted_rotated_half_pyramid{
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int z=1;z<=i;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}