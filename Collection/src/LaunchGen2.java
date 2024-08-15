interface Igen<T>
{
    void disp();
}
class Generics<T> implements Igen<String>
{
    private T ref;
    public Generics(T ref)
    {
        this.ref=ref;
    }
    public void disp()
    {
        System.out.println("The type t is of "+ref.getClass().getName());
    }
    public T getRef() {
        return ref;
    }

}
public class LaunchGen2 {
    public static void main(String[] args) {
        Generics<Integer> g=new Generics<>(44);
        g.disp();
        System.out.println(g.getRef());

        //Generics<Integer> g1=new Generics<>("Java");CE
        Generics<String> g2=new Generics<>("Java");
        g2.disp();
        System.out.println(g2.getRef());

    }
    
}
