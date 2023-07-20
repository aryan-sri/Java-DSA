import java.util.*;
class Anagram
{
    public static void main(String[] args) {
        String S = new Scanner(System.in).nextLine();
        String S2 = new Scanner(System.in).nextLine();
        System.out.println(isAnagram(S.toLowerCase(), S2.toLowerCase()));
    }
    public static boolean isAnagram(String S , String S2) {
        
        if(S.length() == S2.length())
        {
            for(int i =0;i<S.length();i++)
            {
                char c = S.charAt(i);
                if(S2.indexOf(c) == -1)
                {
                    return false;

                }
            }
            return true;

        }
        
        else{
            return false;
        }
       

    }
}