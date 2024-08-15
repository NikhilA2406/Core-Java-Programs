class Library implements Runnable
{
    String res1=new String("Java");
    String res2=new String("DSA");
    String res3=new String("Spring Boot");
    @Override
    public void run() 
    {
        String name=Thread.currentThread().getName();
        if(name.equals("Stud1"))//Deadlock 
        {
            try 
            {
                Thread.sleep(4000);
                synchronized(res1)
                {
                    System.out.println("Student 1 has Aquired "+res1);
                    Thread.sleep(4000);
                    synchronized(res2)
                    {
                    System.out.println("Student 1 has Aquired "+res2);
                    Thread.sleep(4000);
                        synchronized(res3)
                        {
                        System.out.println("Student 1 has Aquired "+res1);
                        Thread.sleep(4000);
                        }
                    }
                }               
            } 
            catch (Exception e) 
            {
                e.printStackTrace();   
            }
        }
        else
        {
            try 
            {
                Thread.sleep(4000);
                synchronized(res3)
                {
                    System.out.println("Student 2 has Aquired "+res3);
                    Thread.sleep(4000);
                    synchronized(res2)
                    {
                    System.out.println("Student 2 has Aquired "+res2);
                    Thread.sleep(4000);
                        synchronized(res1)
                        {
                        System.out.println("Student 2 has Aquired "+res1);
                        Thread.sleep(4000);
                        }
                    }
                }                
            } 
            catch (Exception e) 
            {
                e.printStackTrace();   
            }
        }      
    }   
}

public class LaunchThread9 
{
    public static void main(String[] args) 
    {
        Library lib=new Library();
        Thread t1=new Thread(lib);
        Thread t2=new Thread(lib);

        t1.setName("Stud1");
        t2.setName("Stud2");

        t1.start();
        t2.start();

        
    }
    
}
