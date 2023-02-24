package Practic;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many number do you see: ");
        int n=input.nextInt();
        input.close();
        int fibo,i,first=0,sec=1;
        System.out.print(first+" "+sec);

        for(i=3;i<=n;i++){
            fibo=first+sec;
            System.out.print(" "+fibo);
            first=sec;
            sec=fibo;
        }
        System.out.println("\n\n\tProgram End!");


    }
    
}
