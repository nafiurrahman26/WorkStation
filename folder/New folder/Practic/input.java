package Practic;

import java.util.Scanner;

public class input {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int numb;
        System.out.println("What is upur name?");
        String name=input.nextLine();
        System.out.println("Hellow "+name);
        System.out.print("Enter any number: ");
        numb= input.nextInt();
        System.out.println(numb+"\n Thank You!");

        input.close();



    }
}
