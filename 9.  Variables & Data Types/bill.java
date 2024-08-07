import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill=pencil+pen+eraser;
        float total_bill=bill+0.18f*bill;
        System.out.println(total_bill);
        sc.close();
    }
}
