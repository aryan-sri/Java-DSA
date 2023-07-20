public class TCS_Q {


    public static int CountOdd(char[] arr)
    {
        int count[] = new int[arr.length];
        for(int i =0;i<arr.length;i++)
        {
            int t = 0;
            for(int j =0;j<arr.length;j++)
            {
                if(arr[j] == arr[i])
                {
                     t++;
                }
            }
            count[i] = t;
        }
        for(int i =0;i<count.length;i++)
        {
            if(count[i]%2 == 1)
            {
                return i;
            }
        }
        return -1;
    }
    public static int Cruise(int[] E , int[] L)
    {
        int Final[] = new int[E.length];
        int prev =0;
         for(int i =0;i<E.length;i++)
         {
            Final[i] = (prev + E[i]) - L[i];
            prev = Final[i];
         }
         return Final[max(Final)];
        
    }
    public static int max(int arr[])
    {
        int g = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>arr[g])
            {
                g = i;
            }
        }
        return g;
    }
    public static int maxOne(int[][] arr)
    {
        int g=-99999;
        int index = -1;
        for(int i =0;i<arr.length;i++)
        {
            int count =0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]== 1)
                {
                    count++;
                }
            }
            if(count > g)
            {
                g = count;
                index = i;
            }
        }
        return index;
    }
    public static boolean Check(int[] arr, int n)
    {
        for(int i =0;i<n;i++)
        {
            if(arr[i]>= arr[n])
            {
                return false;
            }
        }
        return true;
    }
    public static int CountPrev(int[] arr)
    {
        int c=0;
        for(int i =0;i<arr.length;i++)
        {
            if(Check(arr, i))
            {
                c++;
            }
        }
        return c;
    }
    public static boolean Prime(int n)
    {
        int c =0;
        for(int i =1;i<=n;i++)
        {

            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        return false;
}
    public static void main(String[] args) {
        int[] arr = {7,4,8,2,9};
        System.out.println(CountPrev(arr));
        int[][] ar= { {0, 1, 0},
                    {1, 1, 0},
                    {1, 1, 1}
                  };
        System.out.println(maxOne(ar)+1);
        int[] E = {7,0,5,1,3};
        int[] L = {1,2,1,3,4};
        System.out.println(Cruise(E, L));
        char[] c = {'a','f','f','f','c','c','c','a','b','c'};
        if(CountOdd(c) >= 0)
        {
            System.out.println(c[CountOdd(c)]);
        }
        else
        {
            System.out.println("All are Even !");
        }
        int n = 11;
        System.out.println(Prime(n));
    }
}
