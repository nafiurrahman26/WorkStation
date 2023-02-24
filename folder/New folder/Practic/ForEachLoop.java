package Practic;

import java.util.Scanner;


public class ForEachLoop {
    public static void main(String[] args) {
    try ( Scanner input=new Scanner(System.in)){
        String[] names={"Sabbir","Boltu","Hablu"};
        for(String x: names){
            System.out.println(x);
        }
        int[] num= new int[5];
        for(int i=0;i<5;i++){
            num[i]=input.nextInt();
        }
        for(int x: num){
            System.out.println(x);
        }
        
    }
    }
    
}
