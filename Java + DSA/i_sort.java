import java.util.*;
public class i_sort {
    public static void main(String[] args) {
     int arr[] = {5,4,3,1,2};
     i_sorting(arr);
     System.out.println(Arrays.toString(arr));   

    }
    static int[] i_sorting(int[] arr)
    {
        for(int i =0;i<=arr.length-2;i++)
        {
           for(int j = i+1;j>0;j--)
           {
            if(arr[j-1]>arr[j])
            {
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
            }
           }
        }
        return arr;
    }
}
