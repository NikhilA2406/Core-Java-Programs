class Producer extends Thread
{
    Queue queue;
    int i=0;
    public Producer(Queue q)
    {
        queue=q;
    }
    @Override
    public void run()
    {
        while(true)
        {
            queue.produce(i++);
        }
    }
}
class Consumer extends Thread
{
    Queue queue;
    int i=0;
    public Consumer(Queue q)
    {
        queue=q;
    }
    @Override
    public void run()
    {
        while(true)
        {
            queue.consumer();
        } 
    }
}
class Queue
{
    int data;
    boolean flag=false;
    synchronized public void produce(int value)
    {
        try
        {
            if(flag==true)
            {
                System.out.println("Production in waiting State");
                wait();
            }
            else
            {
                data=value;
                System.out.println("I have Produce data "+data);
                flag=true;
                notify();
            }
        }
        catch (Exception e) 
        {
            System.out.println(" ");
        }
        
    }
    synchronized public void consumer()
    {
        try
        {
            if(flag==false)
            {
                System.out.println("Consumtion in waiting state");
                wait(); 
            }
            else
            {
                System.out.println("I have Consumed data "+data);
                flag=false;
                notify();
            }
        }
        catch (Exception e) 
        {
            System.out.println(" ");
        }
    }
}
public class LaunchThread11 
{
    public static void main(String[] args) 
    {
        Queue q=new Queue();

        Producer t1=new Producer(q);
        Consumer t2=new Consumer(q);

        t1.start();
        t2.start();
        
    }
    
}
