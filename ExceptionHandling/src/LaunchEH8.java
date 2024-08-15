// import java.io.IOException;

// class Parent
// {
//     public void eat()
//     {

//     }
// }
// class Child extends Parent
// {
//     public void eat() throws ArithmeticException //Valid
//     {
//         //
//         //Valid
//     }
//     public void eat() throws IOException //Invalid
//     {

//     }
//     // if method in parent dosent throw an exception then overloading method in child class can throw unchecked exception but not checked exception
// }
////////////////////////////////////////////

import java.io.IOException;

// class Parent
// {
//     public void eat() throws ArithmeticException
//     {
//         //
//         //
//     }
// }
// class Child extends Parent
// {
//     // public void eat() throws ArithmeticException //Valid
//     // {
//     //     //
//     //     //
//     // } 
    
//     // public void eat() throws IOException //InValid
//     // {
//     //     //
//     //     //
//     // }
// }
class Parent
{
    public void eat() throws IOException //Valid
    {
        //
        //
    }
}
class Child extends Parent
{
    
    
    // public void eat() throws IOException //Valid
    // {
    //     //
    //     //
    // }
    // public void eat()//Valid
    //  {

    //  }
    public void eat() throws ArithmeticException //valid
    {
        //
        //
    }
}

public class LaunchEH8 
{
    public static void main(String[] args) {
        
    }
    
}
