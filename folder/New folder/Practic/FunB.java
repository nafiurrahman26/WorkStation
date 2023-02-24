package Practic;

import java.util.Scanner;

public class FunB {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=input.nextLine();
        System.out.println("Hellow \""+name+"\"\nWealcome to our brothel!");
        System.out.print("What is your age sir: ");
        int a=input.nextInt();
        if(a>=18){
            System.out.println("Ohhh! Yahhhh! \nYou can Fuck any girl from our brothel.");
        }
        else if(a<=3) {
            System.out.println("Euwwww!\nYou are child!You can't fuck!\nGet lost from here.");
        }
        else{
            System.out.println("Sorry you aren't adult\nGo to home and watch porn.");
        }
        System.out.println("Enjoy in our brothel,sir.");

        input.close();
    }
}
