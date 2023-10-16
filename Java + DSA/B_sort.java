import java.util.Arrays;

public class B_sort {
    public static void main(String[] args) {
        int arr[] ={3,4,1,2,5};
        b_sort(arr);
        System.out.println(Arrays.toString(arr));

        


    }
    public static int[] b_sort(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]< arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }
}
