public class ClassQ_2 {

    public static void main(String[] args) {
        int m =100;
        int n = 200;
        int count =0;
        for(int i =m;i<=n;i++)
        {
            String s = i+"";
            boolean check = true;
            for(int j = 0;j<s.length();j++)
            {
                char c = s.charAt(j);
                if(!(c == '1' || c == '4' || c=='9'))
                {
                    check = false;
                    break;
                }
            }
            if(check)
            {
                System.out.print(s + " ");
                count++;
            }
           
        }
        System.out.println("Count :" +count);

        }
        
        
    }

