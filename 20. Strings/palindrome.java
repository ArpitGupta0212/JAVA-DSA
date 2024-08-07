public class palindrome {
    public static void main(String args[]){
        String str="raclcar";
        System.out.println(check_palin(str));
    }
    public static boolean check_palin(String str){
        for(int i=0;i<(str.length())/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
