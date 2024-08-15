public class LaunchBoxUnBox 
{
    public static void main(String[] args) {
        //These all known as wraper classes(a class that wraps one or more primitive data types)
        // float --> Float
        // int --> Integer
        // char --> Character
        // double --> Double 
        // boolean --> Boolean 
        Integer i = new Integer(10);
        System.out.println(i);
        Integer i2=Integer.valueOf(10);
        System.out.println(i2);
        int num = 100;
        Integer num2=Integer.valueOf(i2);//Boxing 
        Integer num3=num;//Autoboxing

        Integer i3=Integer.valueOf(44);
        int i4=i3.intValue();//Unboxing(using method to convert the object variable into primitive then it is unboxing)
        int i5=i3;//Autounboxing(without using any method to convert the object variable into primitive then it is Autounboxing)
    }
    
}
