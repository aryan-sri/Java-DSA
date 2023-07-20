import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        str = str.toLowerCase();
        char[] c = alpha.toCharArray();
        for(int i =0;i<c.length;i++)
        {
             if(str.indexOf(c[i]+"") >= 0)
             {
                 c[i] = '/';
             }
        }
        String ans = "";
        for(int j=0;j<c.length;j++)
        {
            if(c[j] != '/')
            {
            ans = ans+c[j];
            }
        }
        if(ans.isEmpty())
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(ans);
        }


    }
}
