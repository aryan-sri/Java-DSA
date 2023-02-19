public class Rc_reverse_n {
    
    public static void main(String[] args) {
        
        int n = 1234;
        int digits = (int)(Math.log10(n))+1;
        System.out.println(Reverse(n, digits-1));
    }
    static int Reverse( int n , int c)
    {
         if(n==0)
         {
            return 0;
         }
         return (int) ((n%10)*Math.pow(10,c) +Reverse(n/10 , c-1))  ;
         
    }
}
