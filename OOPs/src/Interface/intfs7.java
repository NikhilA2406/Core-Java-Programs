package Interface;
@FunctionalInterface
interface length
{
    int getLength(String s);
}
// class LOS implements length
// {
//     @Override
//     public int getLength(String s) {
//         return s.length();
//     }
// }

public class intfs7 {
    public static void main(String[] args) {
        // LOS los=new LOS()
        // System.out.println(los.getLength("Nikhil"));

        // length cal=new length() {
        //     public int getLength(String s) {
        //        return s.length();
        //     }    
        // };
        // System.out.println(cal.getLength("Nikhil"));

        // length cal=(String a)->{ 
        //     return a.length(); if you are writing return statement, it is optional.   
        // };
        // System.out.println(cal.getLength("NIKHIL"));

//Lambda expression is so intelligent it indentify by the return type.
        length cal=(a)-> a.length();//Even if you are writing in the single line writing is also optional
            
        System.out.println(cal.getLength("NIKHIL"));
        
        
    }
    
}
