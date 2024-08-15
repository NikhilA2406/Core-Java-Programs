import java.util.Scanner;

public class LaunchIF8 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter 1st No.");
        int a = sc.nextInt();
        System.out.println("Enter 2nd No.");
        int b = sc.nextInt();
        System.out.println("Enter 3rd No.");
        int c = sc.nextInt();
        /*if(a>c && a>b){
            System.out.println(a+"is greater");
        }
        if(b>c && b>a){
            System.out.println(b+"is greater");
        }
        if(c>b && c>a){
            System.out.println(c+"is greater");//in this method if user enter smilar number then wouldn't show any thing.
        }*/
        if(a>=c && a>=b){
            System.out.println(a+"is greater");
        }
        else if(b>=c && b>=a){
            System.out.println(b+"is greater");
        }
        else{
            System.out.println(c+"is greater");
        }
       
        }
    }
    
}
