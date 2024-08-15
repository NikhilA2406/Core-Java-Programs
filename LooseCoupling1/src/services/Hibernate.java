package services;

public class Hibernate implements Courses
{

    @Override
    public boolean GetTheCourse(double amount) 
    {
        System.out.println("Hibernate Course is Purchased and Amount is Paid "+amount);
        return true;
    }

}
