package Interface;
interface Alpha 
{ 
    void show();
    private void alien()
    {
        System.out.println("Private Member of interface");
    }   
    default void display()//here default keyword is different from the default access specifier
    {
      System.out.println("The Alpha Interface");
      alien();  
    }
    static void gamma()
    {
        System.out.println("Gamma Static method of inheritance");
    }
}
class Beta implements Alpha
{
    public void show()
    {
        System.out.println("The Beta class");
    }
    public void display()
    {
        System.out.println("The Beta class"); 
    }
}
public class intfs4 {
    public static void main(String[] args) {
        Alpha a = new Beta();
        a.show();
        a.display();
        Alpha.gamma();
        // Beta b = new Beta();
        // b.show();
        // b.display();
    }
    
}
