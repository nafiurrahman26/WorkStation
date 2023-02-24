package Practic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fac=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=input.nextInt();
        input.close();
        for(int i=1; i<=a;i++){
             fac=fac*i;
        }
        System.out.println(a+"! is: "+fac);
    }
    
}
