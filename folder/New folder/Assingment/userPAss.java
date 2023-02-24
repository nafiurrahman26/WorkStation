package Assingment;

import java.util.Scanner;

public class userPAss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\tellcome To Our Project");
        System.out.print("Username: ");
        String uname=input.nextLine();
        
        for(int i=0;i<20;i++){
            System.out.println("Username: "+uname);
            System.out.print("Password: ");
            int pass=input.nextInt();
            if(pass==9090){
                
                System.out.println("You can access our doc.\nLink=http\\www.alibaba.com\\");
                break;
            }
            else{
                System.out.println("Try again!");
            }
        }
     
        
        input.close();
    }
    
}
