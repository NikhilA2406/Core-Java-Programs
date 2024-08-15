import java.lang.annotation.Target;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD,ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@interface CricketPlayer
{
    String country() default "India";
    int age() default 35;
}
//@--> Specifies compiler Annotation type is being createed


//@CricketPlayer(country="India", age=35)
@CricketPlayer
class ViratKohli
{
    @CricketPlayer //disallowed but after invoking ElementType.FIELD
    private int innings;

    @CricketPlayer
    public int getInnings() {
        return innings;
    }

    public void setInnings(@CricketPlayer int innings) {
        this.innings = innings;
    }

    
}
public class LanuchAnnotation2 
{
    public static void main(String[] args) 
    {
        ViratKohli vk=new ViratKohli();
        vk.setInnings(454);
        System.out.println(vk.getInnings());

        System.out.println("*****************************");

        Class<? extends ViratKohli> c=vk.getClass();
        Annotation an=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp=(CricketPlayer)an;
        int age=cp.age();
        String country=cp.country();
        System.out.println("Info Wihin Annotation: "+ age +" "+ country);
        
    }
    
}
