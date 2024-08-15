import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;


class TshapedSkills
{
    String skills;
    Integer id;
    public TshapedSkills(String skills, Integer id) {
        super();
        this.skills = skills;
        this.id = id;
    }
    @Override
    public String toString() {
        return "TshapedSkills [skills=" + skills + ", id=" + id + "]";
    } 
      
}
public class LaunchMap1 {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        hm1.put(1, "Java");
        hm1.put(2, "Golang");
        hm1.put(3, "JS");
        System.out.println(hm1);

        //TshapedSkills ts=new TshapedSkills("MasterSkill",1);
        // HashMap hm2=new HashMap();
        // hm2.put("Alien", "Java");//Data would be store in key pair
        // hm2.put(ts, "Skills");
        // hm2.put(3, "Golang");
        // hm2.put(null, "Spring");//key can be null
        // hm2.put("data", null);//value can be null
        // hm2.put("Alien", "Java");//key has to be uniqe but value need not to be unique
        // System.out.println(hm2);
    
        // LinkedHashMap hm2=new LinkedHashMap();
        // hm2.put("Alien", "Java");//Data would be store in key pair
        // hm2.put(ts, "Skills");
        // hm2.put(3, "Golang");
        // hm2.put(null, "Spring");//key can be null
        // hm2.put("data", null);//value can be null
        // hm2.put("Alien", "Java");//key has to be uniqe but value need not to be unique
        // System.out.println(hm2);

        // HashMap<Integer,String> hm3=new HashMap<>();
        // //hm3.put(1, 2);
        // hm3.put(1, "Java");
        // hm3.put(2, "Golang");
        // //hm3.put("data", "Value");
        // System.out.println(hm3);

        // System.out.println("*************************************");

        // Hashtable ht=new Hashtable();
        // ht.put(1, "Java");
        // ht.put(2, "Spring");
        // ht.put("Alien", "Nikhil");
        // //ht.put(3, null);//Value cannot be Null in hashtable
        // //ht.put(null, "Jaiswal");//Key cannot be Null

        System.out.println("*************************************");

        TreeMap tm=new TreeMap();
        tm.put(1, "Nikhil");
        tm.put(2, "Jaiswal");
        tm.put(3, null);//Value can be Null in TreeMap
        //tm.put(null, "Uttika");//Key cannot be Null 
        System.out.println(tm);

    }
    
}
