import java.util.*;
public class Kaprekar {
    
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        
        String sqS = (n*n)+"";
       
        
            int first = Integer.parseInt(sqS.substring(0,sqS.length()/2));
            int second = Integer.parseInt(sqS.substring(sqS.length()/2, sqS.length()));

            if(first+second == n)
            {
                System.out.println("Kaprekar Number");
            }
            else
            {
                System.out.println("Not a Kaprekar Number");
            }
            }

        
    }

