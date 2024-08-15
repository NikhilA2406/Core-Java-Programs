class Show
{
    public int getSomeNo()
    {
        try
        {
            System.out.println("getSomeNo Called ");
            return 45;
        }
        finally
        {
            System.out.println("Exit code");
        }
    }
    public void getSomeNos()
    {
        try
        {
            System.out.println("getSomeNos Called ");
            System.exit(0);;
        }
        finally
        {
            System.out.println("After return statement --> finally block");
        }
    }
}
public class LaunchEH6 {
    public static void main(String[] args) 
    {
        Show s=new Show();
        //System.out.println(s.getSomeNo()); 
        s.getSomeNos();  
    }
    
}
