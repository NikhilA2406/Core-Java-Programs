package Inheritance;
class Alpha
{
    void disp()
    {
        System.out.println("Disp the method of Alpha class");
    }
}
class Beta extends Alpha
{
    
}
class Gamma extends Beta
{

}
public class inheri1 {
    public static void main(String[] args) {
        Beta Beta=new Beta();
        Beta.disp();

        Gamma Gamma=new Gamma();
        Gamma.disp();
    }
    
}
