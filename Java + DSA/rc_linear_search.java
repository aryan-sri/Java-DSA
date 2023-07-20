public class rc_linear_search {
     
    public static void main(String[] args) {
        
        int arr[] = {0,1,3,4,43,12};
        System.out.println(Linear_Search(arr, 0, 4));
    }
    private static boolean Linear_search(int[] arr ,int target , int index) {
    
        if(index == arr.length)
        {
            return false;
        }
          return (arr[index]== target || Linear_search(arr, target, index+1));     
    }   
    public static int Linear_Search(int[] arr, int i, int n)
    {
        if(i == arr.length)
        {
            return -1;
        }
        else if(arr[i] == n)
        {
            return i;
        }

        return Linear_Search(arr, ++i, n);
    }
}
