public class compression {
    public static void main(String args[]){
        String str="aaabbcccdd";
        String ans="";
        Integer count;
        // prev ch='';
        for(int i=0;i<str.length();i++){
            count=1;
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            ans+=str.charAt(i);
            if(count>=1){
                ans+=count.toString();
            }
        }
        
     System.out.println(ans);
}
}