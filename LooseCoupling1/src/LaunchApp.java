import services.SQL;

public class LaunchApp 
{   
    public static void main(String[] args) 
    {
       Telusko t=new Telusko();//target object

       //dependecy injection
       t.setCourse(new SQL());//dependent object
       boolean status=t.buyTheCourse(444.4);
       if(status)
        System.out.println("Course Purchase");
        else
        System.out.println("Failed to get the cousre");

    }

}
