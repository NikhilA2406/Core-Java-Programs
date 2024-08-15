import java.util.ArrayDeque;
public class LaunchAD1 
{
    public static void main(String[] args) 
    {
        ArrayDeque ad=new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println(ad);
        ad.addFirst(5);
        System.out.println(ad);
        ad.addLast(40);
        System.out.println(ad);
        ad.add(10);
        System.out.println(ad);
        //ad.add(null);In ArrayDeque null objects are not allowed *NullPointerException*
        System.out.println(ad);

        
    }
    
}
