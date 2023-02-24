package Practic;

import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How manny number you want added: ");
            int n=input.nextInt();
            int array[]=new int[n];
            int i,sum=0;
            float avrg;
            for(i=0;i<n;i++){
                array[i]=input.nextInt();
                sum=sum+array[i];
            }
            input.close();
            System.out.println(sum);
            avrg=(float)sum/n;
            System.out.println(avrg);
        }

            
        }
        
    }
    

