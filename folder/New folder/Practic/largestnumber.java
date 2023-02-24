package Practic;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b,larg;
        System.out.print("Enter two number: ");
        a=input.nextInt();
        b=input.nextInt();
         larg=(a>b)?a:b;
        // larg=Math.max(a, b);
        System.out.println("Large number is: "+larg);


        input.close();
    }
    
}
