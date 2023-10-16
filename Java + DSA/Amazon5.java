import java.util.Scanner;
public class Amazon5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.isEmpty())
        {
            System.out.print(0);
        }
        for(int i =0;i<str.length();i++)
        {
            char c = str.charAt(i);
            int occur = Count(c, str, i);
            System.out.print(occur +" ");
        }
        
    }
    public static int Count(char c, String str,int j)
    {
        int count =0;
        for(int i =j+1;i<str.length();i++)
        {
            if(str.charAt(i) == c)
            {
                count++;
            }
        }
        return count;
    }
}
