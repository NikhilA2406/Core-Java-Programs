package Static;
class Alpha 
{
    static int a;
    static{
        System.out.println("Static block of alpha");
    }
    static void disp()
    {
        System.out.println("Static Method of Alpha");
    }
}

public class static2 {
    public static void main(String[] args) {
        System.out.println("main Method");
        Alpha.disp();//Static method is always object independent. There is no
        //need to create the object when you have to call the static block.
    }
    
}
