package Basics;

public class LaunchThread1 extends Thread
{
    // public Sname(String name)
    // {
    //     super()
    // }
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started");

        LaunchThread1 t1=new LaunchThread1();
        LaunchThread1 t2=new LaunchThread1();

        t1.setName("MyThread1");
        t2.setName("MyThread2");

        t1.start();
        t2.start();

        System.out.println("Main Threads done with its work");
    }
    public void run()
    {
        System.out.println("Task for my new thread");
    }
    
}
