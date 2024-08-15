import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer
{
    
    int age;
    String name;
    double avg;
    public Cricketer(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }
    @Override
    public String toString() {
        return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }
}
class Alpha implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        if(((Cricketer)(o1)).avg>((Cricketer)(o2)).avg)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    
}
public class LaunchComplexSorting1 
{
    public static void main(String[] args) {
        Cricketer c1=new Cricketer(35, "Virat", 88.5);
        Cricketer c2=new Cricketer(38, "Dhoni", 97.5);
        Cricketer c3=new Cricketer(32, "Rohit", 91.40);
        Cricketer c4=new Cricketer(36, "Jaddu", 72.9);
        ArrayList<Cricketer> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        //System.out.println(list);
        //Alpha a=new Alpha();
        //Collections.sort(list,a);
        //System.out.println(list);
        // Comparator c=new Comparator()
        // {
        //     @Override
        //     public int compare(Object o1, Object o2) {
        //         if(((Cricketer)(o1)).avg>((Cricketer)(o2)).avg)
        //         {
        //             return 1;
        //         }
        //         else
        //         {
        //             return -1;
        //         }
        //     }
        // };
        // Comparator l=(Object o1, Object o2)->{
        //     if(((Cricketer)(o1)).avg>((Cricketer)(o2)).avg)
        //         {
        //             return 1;
        //         }
        //         else
        //         {
        //             return -1;
        //         }
        //     };

        Collections.sort(list, (o1,o2)->{
            if(((Cricketer)(o1)).avg>((Cricketer)(o2)).avg)
                 {
                    return 1;
                 }
                 else
                 {
                     return -1;
                 }

        });
        System.out.println(list);
        }
}

