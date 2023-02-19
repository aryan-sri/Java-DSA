public class Selection_Sorting {
    public static void main(String[] args) {
       int[] arr = { 4,5,1,2,3};
       int[] res = Sort(arr);
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(res[i]+ " ");
       } 
    }
    public static int[] Sort(int[] arr )
    {
        int n = arr.length;
          for(int i =0;i<n; i++ )
          {
            int g = Greatest(arr, (n-i-1));
            int temp = arr[g];
            arr[g] = arr[n-1-i];
            arr[n-1-i] = temp;
            
          }
          return arr;
    }
    public static int Greatest(int[] arr , int n)
    {
        int g = arr[0];
        int lastg = 0;
        for(int i = 0;i<=n;i++)
        {
            if(arr[i]>= g)
            {
                g = arr[i];
                lastg = i;
            }
        }
        return lastg;
        
    }

}
