package AnisulIslam;

public class Set {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setinfo("Nafiur",22);
        t1.print();

    }

    
}
class Teacher{
    String name;
    int age;
    void setinfo(String a,int b){
        name=a;
        age=b;
    }
    void print(){
        System.out.println(name);
        System.out.println(age);
    }

}