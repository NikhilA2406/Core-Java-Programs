import java.util.Scanner;

public class LaunchIF6 
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number");
            int a = sc.nextInt();
        /*if(a>99 && a<=999){
                System.out.println("The Enter Number is Three digit Number The Number is "+a);
            }
            else{
                System.out.println("The Enter Number is Not Three digit Number The Number is "+a);
            }*/
            if(a>9999 && a<=99999){
                System.out.println("The Enter Number is a Five digit Number The Number is "+a);
            }
            else{
                System.out.println("The Enter Number is Not a Five digit Number The Number is "+a);
            }
        }
    } 
    
}
