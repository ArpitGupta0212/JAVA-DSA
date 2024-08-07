import java.util.*;

public class array_define{
    public static void main(String args[]){
        int marks[]=new int[10];
        // int number[]={1,2,3};
        // String fruit[]={"mango","apple"};
        // char alpha[]={'a','b','c'};
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            marks[i]=sc.nextInt();
        }
        int percen=0;
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
            percen+=marks[i];
        }
        System.out.println(percen/3);
        System.out.println(marks.length);
        sc.close();
    } 
}