package Practic;
import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.close();
        int i=1;
        do{
            System.out.println("Sabbir");
            i++;
        }
        while(i<=n);
    }
    
}
