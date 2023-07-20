import java.util.Scanner;

public class ClassQ_6 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        int start =0;
        int end = s.length()-1;
        boolean flag = true;
        while(start<=end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
