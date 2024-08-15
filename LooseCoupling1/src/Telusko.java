import services.Courses;

public class Telusko 
{
    private Courses course;
    
    public void setCourse(Courses course) //Courses Course = new Courses()
    {
        this.course = course;
    }
    
    boolean buyTheCourse(double amount)
    {
        return course.GetTheCourse(amount);
    }
}
