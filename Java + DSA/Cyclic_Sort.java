import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) 
    {
        int[] arr = { 5,3,4,1,2};
        Cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] Cyclic_sort(int[] arr)
    {

            int i=0;
            while(i<arr.length)
            {
                int correct = arr[i]-1;
                if(arr[correct] != arr[i])
                {
                    int temp = arr[correct];
                    arr[correct] = arr[i];
                    arr[i] = temp;
                }
                else
                {
                    i++;
                }
            }
            return arr;
    }
    
}
