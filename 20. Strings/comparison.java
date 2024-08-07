public class comparison {
    public static void main (String args[]){
        String str1="tony";
        String str2="tony";
        String str3=new String("tony");
        if(str1==str2){
            System.out.println("equal");
        }
        else{
            System.out.println("not");
        }
        if(str1==str3){
            System.out.println("equal");
        }
        else{
            System.out.println("not");
        }
        // in string we preffered equals function to compare
        if(str1.equals(str3)){
            System.out.println("equal");
        }
        else{
            System.out.println("not");
        }
    }
}
