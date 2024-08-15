import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LaunchPWC //Print Writer Class 
{
    public static void main(String[] args) throws FileNotFoundException 
    {   
        String Path1="E:\\IO\\FileHandling";
        File dir = new File(Path1);
        File file = new File(dir,"Java.txt");

        PrintWriter pw=new PrintWriter(file);
        pw.println(true);
        pw.println(44.5);
        pw.println(14);
        pw.println("Java");
        pw.println("Spring");

        pw.close();


    }
}
