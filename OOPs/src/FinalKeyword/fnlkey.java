package FinalKeyword;
class AutoMobile1
{
    final int engineNo=2245;
    final public void engineInfo()
    {
        //engineNo=2345;
        System.out.println("Logic which has generic details about engine");
    }
}
class Bike extends AutoMobile1
{
    // public void engineInfo()
    // {
    //     System.out.println("Logic which has specific bike generic details about engine");
    // }

}
public class fnlkey {
    public static void main(String[] args) {
        Bike bk=new Bike();
        bk.engineInfo();
    }
    
}
