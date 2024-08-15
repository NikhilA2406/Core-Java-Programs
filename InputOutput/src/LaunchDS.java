import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
    private int id;
    private String name;
    transient private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void disp()
    {
        System.out.println("Name "+name);
        System.out.println("ID "+id);
        System.out.println("Salary "+salary);
    }
    
}
public class LaunchDS //Deserialization & Serialization 
{
    public static void main(String[] args) 
    {
        // Employee emp=new Employee(1, "Nikhil", 12000);
        // emp.disp();
        try 
        {
            // FileOutputStream fos=new FileOutputStream("E:\\IO\\FileHandling\\java.txt");
            // BufferedOutputStream bos=new BufferedOutputStream(fos);
            // ObjectOutputStream oos=new ObjectOutputStream(bos);
            // oos.writeObject(emp);
            // System.out.println("Kindly check file on HD");
            // bos.close();  
            // oos.close();

            FileInputStream fis=new FileInputStream("E:\\IO\\FileHandling\\java.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            ObjectInputStream ois=new ObjectInputStream(bis);
            Employee e=(Employee) ois.readObject();
            e.disp();
            ois.close();
            bis.close();
        } catch (Exception e) 
        {
            System.out.println("Some Problem......");
        }
    }
    
}
