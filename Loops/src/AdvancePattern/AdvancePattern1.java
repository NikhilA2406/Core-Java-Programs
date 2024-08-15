package AdvancePattern;

import java.util.Scanner;

public class AdvancePattern1 
{
    public static void hollow_rec(int r, int c){
        for(int i =1; i<=r;i++){
            for(int j=1; j<=c;j++){
                if(i==1||i==r||j==1||j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            hollow_rec(a,b);
        }
    }   
    
}
