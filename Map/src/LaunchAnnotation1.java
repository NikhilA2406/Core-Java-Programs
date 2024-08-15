class Animal
{
    public void animalUsuallyHuntsAndEat()
    {
        System.out.println("Animal is Eathing");
    }

}
class Tiger extends Animal
{
    @Override
    public void animalUsuallyHuntsAndEat()
    {
        System.out.println("Tiger Hunts & Eats");
    }
}
public class LaunchAnnotation1 
{
    public static void main(String[] args) 
    {
        Tiger t=new Tiger();
        t.animalUsuallyHuntsAndEat();
        
    }
    
}
