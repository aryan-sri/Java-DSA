import java.util.Arrays;

public class rc_selection_sort {
     public static void main(String[] args) {
        int arr[] = {2, 3 ,6 , 7, 4,1};
        Selection(arr,0);
        System.out.println(Arrays.toString(arr));
     }
     public static int[] swap(int[] arr, int i , int j)
     {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         return arr;
     }
     public static int largest(int[] arr , int last) {
            int g = Integer.MIN_VALUE;
            int index_g = -1;
            for(int i =0;i<=last;i++)
            {
                if(arr[i] > g)
                {
                    g = arr[i];
                    index_g = i;
                }
            }
        return index_g;
     }
     public static void Selection(int arr[] , int i )
     {
         if(i == arr.length)
         {
            return;
         }
         int last = arr.length-i-1;
         int max = largest(arr,  last);
         arr = swap(arr, last, max );
         Selection(arr, i+1);

     }

}
