package Interface;
@FunctionalInterface
interface Add
{
    int add(int a, int b);
}
public class intfs6 
{
    public static void main(String[] args) {
        // Add cal=(int c, int d)->{
        //     return c+d;
        // };
        // System.out.println(cal.add(20, 20));

        Add cal=(a,b)->a+b;
        System.out.println(cal.add(20,20));
    }
    
}
