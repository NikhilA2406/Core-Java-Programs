class Bathroom implements Runnable
{

    @Override
    synchronized public void run() 
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" has enterd the bathroom");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" is using the bathroom");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" has exited the bathroom"); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

}
public class LaunchThread6 
{
    public static void main(String[] args) 
    {
        Bathroom b=new Bathroom();
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        Thread t3=new Thread(b);

        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("TikTOk");

        t1.start();

        t2.start();

        t3.start();

    }
    
}
