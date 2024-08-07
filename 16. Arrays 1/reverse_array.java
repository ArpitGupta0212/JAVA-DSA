public class reverse_array {
    public static void reverse(int num[]){
        int start=0,last=num.length-1;
        while(start<last){
            int temp=num[start];
            num[start]=num[last];
            num[last]=temp;
            start++;
            last--;
        }
    }
    public static void main(String args[]) {
        int number[]={2,4,6,8,10};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
