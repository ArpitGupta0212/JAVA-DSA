public class anagrams{
    public static void main(String args[]){
        String str="care";
        String str2="sex";
        boolean ans=false;
        for(int i=0;i<str.length();i++){
            ans=false;
            for(int j=0;j<str2.length();j++){
                if(str.charAt(i)==str2.charAt(j)){
                    ans=true;
                    break;
                }
                else{
                    ans=false;
                }
                if(ans==false){
                    break;
                }
            }
            if(ans==false){
                break;
            }

        }
        System.out.println(ans);
    }
}