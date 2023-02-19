import java.util.Arrays;

public class rc_bubble_sort {
    
     public static  void main(String[] args) {
        int arr[] = {2, 3 ,6 , 7, 4,1};
        Bubble(arr,0, 0);
        System.out.println(Arrays.toString(arr));
     }
     public static int[] swap(int[] arr, int i , int j)
     {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         return arr;
     }
     private static void Bubble(int[] arr,  int i , int j )
     {
        if(i == arr.length)
        {
            return;
        }
        if(j<arr.length-i-1)
        {
            if(arr[j]>arr[j+1])
            {
                arr = swap(arr, j , j+1 );
                Bubble(arr, i, j+1);
            }
            else
            {
                Bubble(arr, i, j+1);
            }
        }
        else
        {
            Bubble(arr, i+1, 0);
        }
     }
     
}
