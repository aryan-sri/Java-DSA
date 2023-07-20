import java.util.ArrayList;

public class ClassQ_5 {
    public static boolean check(int n, int[] arr)
    {
        int c = arr[n];
        for(int i =n+1;i<arr.length;i++)
        {
               if(c <= arr[i])
               {
                return false; 
               }
        }
        return true;
    }
   public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        int arr[] = {15,19,5,3,4,2};
        for(int i =arr.length;i>=0;i--)
        {
            if(i==arr.length-1)
            {
                ar.add(arr[i]);
            }
            if(i<arr.length-1)
            {
                if(check(i, arr))
                {
                    ar.add(arr[i]);
                }
            }
        }
        for(int i =0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }
    }
}
