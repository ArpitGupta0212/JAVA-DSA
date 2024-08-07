public class largest {
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana","z"};
        String largest="";
        for(int i=0;i<fruits.length-1;i++){
            // compare to use comparison string in lexographical order in this a!=A but in compare ignore case a==A is a
            if(fruits[i].compareToIgnoreCase(fruits[i+1])==0){
                largest=fruits[i+1];
            }
            else if(fruits[i].compareToIgnoreCase(fruits[i+1])>0){
                largest=fruits[i];
            }
            else{
                largest=fruits[i+1];
            }
        }
        System.out.println(largest);
    }
}
