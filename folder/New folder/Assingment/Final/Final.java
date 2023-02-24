package Assingment.Final;

import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
    
        Scanner input=new Scanner(System.in);
        System.out.println("\t\tWellcome");

        for(int i=1;i<=50;i++)
        {

            System.out.print("Username: ");
            String username=input.nextLine();
            //
            System.out.print("Password: ");
            int pass=input.nextInt();

            if(username.contains("sabbir") && pass==9090){
                

             System.out.println("\nYou can access our doc.\nLink=http\\www.hidden.file.exe\\\n\n");
             
             break;
            }
            else{
            System.out.println("Wrong Password!\nTry again.\n");
        
            }
        }

        
        input.close();
        
        
    }
    
}
