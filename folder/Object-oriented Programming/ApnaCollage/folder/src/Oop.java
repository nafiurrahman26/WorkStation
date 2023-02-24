class pen{
    String colour,type;
    public void write(){
        System.out.println(colour);
        System.out.println(type);
        System.out.println("Write somethong");
    }
}
public class Oop {
    public static void main(String[] args){
        pen pen1=new pen();
        pen1.colour="Red";
        pen1.type="Gel";
        pen1.write();
        pen pen2=new pen();
        pen2.colour="Blue";
        pen2.write();

        Student s1=new Student();
        s1.name="Sabbir";
        s1.write();
    }
}
class Student{
    String name;
    public void write(){
        System.out.println(name);
    }
}