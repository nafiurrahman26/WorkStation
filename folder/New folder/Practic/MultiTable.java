package Practic;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=input.nextInt();
        input.close();
        int i,sum;
        for(i=1;i<=10;i++){
            sum=n*i;
            System.out.println(n+"x"+i+" = "+sum);
        }
        System.out.println("\nThank You\nProgram End");
    }
    
}
