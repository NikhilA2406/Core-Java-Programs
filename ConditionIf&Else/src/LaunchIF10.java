import java.util.Scanner;

public class LaunchIF10 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st No.");
        int a = sc.nextInt();
        System.out.println("Enter 2nd No.");
        int b = sc.nextInt();
        System.out.println("Enter 3rd No.");
        int c = sc.nextInt();
            if(a<=c && a<=b){
                System.out.println(a+"is Smallest");
            }
            else if(b<=c && b<=a){
                System.out.println(b+"is Smallest");
            }
            else{
                System.out.println(c+"is Smallest");
            }
        }
    }   
    
}
