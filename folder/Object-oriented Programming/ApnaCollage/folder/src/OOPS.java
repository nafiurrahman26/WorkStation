// import java.util.Scanner;

class Shape{
    String color;
    public void area(){
        System.out.println("Dispaly area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
    
}
class EquslateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
public class OOPS { 
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="Red";
    }
}
