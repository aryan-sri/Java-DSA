/**
 * Unique_by_bit
 */
public class Unique_by_bit {

    public static void main(String[] args) {
        int[] arr={2, 3, 4, 5, 6, 5, 4, 3, 2};
        System.out.println(Unique(arr));
    }
    public static int Unique(int arr[])
    {
        int unique = 0;
        for(int i=0;i<arr.length;i++)
        {
            unique = arr[i]^unique;
        }
        return unique;
    }
  
}