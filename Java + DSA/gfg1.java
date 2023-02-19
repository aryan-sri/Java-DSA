import java.util.Arrays;

public class gfg1 {
    
    public static int[] pair(int[] arr , int X)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=arr.length-1;j>i;j--)
            {
                if(arr[i]+ arr[j] == X)
                {
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 26, 38, 9, 10};
        
        int X = 35;
        System.out.println(Arrays.toString(pair(arr,X)));
    }
}
