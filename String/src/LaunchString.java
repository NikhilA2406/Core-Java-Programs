public class LaunchString 
{
    public static void main(String[] args) 
    {
        // String s1=new String("Alien");
        // String s2=new String("Alien");
        // System.out.println(s1==s2);//false (This compare through the address of reference variable)
        // System.out.println(s1.equals(s2));//True (This compare through the whatever the literal given to the string)
        
        // String s1="Alien";
        // String s2="Alien";
        // System.out.println(s1==s2);//True
        // System.out.println(s1.equals(s2));//True

        // String s1="Alien";
        // String s2="alien";
        // System.out.println(s1==s2);//False
        // System.out.println(s1.equals(s2));//False
        // System.out.println(s1.equalsIgnoreCase(s2));//True
        
        String s1="Alien";
        String s2=new String("alien");
        String s3="Alien";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        //System.out.println(s1.equalsIgnoreCase(s2));//True
    }
    
}
