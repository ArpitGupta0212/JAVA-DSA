import java.util.*;
public class max_length_chain_pairs {
    public static void main(String[] args) {
        
    
    int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
    
    Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
    int prev=pairs[0][1];
    int c=1;
    for(int i=1;i<pairs.length;i++){
        if(prev<=pairs[i][0]){
            prev=pairs[i][1];
            c++;
        }

    }
    System.out.println();
    System.out.println(c);
}
}
