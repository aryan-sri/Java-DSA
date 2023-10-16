public class rc_prime
{
    public static int primt(int n,int i, int count)
    {
        if(i==n)
        {
            return count+1;
        }
        if(n%i == 0)
        {
            return primt(n,++i,++count);
        }
        return primt(n,++i,count);
    }
    public static void main(String[] args) {
        int i = 1;
        while(i<=50)
        {
        if(primt(i, 1, 0) == 2)
        {
        System.out.println(i);
        }
        i++;
        
    }
    }
}