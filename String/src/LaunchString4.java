public class LaunchString4
{
    public static void main(String[] args) {
        String str="Telusko"+"Alien";//SCP
        System.out.println(str);

        String str1="Telusko";
        System.out.println(str1.concat("Alien"));//if you use the predefine methods then the new object will be store in heap area

        // String str2="Telusko";
        //     str2.concat("JAVA");//heap
        //     System.out.println(str2);
        
        String str2="Telusko";//SCP
        str2=str2.concat("JAVA");//heap
        System.out.println(str2);
        
        String str5="Telsuko"+"Alien"+"JAVA";//SCP
        System.out.println("str5-->"+str5);
        String str4=str+str1+str2;
        System.out.println("str4-->"+str4);

        String str6="100"+4+10;
        System.out.println(str6);//100+4==1004 --> 1004+10==100410
        String str7=100+4+"10";
        System.out.println(str7);//100+4==104 --> 

        String str8="100"+(4+10);
        System.out.println(str8);
    }
    
}
