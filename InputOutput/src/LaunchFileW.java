import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFileW //File Write
{
    public static void main(String[] args) 
    {   
        //String Path1="E:\\IO\\FileHandling\\java.txt";
        String Path1="E:\\IO\\FileHandling";
        FileWriter fw=null;
        try 
        {
            //File file=new File(Path1);
            File dir=new File(Path1);
            File file=new File(dir,"java.txt");
            fw=new FileWriter(file);
            fw.write("Java");
            fw.write(65);
            char ch[]={'s','q','l'};
            fw.write(ch);
            System.out.println("Kindly check the file in the specified location to see the outcome ");
            
        } 
        catch (Exception e) 
        {
            System.out.println("Something went worng");
        }
        finally
        {
            try 
            {
                fw.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        
    }
    
}
