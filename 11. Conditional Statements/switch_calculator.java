import java.util.*;
public class switch_calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+': System.out.println(num1+num2);
            break;
            case '-': 
            if(num1>num2){
            System.out.println(num1-num2);
            }
            else{
                System.out.println(num2-num1);
            }
            break;
            case '*':System.out.println(num1*num2);
            break;
            case '/': if(num1>num2){
                System.out.println(num1/num2);
            }
            else{
                System.out.println(num2/num1);
            }
            break;
            case '%':if(num1>num2){
                System.out.println(num1%num2);
            }
            else{
                System.out.println(num2%num1);
            }
            break;
            default:System.out.println("no operation");
            sc.close();
        }
    }
}
