public class rc_factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1,5,1));
    }
    public static int factorial(int p , int n , int c)
    {
        if(c == n+1)
        {
            return p;
        }
        p = p*c;
        return factorial(p , n , c+1);
    }
}
