import java.util.ArrayList;
import java.util.List;

public class LaunchAL1 {
    public static void main(String[] args) {
        List al1=new ArrayList();
        al1.add(100);
        al1.add("Nikhil");
        al1.add('a');
        al1.add(999.9);

        System.out.println(al1);
        al1.add("Jaiswal");

        System.out.println("******************************************************");
        ArrayList al2=new ArrayList();
        al2.add(100);
        al2.add(200);
        al2.add(300);

        System.out.println(al2);

        System.out.println("******************************************************");
        ArrayList al3=new ArrayList();
        al3.add("Java");
        al3.add("Anjali");
        al3.add("Jaiswal");

        System.out.println(al3);
        al3.add(1,44);
        al3.addAll(al2);
        al3.addAll(1,al1);
        System.out.println(al3);
        al3.add(null);
        System.out.println(al3);
        System.out.println("******************************************************");

        Double d = (Double) al1.get(3);
        System.out.println(d);
        System.out.println(al3.indexOf("Jaiswal"));
    }
    
}
