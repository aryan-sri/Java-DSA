class Prime_of_Prime
{
    public static boolean isPrime(int n)
    {
        int count =0;
        for(int i =1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                count++;
            }
        }
        if(count==1)
        {
            return true;
        }
        return false;
    }
    public static int digitSum(int n)
    {
        String s = n+"";
        int sum =0;
        for(int i =0;i<s.length();i++)
        {
            int d = Integer.parseInt(s.charAt(i)+"");
            sum = sum+d;
        }
        if(sum>9)
        {
            return digitSum(sum);
        }
        else
        {
            return sum;
        }

    }
    public static void main(String[] args) {
        
        int start = 11;
        int end = 999;
        int count =0;
        
        for(int i =start;i<=end;i++)
        {
            if(isPrime(i))
            {
                int dS = digitSum(i);
                // System.out.println(dS);
                if(isPrime(dS))
                {
                    System.out.print(i+","+dS+",");
                    count = count+2;
                }
            }
        }
        System.out.println("Count : " + count);
    }
}