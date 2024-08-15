import java.util.ArrayList;
class Employee
{
    int id;
    String name;
    int age;
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }


}
public class LaunchGen {
    public static void main(String[] args) {
        //typesafety
        int ar[]=new int[3];
        ar[0]=10;
        ar[1]=20;
        //ar[2]="Nikhil";
         int data =ar[1];
         
         //typesafety
         String s[]=new String[3];
         s[0]="Nikhil";
         s[1]="Jaiswal";
         s[2]="Anjali";

         String info=s[0];

        //No typesafety
         ArrayList al=new ArrayList();
         al.add("Jaiswal");
         al.add("Nikhil");
         al.add("Anjali");
         al.add(44);

         String s1=(String) al.get(0);
         s1=s1.toLowerCase();
         System.out.println(s1);

         String s2=(String) al.get(1);
         s2=s2.toLowerCase();
         System.out.println(s2);

         String s3=(String) al.get(2);
         s3=s3.toUpperCase();
         System.out.println(s3);

        //  String s4=(String) al.get(3);
        //  s3=s3.toUpperCase();
        //  System.out.println(s3);
        System.out.println("************************************************");
        // Type Safety
         ArrayList<String> list=new ArrayList<>();
         list.add("Nikhil1");
         list.add("Jaiswal1");
         list.add("Anjali1");
         //list.add(44);

         String str1 = list.get(0);
         System.out.println(str1);
         String str2 = list.get(1);
         System.out.println(str2);
         String str3 = list.get(2);
         System.out.println(str3);
         System.out.println("***************************************");
         
         ArrayList<Employee> employeeList=new ArrayList();
         
         employeeList.add(new Employee(1, "Nikhil", 24));
         Employee e2=new Employee(2, "Kundan", 23);
         employeeList.add(e2);

         //employeeList.add(44);
         System.out.println(employeeList);

         //ArrayList<int> E1=new ArrayList<>();//Primitive is not allowed

         //ArrayList<object> E1=new ArrayList<String>();

         ArrayList<Integer> E1=new ArrayList<>();


    }
    
}
