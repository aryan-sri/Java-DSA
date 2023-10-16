import java.util.*;
class Anagram
{
    public static void main(String[] args) {
        String S = new Scanner(System.in).nextLine();
        String S2 = new Scanner(System.in).nextLine();
        System.out.println(isAnagram(S.toLowerCase(), S2.toLowerCase()));
    }
    public static boolean isAnagram(String S , String S2) {
        
       char[] ch = S.toCharArray();
       char[] ch2 = S2.toCharArray();

       Arrays.sort(ch);
       Arrays.sort(ch2);

       
       

    }
}