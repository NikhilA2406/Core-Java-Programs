import java.util.*;
public class LaunchSphere {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Radius of Sphere");
            float r = sc.nextFloat();
            float area = (4*3.14f*r)/3f;
            System.out.println("The area of Sphere is"+area);
        } 

    }
}
