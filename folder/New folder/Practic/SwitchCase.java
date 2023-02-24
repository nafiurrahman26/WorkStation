package Practic;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=input.nextInt();
        switch(a){
            case 0:
            System.out.println("It's Zerro!");
            break;
            case 1:
            System.out.println("It's One!");
            break;
            case 2:
            System.out.println("It's Two!");
            break;
            case 3:
            System.out.println("It's Three!");
            break;
            case 4:
            System.out.println("It's Four!");
            break;
            case 5:
            System.out.println("It's Five!");
            break;
            
            default:
            System.out.println("Out of Conition!");
        }
        input.close();

    }
    
}
