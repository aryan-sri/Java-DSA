import java.util.Stack;
public class IBM2 {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<Integer>();
        Stack<Character> charr = new Stack<>();
        String s = "S1a2m3p4l5e";
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if((c >= 'a' && c<='z') ||(c >='A' && c<='Z'))
            {
                charr.push(c);
            }
            else if(c>='1' && c<='9')
            {
                number.push(Integer.parseInt(c+""));
            }
            else
            {
                System.out.println("Invalid");
                break;
            }
        }
        String num="";
        String wo = "";
        while(!charr.isEmpty())
        {
            wo = charr.pop()+wo;
        }
        
        while(!number.isEmpty())
        {
            num = number.pop()+num;
        }
        System.out.println("Number : "+num+" CHaracter : "+wo);

    }
}
