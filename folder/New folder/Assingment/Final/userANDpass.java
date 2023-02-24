package Assingment.Final;

import java.util.Scanner;

public class userANDpass {
    public static void main(String[] args) {

        int b=0;
        Scanner input=new Scanner(System.in);
        System.out.println("\t\tWellcome");

        for(int i=1;i<=50;i++)
        {
            if(b==1){
                break;
            }

            System.out.print("Username: ");
            String username=input.nextLine();

            if(username.contains("sabbir")){
                for(int j=1;j<=50;j++){
                    

                    System.out.print("Password: ");
                    int pass=input.nextInt();
                    if(pass==9090){
                        System.out.println("\nYou can access our doc.\nLink=http\\www.hidden.file.exe\\\n\n");
                        b++;
                        break;
                    }
                    else{
                        System.out.println("Wrong Password!\nTry again.\n");
                    }
                    

                }


            }
            else{
                System.out.println("Wrong Username!\nTry again.\n");
            }
        }

        
        input.close();
        
        
    }
    
}
