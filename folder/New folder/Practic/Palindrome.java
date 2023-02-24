package Practic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a,b;
        a=input.nextLine();
        StringBuffer sb=new StringBuffer(a);
        b=sb.reverse().toString();
        if(a.equals(b)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        input.close();

    }
    
}
