import java.util.TreeSet; 
public class LaunchTS 
{
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(20);
        ts.add(35);
        ts.add(450);
        ts.add(90);
        ts.add(120);
        //ts.add(120); Duplication is not allowed
        //ts.add(null);In TreeSet null objects are not allowed *NullPointerException*
        System.out.println(ts);
        System.out.println(ts.ceiling(15));//20
        System.out.println(ts.higher(80));//100


        System.out.println(ts.ceiling(90));//90
        System.out.println(ts.higher(90));//100

        System.out.println(ts.floor(25));//20
        System.out.println(ts.lower(25));//20
        
        System.out.println(ts.floor(35));//35
        System.out.println(ts.lower(35));//20

        System.out.println(ts.tailSet(35));//[35, 90, 100, 120, 450]
        System.out.println(ts.headSet(90));//[20, 35]
    }
    
}
