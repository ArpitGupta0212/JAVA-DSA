public class uppercas {
    public static void main(String args[]){
        StringBuilder str=new StringBuilder("hey i am arpit");
        StringBuilder ans=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        ans.append(ch);
        for(int i=1;i<str.length();i++){
            ch=str.charAt(i);
            if(ch==' ' & i<str.length()-1){
                ans.append(ch);
                ch=str.charAt(i+1);
                ch=Character.toUpperCase(ch);
                ans.append(ch);
                i++;
            }
            else{
                ans.append(ch);
            }
        }
    
    System.out.println(ans);
}
}
