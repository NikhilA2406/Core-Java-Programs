import java.util.Scanner;

public class LaunchIF9 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the First side of the Triangle");
            int a = sc.nextInt();
            System.out.println("Enter the Second side of the Triangle");
            int b = sc.nextInt();
            System.out.println("Enter the Third side of the Triangle");
            int c = sc.nextInt();
            if((a+b)>c && (b+c)>a && (c+a)>b){
                System.out.println("Valid Triangle");
            }
            else{
                System.out.println("Invalid Triangle");
            }
        }
    }
    
}
