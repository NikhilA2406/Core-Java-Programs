//import java.util.Date;

import java.sql.Date;

public class LaunchDate1 
{
    public static void main(String[] args) 
    {
        // Date --> util, SQL Package

        // Java 8 --> joda.org -->joda - API -->New date & Time API--> Time package

        // Date datetime=new Date();
        // System.out.println(datetime);//Date class of util package would return current date

        // int year=datetime.getYear();//Depriciated Method
        // System.out.println(year);
        long time=1720712280987L;
        Date datetime=new Date(time);
        System.out.println(datetime);//It would return only Date
        
    }
    
}
