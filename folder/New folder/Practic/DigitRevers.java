package Practic;

import java.util.Scanner;

public class DigitRevers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=input.nextInt();
        input.close();
        int reminder,sum=0;
        int i=a;
        while(i!=0){
            reminder= i%10;
            sum=(sum*10)+reminder;


            i=i/10;
        }
        System.out.print("Revers Digit: ");
        System.out.println(sum);
        System.out.println("\tProgram End!");
        
    }
    
}
