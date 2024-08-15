import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.IsoEra;

public class LaunchDate2 
{
    public static void main(String[] args) 
    {
        LocalDate date=LocalDate.now();
        System.out.println(date);//current date of the system
        System.out.println("************************************");

        int dayOfMonth=date.getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println("************************************");

        int length=date.lengthOfMonth();
        System.out.println(length);
        System.out.println("************************************");

        LocalDateTime start=date.atStartOfDay();
        System.out.println(start);
        System.out.println("************************************");

        IsoEra era=date.getEra();
        System.out.println(era);
        System.out.println("************************************");

        int ylength=date.lengthOfYear();
        System.out.println(ylength);
        System.out.println("************************************");
        
        LocalDate date1=LocalDate.of(1999, 11, 24);
        System.out.println(date1);
        System.out.println("************************************");

        LocalTime time=LocalTime.now();
        System.out.println(time);
        int hour=time.getHour();
        int minute=time.getMinute();
        int second=time.getSecond();
        int nano=time.getNano();
        System.out.println("The current Time of the machine is "+hour+":"+minute+":"+second+":"+nano);
        System.out.println("************************************");

        LocalTime timeof=LocalTime.of(2, 30);
        System.out.println(timeof);
        System.out.println("************************************");

        LocalDateTime datetime=LocalDateTime.now();
        System.out.println(datetime);
    }
    
}
