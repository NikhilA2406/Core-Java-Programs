import java.util.Scanner;

public class LaunchEH1 {
    public static void main(String[] args) {
        try
        {
            System.out.println("Application Started");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Numerator to divide");
            int n=sc.nextInt();
            System.out.println("Enter the Dinominator to divide");
            int d=sc.nextInt();
            int res=n/d;
            System.out.println("The result is "+res);
        }
        catch(Exception a)
        {
            System.out.println("Kindly enter the valid input");
        }

        System.out.println("Application Terminated Smoothly");
    }
    
}
