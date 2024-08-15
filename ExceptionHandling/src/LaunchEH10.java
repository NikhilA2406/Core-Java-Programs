import java.util.Scanner;
class UnderAgeException extends Exception
{
    public UnderAgeException(String msg)
    {
        super(msg);
    }
}
class OverAgeException extends Exception
{   
    public OverAgeException(String msg)
    {
        super(msg);
    }
}
class Applicant
{
    int age;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly! Enter your Age");
        age=sc.nextInt();
    }
    public void verify() throws UnderAgeException, OverAgeException
    {
        if(age < 18)
        {
            UnderAgeException uae=new UnderAgeException("You are Under Age to get the License");
            System.out.println(uae.getMessage());
            throw uae;
        }
        else if (age>60)
        {
            OverAgeException oae= new OverAgeException("You are over Age to get the License");
            System.out.println(oae.getMessage());
            throw oae;
        }
        else{
            System.out.println("You'er Eligible Kindly Proceed with Application");
        }
    }
    
}
class RTO
{
    public void initiate()
    {
        
        Applicant ap=new Applicant();
        try 
        {
            ap.input();
            ap.verify();
        } 
        catch (UnderAgeException | OverAgeException e) 
        {
            System.out.println("Enter the Correct Age");
            try 
            {
                ap.input();
                ap.verify();
            } 
            catch (UnderAgeException | OverAgeException e1) 
            {
                System.out.println("Enter the Correct Age");
                try 
                {
                    ap.input();
                    ap.verify();
                } 
                catch (UnderAgeException | OverAgeException e2) 
                {
                    System.out.println("You are Blocked Kindly Enter afer some time");
                }
            }
        }
    }
}
public class LaunchEH10 
{
    public static void main(String[] args) 
    {
        System.out.println("Wlc to RTO Official Site");
        RTO rto=new RTO();
        rto.initiate();
        
        
    }
    
}
