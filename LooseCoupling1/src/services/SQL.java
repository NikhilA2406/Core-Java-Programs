package services;

public class SQL implements Courses
{

    @Override
    public boolean GetTheCourse(double amount) 
    {
        System.out.println("SQL Course is Purchased and Amount is Paid "+amount);
        return true;
    }
}
