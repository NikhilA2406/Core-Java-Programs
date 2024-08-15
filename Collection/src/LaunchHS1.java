import java.util.HashSet;
import java.util.LinkedHashSet;
public class LaunchHS1 
{
    public static void main(String[] args) 
    {
    //     HashSet hs=new HashSet();
    //     hs.add(100);
    //     hs.add(20);
    //     hs.add(35);
    //     hs.add(450);
    //     hs.add(90);
    //     hs.add(120);
    //    //hs.add(90);No Duplication
    //     hs.add(null);//null value is allowed
    //     System.out.println(hs);//Order of insertion is not retained

    LinkedHashSet hs=new LinkedHashSet();
    hs.add(100);
    hs.add(20);
    hs.add(35);
    hs.add(450);
    hs.add(90);
    hs.add(120);
    //hs.add(90);No Duplication
    hs.add(null);//null value is allowed
    System.out.println(hs);//Order of insertion is not retained


    }
    
}
