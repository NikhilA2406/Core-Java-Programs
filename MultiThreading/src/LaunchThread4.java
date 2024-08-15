import java.util.Scanner;

class Alpha2 implements Runnable
{
    @Override
    public void run()
    {
        Banking();
    }
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
class Beta2 implements Runnable
{
    @Override
    public void run()
    {
        starMsg();
    }
    public void starMsg() 
    {
        System.out.println("Printing Activity Started.......");
        for(int i=0;i<4;i++)
        {
            System.out.println("*");
            try 
            {
                Thread.sleep(3000);
            } 
            catch (InterruptedException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Printing Activity Ended......");

    }
}
class Gamma2 implements Runnable
{
    @Override
    public void run()
    {
        infoMsg();
    }
    public void infoMsg() 
    {   
        System.out.println("Printing Quote Started.......");
        for(int i=0;i<4;i++)
        {
            System.out.println("Focus is the to master any skill");
            try 
            {
                Thread.sleep(3000);
            } 
            catch (InterruptedException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Printing Quote Ended......");


    }
}
public class LaunchThread4 
{
    public static void main(String[] args) 
    {
       
        Alpha2 alpha=new Alpha2();

        Beta2 beta=new Beta2();

        Gamma2 gamma=new Gamma2();
        
        Thread thread1=new Thread(alpha);

        Thread thread2=new Thread(beta);

        Thread thread3=new Thread(gamma);

        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());
        System.out.println(thread3.isAlive());

        thread1.start();

        thread2.start();

        thread3.start();

        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());
        System.out.println(thread3.isAlive());
    }    
}
