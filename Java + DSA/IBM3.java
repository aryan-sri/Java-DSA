import java.util.*;
public class IBM3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int h = 10;
        double thetha = 30;
        double ra =Math.toRadians(thetha);
        double r = Math.tan(ra);
        System.out.println(Math.ceil((r*h)*(r*h)*3.14));

    }
}
