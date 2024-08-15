import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable
{
    
    int age;
    String name;
    double avg;
    public Cricketer1(int age, String name, double avg) {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }
    @Override
    public String toString() {
        return "Cricketer1 [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }
    @Override
    public int compareTo(Object o) {
       if(this.avg<((Cricketer1)(o)).avg)
       {
        return 1;
    }
    else
    {
        return -1;
    }
    }
}

public class LaunchComplexSorting2 {
  
    public static void main(String[] args) {
        Cricketer1 c1=new Cricketer1(35, "Virat", 88.5);
        Cricketer1 c2=new Cricketer1(38, "Dhoni", 97.5);
        Cricketer1 c3=new Cricketer1(32, "Rohit", 91.40);
        Cricketer1 c4=new Cricketer1(36, "Jaddu", 72.9);
        ArrayList<Cricketer1> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        System.out.println(list);
        Collections.sort(list);
    }  
}
