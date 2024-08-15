import java.util.Scanner;

public class LaunchIF4 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int a = sc.nextInt();
            if(a>0){
                System.out.println("The Enter Number is positive The Number is "+a);
            }
            else{
                System.out.println("The Enter Number is negative The Number is "+a);
            }
        }
    }    
    
}
