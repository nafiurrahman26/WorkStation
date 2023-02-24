package Practic;
import java.util.Scanner;



public class ifelse2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Do you love java?\nY/n: ");
        char a=input.next().charAt(0);
        System.out.print("/n: ");
        if(a=='Y' || a=='y'){
            System.out.println("Oh!Great.You alos.");
            
        }
        else if (a=='N'||a=='n'){
            System.out.println("Oh!Get lost from here.");
        }
        else{
            System.out.println("Input Error!");
        }
        System.out.println("\n\n\n\t\tProgram End!\n\t\tThank You!");
        input.close();

    }
   
    
}
