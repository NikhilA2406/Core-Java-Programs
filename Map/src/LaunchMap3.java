import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Passport
{
    
    private String name;
    private String city;
    public Passport(String name, String city) {
        this.name = name;
        this.city = city;
    }
    @Override
    public String toString() {
        return "Passport [name=" + name + ", city=" + city + "]";
    }
    
    
}
public class LaunchMap3 
{
    public static void main(String[] args) 
    {
        Passport p1=new Passport("Nikhil", "Raipur");
        Passport p2=new Passport("Uttika", "Jaunpur");
        Passport p3=new Passport("Tushar", "Kolkata");

        Integer i1=Integer.valueOf(101);
        Integer i2=Integer.valueOf(102);
        Integer i3=Integer.valueOf(103);

        HashMap<Integer, Passport> hm=new HashMap<>();
        hm.put(i1, p1);
        hm.put(i2, p2);
        hm.put(i3, p3);
        //System.out.println(hm);

        Scanner sc =new Scanner(System.in);
        System.out.println("Kindly Enter your Pasport Number");
        Integer uId=sc.nextInt();

        Set set=hm.entrySet();
        Boolean flag=false; 
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry keyValue=(Entry) itr.next();
            Integer dbid=(Integer) keyValue.getKey();
            if(uId==dbid)
            {
                System.out.println("Please Find our Details Below");
                System.out.println(keyValue.getValue());
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("No Details Present with given Passport id");
        }

    }
    
}
