package Practic;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
    try  (Scanner input=new Scanner(System.in)){
        int n,m;
        System.out.print("Matrixs Type(RxC): ");
        n=input.nextInt();
        m=input.nextInt();
        int[][] a=new int[n][m];
        int i,j,diagSum=0,upSum=0,downSum=0;
        System.out.println("\t\t Input:");

        //input:
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=input.nextInt();
            }
            System.out.println();
        }

        //metrixs output:
        System.out.println("\t\t Output: \n");

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print("\t"+a[i][j]+" ");
            }
            System.out.println();
        }

        //additing:
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    diagSum=diagSum+a[i][j];
                }
                else if(i<j){
                    upSum=upSum+a[i][j];
                }
                else{
                    downSum=downSum+a[i][j];
                }
            }
        }

        //Output:


        System.out.println("Diagonally Sum is: "+diagSum);
        System.out.println("Upper Sum is: "+upSum);
        System.out.println("Down Sum is: "+downSum);

        
    }
}
    
}
