import java.util.*;
public class ION_Test {
    
    public static int isEmpty(String[][] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i][0].equals("false"))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int size = 10;
        String[][] Parking = new String[size][2];

        for(int i = 0;i<size;i++)
        {
            Parking[i][0] = "false";
            Parking[i][1] = "";
        }

        System.out.println("Do You Have to Park?");
        String s = ob.nextLine();
         System.out.println("Enter Your Name");
         String DN = ob.nextLine();
        if(s.equals("Yes"))
        {
           
            if(isEmpty(Parking)>=0)
            {
                Parking[isEmpty(Parking)][0] = "true";
                Parking[isEmpty(Parking)][1] = DN;
            }
        }
        else
        {
            System.out.println("The Location is Full!");
        }

        System.out.println("Enter your name to Retrieve");
        String rt = ob.nextLine();
        boolean Flag = false;
        for(int i =  0;i<size;i++)
        {
            if(rt.equals(Parking[i][1]))
            {
                Flag = true;
                System.out.println("The Car "+ DN +" is Parked");
            }
        }
        
    }
}
