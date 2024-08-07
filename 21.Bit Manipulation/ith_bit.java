public class ith_bit {
    public static int get_ith_bit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int set_ith_bit(int n,int i){
        int bitmask=1<<i;
        return (n|bitmask);
    }
    public static int clear_ith_bit(int n,int i){
        int bitmask=~(1<<i);
        return (n&bitmask);
    }
    public static int update_ith_bit(int n,int i,int newbit){
        if(newbit==0){
            return clear_ith_bit(n, i);
        }
        else{
            return set_ith_bit(n, i);
        }
    }
    public static int clear_last_ith_bit(int n,int i){
        int maskbit=-1
    }
    public static void main(String args[]){
        System.out.println(clear_last_ith_bit(15, 2));
    }
}