package services;

public class SpringBoot implements Courses
{

    @Override
    public boolean GetTheCourse(double amount) 
    {
        System.out.println("SpringBoot Course is Purchased and Amount is Paid "+amount);
        return true;
    }
}
