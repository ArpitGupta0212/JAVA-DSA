import java.util.*;
public class inputs {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    String name=sc.nextLine();
    String name1=sc.next();
    int num=sc.nextInt();
    float price=sc.nextFloat();
    long num1=sc.nextLong();
    double price1=sc.nextDouble();
    byte bt=sc.nextByte();
    short sh=sc.nextShort();
    boolean bo=sc.nextBoolean();
    System.out.println(num);
    System.out.println(num1);
    System.out.println(name);
    System.out.println(name1);
    System.out.println(price);
    System.out.println(price1);
    System.out.println(bt);
    System.out.println(sh);
    System.out.println(bo);
    sc.close();
    }
}
