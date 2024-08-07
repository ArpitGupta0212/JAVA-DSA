public class array_function {
    public static void update(int marks[]){
        for(int i=0;i<3;i++){
            marks[i]+=1;
        }
    }
    public static void main(String args[]){
        int marks[]={23,45,67};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
// in  array functions arguments are call by refrence the value of array in change in function then reflect in the othe main function in other casses in function on call by value is their no reflect in values.