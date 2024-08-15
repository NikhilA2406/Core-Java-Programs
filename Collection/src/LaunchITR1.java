import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchITR1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(100);
        list.add(20);
        list.add(35);
        list.add(450);
        list.add(90);
        list.add(120);
       
        System.out.println(list);

        //Integer i =(Integer) list.get(2);

        // for(int i=0;i<list.size();i++){
        //     Integer data =(Integer) list.get(i);
        //     System.out.println(data);
        // }

        // 
        
        Iterator itr=list.iterator();
        System.out.println(itr.next());
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            Integer data=(Integer) itr.next();
            System.out.println(data);
        }
        System.out.println("************************************");
        
        ListIterator litr1 = list.listIterator(list.size());

        while(litr1.hasPrevious())
        {
            System.out.println(litr1.previous());
        }
    }
    
}
