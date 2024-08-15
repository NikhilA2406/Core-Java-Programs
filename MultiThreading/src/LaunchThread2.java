import java.util.Scanner;
class Alpha
{
    public void Banking(){
        System.out.println("Banking Activity Started.....");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account No.");
        int ac=sc.nextInt();
        System.out.println("Enter Password");
        int ps=sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking Activity Ended.....");
    }
}
class Beta
{
    public void starMsg() throws InterruptedException
    {
        System.out.println("Printing Activity Started.......");
        for(int i=0;i<4;i++)
        {
            System.out.println("*");
            Thread.sleep(3000);
        }
        System.out.println("Printing Activity Ended......");

    }
}
class Gamma
{
    public void infoMsg() throws InterruptedException
    {   
        System.out.println("Printing Quote Started.......");
        for(int i=0;i<4;i++)
        {
            System.out.println("Focus is the to master any skill");
            Thread.sleep(3000);
        }
        System.out.println("Printing Quote Ended......");


    }
}
public class LaunchThread2 
{
    public static void main(String[] args) throws InterruptedException 
    {
       
        Alpha a=new Alpha();
        Beta b=new Beta();
        Gamma g=new Gamma();
        a.Banking();
        b.starMsg();
        g.infoMsg();
        

        

        
    }
    
}
