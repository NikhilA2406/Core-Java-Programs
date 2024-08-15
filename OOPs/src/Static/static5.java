package Static;
class Gamma
{
    // int count;
    // Gamma()
    // {
    //     count++;
    // } in the case if we miss to increment the Static variable in contructor block then we have an option to write in the java initialization block 
        static int count;
        {
            count++;
        }
        Gamma()
        {
            
        }
        Gamma(int a)
        {
            
        }
        Gamma(int a, int b)
        {
            
        }
        public void disp() {
            
        }
}

public class static5 {
    public static void main(String[] args) {
        // Gamma g1=new Gamma();
        // System.out.println("The no. of Object Created :"+g1.count);
        // Gamma g2=new Gamma();
        // System.out.println("The no. of Object Created :"+g2.count);
        // Gamma g3=new Gamma();
        // System.out.println("The no. of Object Created :"+g3.count);
        // output
        // The no. of Object Created :1
        // The no. of Object Created :1
        // The no. of Object Created :1
//         Gamma g1=new Gamma();
//         System.out.println("The no. of Object Created :"+Gamma.count);
//         Gamma g2=new Gamma();
//         System.out.println("The no. of Object Created :"+Gamma.count);
//         Gamma g3=new Gamma();
//         System.out.println("The no. of Object Created :"+Gamma.count);
//         Output
//         The no. of Object Created :1
//         The no. of Object Created :2
//         The no. of Object Created :3
        Gamma g1=new Gamma();
        System.out.println("The no. of Object Created :"+Gamma.count);
        Gamma g2=new Gamma();
        System.out.println("The no. of Object Created :"+Gamma.count);
        Gamma g3=new Gamma();
        System.out.println("The no. of Object Created :"+Gamma.count);

    }
    
}
