public class ArmStrong {
    
    public static void main(String[] args) {
        
        for(int i = 100; i<=999;i++)
        {
            if(isArmStrong(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmStrong(int n)
    {
          String s = n+"";
          int sum=0;
          for(int i =0;i<s.length();i++)
          {
            char c = s.charAt(i);
            int digit = Integer.parseInt(c+"");
            sum = sum + (digit*digit*digit);
          }
          return (n == sum)? true : false;
    }
}
