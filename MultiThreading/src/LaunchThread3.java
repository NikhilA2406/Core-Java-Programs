import java.util.Scanner;

class Alpha1 extends Thread
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
class Beta1 extends Thread
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
class Gamma1 extends Thread
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
public class LaunchThread3 
{   
   
         public static void main(String[] args) throws InterruptedException 
    {
       
        System.out.println("Main Thread started the execution");
        Alpha1 thread1=new Alpha1();
        Beta1 thread2=new Beta1();
        Gamma1 thread3=new Gamma1();
        
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Main Thread finished the execution");
    }

    
}
