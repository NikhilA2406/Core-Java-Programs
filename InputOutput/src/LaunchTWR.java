import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Telusko implements AutoCloseable
{

    @Override
    public void close() throws Exception 
    {
        System.out.println("Close method internally get called if we create instance in try with resources block");
    }

}
public class LaunchTWR //try with resources
{
    public static void main(String[] args) 
    {   
        
        // try(BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\IO\\FileHandling\\java.txt"))) 
        // {
        //     bw.write("Aliens");
        //     bw.newLine();
        //     bw.write(66);
        //     bw.newLine();
        //     bw.write("CICD/Jerkins");
        //     bw.flush();
        //     System.out.println("Kindly check the file in the specified location to see the outcome ");
            
        // } 
        try(Telusko tel=new Telusko())
        {
            System.out.println("Some body or logic in try block");
        }
        catch (Exception e) 
        {
            System.out.println("Something went worng");
        }

       
        
        
    }
    
}
