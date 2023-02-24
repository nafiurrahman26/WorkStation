package Practic;

import java.util.Scanner;

public class switchCase2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Bangla for press 1\nEnglish for press 2\nUrdu for press 3");
        System.out.print("Press: ");
        int a=input.nextInt();
        switch(a){
            case 1:
            {
                System.out.println("Dhonnobad!");
                break;
            }
            case 2:
            {
                System.out.println("Thank You!");
                break;
            }
            case 32:
            {
                System.out.println("Sukria!");
                break;
            }
            default:{
                System.out.println("Input Error!");
            }
        }


        input.close();
    }
    
}
