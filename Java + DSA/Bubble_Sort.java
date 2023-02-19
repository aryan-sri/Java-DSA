public class Bubble_Sort {
    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 2, 5};
        int arr1[] = new int[arr.length];
        arr1 = Bubble_sort(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        
    }
     public static int[] Bubble_sort(int[] arr)
    {
        for(int i =0;i<arr.length -1;i++)
        {
            for(int j=i+1; j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
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
