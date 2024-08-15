import java.util.*;
class Alpha1
{
    public void beta() throws Exception
    {
    
        System.out.println("Application Started");
        try{    
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
                catch(Exception e)
                {
                    System.out.println("Exception os handled in Alpha1 class beta method only");
                    throw e;
                }
            finally
            {
                System.out.println("Application Terminated Smoothly");
            }
    }
}
public class LaunchEH5 {
    public static void main(String[] args) {
        System.out.println("Main Method App Started");
        
        Alpha1 a=new Alpha1();
        try{
        a.beta();
        }
        catch(Exception e){
            System.out.println("Exception get caught at main method stack");
        }
        System.out.println("Main Method App Conclude");
        
    }
}
    
