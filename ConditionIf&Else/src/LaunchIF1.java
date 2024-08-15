import java.util.Scanner;

public class LaunchIF1 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int a = sc.nextInt();
            if(a%2 == 0){
                System.out.println("The Enter Number is is even The Number is "+a);
            }
            else{
                System.out.println("The Enter Number is odd The Number is "+a);
            }
        }
    }    
    
}
