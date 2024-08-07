public class largest_num {
    public static int larger(int num[]){
        int larg=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>larg){
                larg=num[i];
            }
            if(num[i]<small){
                small=num[i];
            }
        }
        System.out.println(small);
        return larg;
    }
    public static void main(String args[]){
        int number[]={1,2,6,3,5};
        System.out.println(larger(number));
    }
}
