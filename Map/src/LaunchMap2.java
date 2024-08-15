import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

interface Alpha
{
    interface Beta
    {
        static void disp()
        {
            System.out.println("Static method in Inner Interface disp");
        }
    }
    
}
public class LaunchMap2 {
    public static void main(String[] args) {
        Alpha.Beta.disp();

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1, "Java");
        hm.put(2, "DSA");
        hm.put(3, "JS");
        System.out.println(hm);

        String st=hm.get(1);
        System.out.println(st);
        System.out.println("***********************************");
        
        Collection<String> Values=hm.values();
        Iterator<String> itr= Values.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("**************************");
        Collection<Integer> key=hm.keySet();
        Iterator<Integer> itr1=key.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        // Set<Entry<Integer,String>>entry = hm.entrySet();
        Set entry =hm.entrySet();
        Iterator itr2=entry.iterator();
        while (itr2.hasNext()) 
        {
            //System.out.println(itr2.next());
            Map.Entry pair=(Entry) itr2.next();
            System.out.println(pair.getKey()+" : "+pair.getValue());
            
        }


    }
    
}
