import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchBWFW //Buffer Writer File writer
{   
    public static void main(String[] args) 
    {   
        //String Path1="E:\\IO\\FileHandling\\java.txt";
        String Path1="E:\\IO\\FileHandling";
        FileWriter fw=null;
        BufferedWriter bw=null;
        try 
        {
            //File file=new File(Path1);
            File dir=new File(Path1);
            File file=new File(dir,"java.txt");
            fw=new FileWriter(file);
            bw=new BufferedWriter(fw);
            bw.write("Aliens");
            bw.newLine();
            bw.write(66);
            bw.newLine();
            bw.write("CICD/Jerkins");
            bw.flush();
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
                bw.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        
    }
    
}
