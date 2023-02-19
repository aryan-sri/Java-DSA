import java.util.*;
public class LT_1295 {
    
    public static void main(String[] args) {
        System.out.println("Enter the Array Size");
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
             arr[i] = new Scanner(System.in).nextInt();
        }
        int ans = count(arr);
        System.out.println(ans);

    }
    static int count(int[] arr)
    {
        int count=0;
        for(int i =0;i<arr.length;i++)
        {
           
            String a = String.valueOf(arr[i]);
            int d = a.length();

            if(d%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
