public class unary_operator {
    public static void main(String args[]){
        int a=10;
        int b=++a;
        System.out.println(a+" "+b);
        a=b++;
        b=a--;
        a=--b;
        System.out.println(a+" "+b);
    }
}
