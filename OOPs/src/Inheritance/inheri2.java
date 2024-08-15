package Inheritance;
class AeroPlane
{
    int cost;
    void fly()
    {
        cost=44444;
		System.out.println("AeroPlane is flying");
    }
    void takeOff()
	{
		System.out.println("Aero taking off");
	}
}
class PassengerPlane extends AeroPlane
{
	//fly method in child inherited
	
	void takeOff()//overrding method 
	{
		System.out.println("Passeneger plane requires medium sized runway to take off taking off");
	}
	
	void disp()
	{
		System.out.println("Cost is "+ cost);
	}
}
public class inheri2 {
    public static void main(String[] args) {
        AeroPlane p=new PassengerPlane();//Upcasting ==> why? Polymorphism
		p.fly();//inherited method
		p.takeOff();//overriding method
		((PassengerPlane)p).disp();//downcasting
        
    }
    
}
