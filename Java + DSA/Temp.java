import java.util.*;
public class Temp {
    public static void main(String[] args) {
    
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Your name ");
        String name = ob.nextLine();
        System.out.println("Enter the Active Temperature (in C)");
        float acTemp = ob.nextFloat();
        System.out.printf(" Temperature in Degree Fahrenheit : %.1f",conversion(acTemp));

    }
    public static float conversion(float temp)
    {
        float c = (1.8f *temp) +32;

        return c;
    }
    
}
