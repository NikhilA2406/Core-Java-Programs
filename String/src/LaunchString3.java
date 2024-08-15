public class LaunchString3
{
    public static void main(String[] args) 
    {
        String str = "RajaRamMohanRoy";
        
        System.out.println(str.toUpperCase());//RAJARAMMOHANROY
        System.out.println(str.toLowerCase());//rajarammohanroy
        System.out.println(str.length());//15
        System.out.println(str.charAt(2));//j
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.lastIndexOf("a"));//10
        System.out.println(str.endsWith("Roy"));//True
        System.out.println(str.endsWith("y"));//True
        System.out.println(str.startsWith("Raj"));//True
        System.out.println(str.substring(4,12));//RamMohan
        System.out.println(str.substring(4));//RamMohanRoy
        char ar[]=str.toCharArray();
        for(char a:ar)
        {
            System.out.print(a+" ");//R a j a R a m M o h a n R o y
        }
        System.out.println();
    }
    
}
