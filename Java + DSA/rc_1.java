public class rc_1 {

    public static void main(String[] args) {
        fun(1);
    }
    public static void fun(int n)
    {
        if(n==6)
        {
            return ;
        }
        System.out.println(n);

        fun(n+1);
       

      
    }

    
}
