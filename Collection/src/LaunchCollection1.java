import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollection1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(50);
        list.add(80);
        list.add(150);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("*******************************");

        ArrayList<String> list2=new ArrayList<>();
        list2.add("Java");
        list2.add("SQL");
        list2.add("Spring");
        list2.add("Cloud");

        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);



    }
    
}
