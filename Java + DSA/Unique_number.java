public class Unique_number {
    public static CyclicPrime(int n)
    {
        String s = n+"";
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(0);
            
        }
    }
    public static boolean checkUnique(int n)
    {
        String s = n+"";
        int ar[] = new int[10];
        for(int i =0;i<s.length();i++)
        {
            int d = Integer.parseInt(s.charAt(i)+"");
            ar[d] = ar[d] + 1;

        }
        for(int i =0;i<ar.length;i++)
        {
            if(ar[i]>1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n =11234;
        System.out.println(checkUnique(n));
        
    }
}
