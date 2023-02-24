package Practic;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.println("Wealcome \""+name+"\"");
        System.out.print("What is your age sir: ");
        int a=input.nextInt();
        if(a>=18){
            System.out.println("You are selected sir.");
        }
        else if(a<=3) {
            System.out.println("You are child!");
        }
        else{
            System.out.println("You are not selected sir\nBetter Luck next time.");
        }
        System.out.println("Have a good day sir.");

        input.close();
    }
}

