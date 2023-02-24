package AnisulIslam;

public class Teacher {
    String name;
    int age;
    Teacher(){
        System.out.println("No Value");
    }
    Teacher(String n,int x){
        name=n;
        age=x;
       
        
    }
    void DisplayInfo(){
        System.out.println(name+" "+age);
    }
}
