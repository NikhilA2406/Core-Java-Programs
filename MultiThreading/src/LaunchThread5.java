import java.util.Scanner;

class Alpha5 implements Runnable
{

    @Override
    public void run() {
        String tName=Thread.currentThread().getName();
        if(tName.equals("Bank"))
        {
            Banking();
        }else if(tName.equals("Star"))
        {
            starMsg();
        }else
        {
            infoMsg();
        }
        
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
public class LaunchThread5 
{
    public static void main(String[] args) 
    {
        Alpha5 alpha=new Alpha5();
        Thread thread1=new Thread(alpha);

        Thread thread2=new Thread(alpha);

        Thread thread3=new Thread(alpha);
        
        thread1.setName("Bank");
        thread2.setName("Star");
        thread3.setName("MSG");


        thread1.start();

        thread2.start();

        thread3.start();
    }
    
}
