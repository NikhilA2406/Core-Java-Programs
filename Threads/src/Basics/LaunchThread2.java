package Basics;

public class LaunchThread2 implements Runnable
{
    public static void main(String[] args) 
    {
        //LaunchThread2 thread1=new LaunchThread2();

        //Thread t1=new Thread(thread1);
        Thread t1=new Thread(new LaunchThread2());
        t1.setName("MyOwnThread");
        t1.start();
        
        Runnable r=()->System.out.println("Task for thread2");
        Thread t2=new Thread(r);
        t2.start();

        Thread t3=new Thread(()->System.out.println("Task for thread3"));
        t3.start();

        
    }
    @Override
    public void run() 
    {
        System.out.println("Task for thread1");
    }
    
}
