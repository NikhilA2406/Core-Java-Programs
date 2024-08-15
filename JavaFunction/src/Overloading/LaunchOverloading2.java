package Overloading;

public class LaunchOverloading2 
{
    public static int sum(int a, int b){
        return(a+b);
    }
    public static float sum(float a, float b){
        return(a+b);
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(2.3f,3.2f));
    }
    
}
//This is the method called function overloading by using same class name but
//different return type and different data types of parameters 

