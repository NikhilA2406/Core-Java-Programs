import java.util.Scanner;

public class LaunchEH2 {
    public static void main(String[] args) {
        System.out.println("Application Started");
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Numerator to divide");
            int n=sc.nextInt();
            System.out.println("Enter the Dinominator to divide");
            int d=sc.nextInt();
            
            int res=n/d;
            
            System.out.println("The result is "+res);
            
            System.out.println("Please Enter the size of array");
            int size=sc.nextInt();
            int ar[]=new int[size];

            System.out.println("Kindly enter the element to be inserted");
            int elem=sc.nextInt();

            System.out.println("Kindly enter the position where you want to enter the element");
            int pos=sc.nextInt();

            ar[pos]=elem;
            System.out.println(elem+" Entered at "+pos+" Successfully");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter the valid Denominator");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Please enter the Positive Array size");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Enter the correct position which comes under in the entered size array");
        }
        catch(Exception a)
        {
            System.out.println("Invalid Input");

        }

        System.out.println("Application Terminated Smoothly");
    }
}
    

