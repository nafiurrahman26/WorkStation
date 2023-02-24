import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student(22,3434.34,"221-15-5871");
        s1.display();
        Student s2=new Student();
        Scanner input=new Scanner(System.in);

        System.out.println("\tInput Session: ");
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.println("Your number is: "+s2.display(num));

        System.out.print("Enter double type number: ");
        double d=input.nextDouble();
        System.out.println("Your double value is: "+s2.display(d));

        System.out.println("Thank me later!\nGet Lost.");
        input.close();
        
    }
    
}
class Student{
    public int age;
    public double salary;
    private String id;

    Student(){

    }
    public Student(int I,double D,String S){
        this.age=I;
        this.salary=D;
        this.id=S;

    }
    public void display(){
        System.out.println("Your Age is: "+age);
        System.out.println("Your salary is: "+salary);
        System.out.println("Your id is: "+id);

    }
    public int display(int i2){

        return i2;
    }
    public double display(double salary){
        return salary;
    }
    
}
