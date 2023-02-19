public class Palindrome {
    public static void main(String[] args) {
        
        String str = "abcdcba";
        String res = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            res = res+ch;   
        }
        System.out.println(str.equals(res));

    }
    
}
