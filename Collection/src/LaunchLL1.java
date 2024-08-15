import java.util.LinkedList;

public class LaunchLL1 
{
    public static void main(String[] args) 
    {
        LinkedList ll1=new LinkedList();
        ll1.add(100);
        ll1.add("Java");
        ll1.add(200);
        System.out.println(ll1);
        ll1.add(1, "Nikhi");
        System.out.println(ll1);
        ll1.addLast("Jaiswal");
        System.out.println(ll1);
        ll1.add("Nikhi");
        System.out.println(ll1);
        ll1.add(null);
        System.out.println(ll1);
        System.out.println("******************************************************");
       
        LinkedList ll2=new LinkedList();
        ll2.add(100);
        ll2.add(200);
        ll2.add(300);
        ll2.add(400);
        System.out.println(ll2);
        ll2.offer(44);
        System.out.println(ll2);
        ll2.addFirst(54);
        System.out.println(ll2);
        System.out.println(ll2.peek());
        System.out.println(ll2);
        System.out.println(ll2.poll());
        System.out.println(ll2);
        //ll2.push(55);
        //System.out.println(ll2);
        System.out.println(ll2.pop());
        System.out.println(ll2);
        
    }
    
}
