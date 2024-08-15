import java.util.ArrayList;
import java.util.List;

class Human 
{
    int age;
    void disp()
    {
        System.out.println("Humans are best creature");
    }
}
class Student extends Human
{

}
class Emp
{

}
public class LaunchGen3 
{
    public static void main(String[] args) 
    {
        // Object obj = new Object();

        // String s=new String("Nikhil");
        // //s=obj;
        // obj=s;

        Human h=new Human();
        Student s=new Student();
        h=s;
        // ArrayList<Human> hlist=new ArrayList<>();
        // ArrayList<Student> slist=new ArrayList<>();

        // hlist=slist;//CE(Commpile time Error)

        
        // ArrayList<?> hlist=new ArrayList<>();//?--> Unknow --> Wildcard
        // ArrayList<Student> slist=new ArrayList<>();
        // hlist=slist;

        // ArrayList<? extends Human> hslist=new ArrayList<>();//upperbound
        // ArrayList<Student> slist=new ArrayList<>();
        // ArrayList<Human> hlist=new ArrayList<>();
        // ArrayList<Emp> elist=new ArrayList<>();
        // ArrayList<Object> Olist=new ArrayList<>();
        
        // hslist=slist;//--> Student Collection
        // hslist=hlist;//-->Human
        // hslist=elist;//CE
        // hslist=Olist;//CE

        // ArrayList<? super Human> hslist=new ArrayList<>();//Lowerbound
        // ArrayList<Student> slist=new ArrayList<>();
        // ArrayList<Human> hlist=new ArrayList<>();
        // ArrayList<Emp> elist=new ArrayList<>();
        // ArrayList<Object> Olist=new ArrayList<>();
    
        // hslist=hlist;//-->Human
        // hslist=Olist;//-->Object Collection
        // hslist=slist;//CE
        // hslist=elist;//CE

        // ArrayList<Human> hlist=new ArrayList<>();
        // hlist.add(new Human());
        // hlist.add(new Human());
        // hlist.add(new Human());

        // invockDisp(hlist);

        ArrayList<Student> slist=new ArrayList<>();
        slist.add(new Student());
        slist.add(new Student());
        slist.add(new Student());

        invockDisp(slist);
        
    }
    public static void invockDisp(List<? extends Human> list)
    {
        for(Human h:list)
        {
            h.disp();
        }
        
    }
    
}
