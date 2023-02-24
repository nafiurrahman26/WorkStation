package Practic;

import java.util.Scanner;

public class pimeNmber {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        int count=0,num;
        System.out.print("Enter a number: ");
        num=input.nextInt();
        input.close();
        int i=2;
        while(i<num){     //while(i<num/2) 
            if(num%i==0){
                count++;
                break;
            }
            i++;
        }
        if(count==0){
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not prime Number.");
        }
        System.out.println("\nProgram End.");
    }
    
}
