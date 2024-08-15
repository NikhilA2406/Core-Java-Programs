enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}
// enum Compass
// {
//     NORTH, EAST, SOUTH, WEST;
// }

public class LaunchEnum1 
{
    // enum Result
    // {
    //     PASS, FAIL, NR;
    // }
    public static void main(String[] args) 
    {
        //final double PI=3.14;
        Week week=Week.MON;
        System.out.println(week);
        int ordinal=Week.THU.ordinal();
        System.out.println(ordinal);//3--> Index

       Week[] Daysweek=Week.values();
       for(Week w:Daysweek)
       {
        System.out.println(w.ordinal()+"->"+w);
       }

        
    }
    
}
