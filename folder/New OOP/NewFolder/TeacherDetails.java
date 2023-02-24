package OOP.NewFolder;

import java.util.Scanner;

public class TeacherDetails {
    public static void main(String[] args){
    try(Scanner input=new Scanner(System.in)){

        Teacher bangla=new Teacher();
        System.out.println("Details: name,phone,age.");

        bangla.name=input.nextLine();
        bangla.phone=input.nextLine();
        bangla.age=input.nextInt();
        bangla.print();

        Teacher english=new Teacher();
        System.out.println("Details: name,phone,age.");
        english.name=input.nextLine();
        english.phone=input.nextLine();
        english.age=input.nextInt();
        english.print();

    }
    }
}
