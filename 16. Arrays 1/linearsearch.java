public class linearsearch {
    public static int linear(int n[],int key){
        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;
        System.out.println(linear(number, key));
    }
}
