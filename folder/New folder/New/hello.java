package New;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println(s);
        input.close();
    }
    
}
