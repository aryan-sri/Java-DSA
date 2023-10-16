public class Pragamatic_Play {
    
    public static int Count(int arr[])
    {
        int count =0;
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                         count++;
                    }
                    System.out.println("("+arr[i] +" ,"+arr[j]+")");
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int N = 3;
        int[] arr = {1,1,1};
        float ans = (float)Count(arr)/3;
        System.out.println(ans);
        
    }
}
