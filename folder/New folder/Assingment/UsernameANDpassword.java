package Assingment;

import java.util.Scanner;

public class UsernameANDpassword {
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        System.out.println("\t\tWellcome");
        System.out.print("Username: ");
        String username=input.nextLine();
        System.out.print("Password: ");
        int pass=input.nextInt();

        if(username.contains("sabbir") && pass==9090){
            System.out.println("You can access our doc.\nLink=http\\www.alibaba.com\\");
        }
        input.close();
        
        
    }
    
}


// System.out.print("Username: ");
// String username=input.nextLine();
// System.out.print("Password: ");
// int pass=input.nextInt();
// if(username.contains("sabbir") && pass==9090){
//     System.out.println("You can access our doc.\nLink=http\\www.alibaba.com\\\n\n");
//     break;
// }
// else{
//     System.out.println("Wrong!!!\nTry again.");
// }
