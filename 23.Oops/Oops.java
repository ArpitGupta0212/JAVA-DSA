public class Oops{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("yellow");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
        p1.color="black";
        System.out.println(p1.color);
        }
}

class Pen{
    String color;
    int tip;
    
    void setcolor(String newColor){
        color=newColor;
    }
    
    void setTip(int newTip){
        tip=newTip;
    }
}
class student{
    String name;
    int age;
    float percentage;
    
    int calculatePercentage(int sci,int math, int hindi){
        return (sci+math+hindi)/3;
    }
}