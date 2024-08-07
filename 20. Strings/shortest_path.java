public class shortest_path {
    public static void main(String args[]){
        String str="WNEENESENNN";
        shortt(str);
    }    


    public static boolean shortt(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else{
                System.out.println("Not valid cordinate");
                return false;
            }
        }
        System.out.println(Math.sqrt((x*x)+(y*y)));
        return true;
    }
}
