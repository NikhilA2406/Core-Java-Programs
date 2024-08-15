class Car implements Runnable
{

    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread().getPriority());
        try 
        {
            System.out.println(Thread.currentThread().getName()+" has entered into the parking lot");
            Thread.sleep(2000);
            synchronized(this)
            { 
            System.out.println(Thread.currentThread().getName()+" got into the car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" started the driving");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" came back and parked the car");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
}
public class LaunchThread8 
{
    public static void main(String[] args) 
    {
        Car car=new Car();

        Thread t1=new Thread(car);
        Thread t2=new Thread(car);
        Thread t3=new Thread(car);

        t1.setName("Rohit");
        t2.setName("Ankit");
        t3.setName("Mohit");

        t1.start();
        t2.start();
        t3.start();

        
    }
    
}
