enum Result
{
    PASS, FAIL, NR;

    // public static final Result PASS=new Result();
    // public static final Result FAIL=new Result();
    // public static final Result NR=new Result();
    int marks;
    
    Result() {
       System.out.println("Contructor of enum");
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
public class LaunchEnum2 
{
    public static void main(String[] args) {
        Result.PASS.setMarks(44);
        int marks=Result.PASS.getMarks();
        System.out.println(marks);//44

        int marks2=Result.FAIL.getMarks();
        System.out.println(marks2);//0
    }   
}
