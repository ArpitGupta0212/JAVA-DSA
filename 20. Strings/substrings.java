public class substrings {
    public static String substring(String str,int strt,int last){
        String substr="";
        for(int i=strt;i<last;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="hello world";
            System.out.println(str.substring(2,8));
        System.out.println(substring(str,2,8));
    }   
}
