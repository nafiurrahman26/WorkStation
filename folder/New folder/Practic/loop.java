package Practic;

import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,a;
        System.out.print("\t\tHellow \nEnter a string: ");
        String s=input.nextLine();
        System.out.print("How many print do you need:");
        a=input.nextInt();
        input.close();

        for(i=0;i<a;i++){
            System.out.println(s);
        }
        System.out.println("\n\n\t\t Program End!");

    }    
}
