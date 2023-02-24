package Practic;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st numbr: ");
        int a=input.nextInt();
        System.out.print("Enter 2nd number: ");
        int b=input.nextInt();
        input.close();
        int i,j,count=0;
        for(i=a;i<=b;i++){

            for(j=2;j<i;i++){
                if(i%j==0){
                   
                    break;
                }
                System.out.print(i+" ");
                count++;
            }

        
            

        }
        System.out.println( "\nTotal prime number is: "+ count);
    }
    
}
