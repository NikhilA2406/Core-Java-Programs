package Interface;
@FunctionalInterface
interface Alpha1//Funtionalinterface
{
    //Oneabstractmethod or //Singleabtractmethod
    void disp();
}
public class intfs5 {
    public static void main(String[] args) {
        //Anonymous inner class
        // Alpha1 a=new Alpha1() 
        // {
        //     public void disp()
        //     {
        //         System.out.println("disp method implementation");
        //     }
        // };
        // a.disp();
        
        //Lambda Expression
        // Alpha1 a=()->{
        //     System.out.println("Hello");
        // }; 
        Alpha1 a=()->System.out.println("Hello");
        a.disp();
    }
    
}
