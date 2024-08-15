import java.util.Scanner;

public class LaunchIF11 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st No.");
            int a = sc.nextInt();
            System.out.println("Enter 2nd No.");
            int b = sc.nextInt();
            System.out.println("Enter 3rd No.");
            int c = sc.nextInt();
            if(a>=b){
                if(a>=c){
                    System.out.println(a+" is Greatest");
                    }
                    else{
                    System.out.println(c+" Greatest");
                    }           
            }
            else{
                if(b>=c){
                    System.out.println(b+" is Greatest");
                }
                else{
                    System.out.println(c+" is Grestest");
                }
            }
        }
    }
    
}
