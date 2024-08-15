import java.util.Scanner;
class InvaildCustomerException extends Exception
{
    public InvaildCustomerException(String msg)
    {
        super(msg);
    }
}
class Atm
{
    int accountNo=1212;
    int password=2424;

    int acc;
    int pw;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly entr the Account No.");
        acc=sc.nextInt();
        System.out.println("Kindly entr the Password");
        pw=sc.nextInt();
    }
    public void verify() throws InvaildCustomerException
    {
        if (accountNo==acc && password==pw)
        {
            System.out.println("Crenditial Matched you can go for further Transaction");
        }
        else
        {
            InvaildCustomerException ice=new InvaildCustomerException("Invalid Crenditial");
            System.out.println(ice.getMessage());
            throw ice;
            //throw new InvaildCustomerException("Invalid Crenditial");
        }

    }
}
class Bank
{
    public void initiate()
    {
        Atm atm=new Atm();
        try 
        {
            atm.input();
            atm.verify();
        } 
        catch (InvaildCustomerException e) 
        {
            System.out.println("Invalid Crendential Try Again");
            atm.input();
            try 
            {
                atm.input();
                atm.verify();
            } 
            catch (InvaildCustomerException e1) 
            {
                System.out.println("Invalid Crendential Try Again");
                try 
                {
                    atm.input();
                    atm.verify();
                } 
                catch (InvaildCustomerException e2) 
                {
                    System.out.println("Bhag Jaa Tere Ko Block Krha Hu Mai!! Blocked ");
                }
            }
        }
    }
}
public class LaunchEH9 {
    public static void main(String[] args) {
        System.out.println("Welcome to the SBI");
        Bank bank=new Bank();
        bank.initiate();
        
    }
    
}
