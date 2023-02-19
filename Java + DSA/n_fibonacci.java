public class n_fibonacci {
    public static void main(String[] args) {
        fibonacci(1 , 0 ,1);

    }
    public static void fibonacci(int n, int x , int y)
    {
          if(10 == n)
          {
            System.out.println(y);
            return;
          }
          System.out.println(y);
          int z = x;
          x = y;
          y = y+z;

          fibonacci(n, x, y);
    }
}
