import java.util.ArrayList;
import java.util.Iterator;

public class LaunchFF1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(100);
        list.add(20);
        list.add(35);
        list.add(450);
        list.add(90);
        list.add(120);
       
        System.out.println(list);
        // for(int i=0;i<list.size();i++){
        //     Integer data =(Integer) list.get(i);
        //     System.out.println(data);
        //     list.add(44);
        // }
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            Integer data=(Integer) itr.next();
            System.out.println(data);
            list.add(44);
        }//Fail Fast (ConcurrentModificationException)
    }
}
