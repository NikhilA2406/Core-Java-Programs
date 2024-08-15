class MSWord extends Thread
{
    @Override
    public void run()
    {
        String name=Thread.currentThread().getName();//Demone Thread
        if(name.equals("TYPE"))
        {
            typing();
        }else if(name.equals("SAVE"))
        {
            saving();
        }else
        {   
            spellCheck();
        }
    }
    public void typing()
    {
        try 
        {
            for(int i =0;i<4;i++)
            {
                System.out.println("Typing.....");
                Thread.sleep(4000);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void spellCheck()
    {   
        try 
        {
            for(;;)
            {
                System.out.println("Spellcheck.....");
                Thread.sleep(4000);
            }   
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public void saving()
    {
        try 
        {
            for(;;)
            {
                System.out.println("Saving.....");
                Thread.sleep(4000);
            }  
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
public class LaunchThread10 
{
    public static void main(String[] args) 
    {
        MSWord t1=new MSWord();
        MSWord t2=new MSWord();
        MSWord t3=new MSWord();

        t1.setName("TYPE");
        t2.setName("SPELL");
        t3.setName("SAVE");

        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.setPriority(3);
        t3.setPriority(4);

        t1.start();
        t2.start();
        t3.start();

        
    }
    
}
