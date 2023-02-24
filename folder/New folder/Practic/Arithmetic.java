package Practic;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two number bellow: ");
        a=input.nextInt();
        b=input.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        float div=(float)a/b;
        System.out.println("sum is : "+ sum);
        System.out.println("subti. is : "+sub);
        System.out.println("Multiply is : "+mul);
        System.out.println("Divition is : "+div);


        input.close();
    }
    
}
