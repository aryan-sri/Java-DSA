public class rc_linear_search {
     
    public static void main(String[] args) {
        
        int arr[] = {0,1,3,4,43,12};
        System.out.println(Linear_search(arr, 4, 0));
    }
    private static boolean Linear_search(int[] arr ,int target , int index) {
    
        if(index == arr.length)
        {
            return false;
        }
          return (arr[index]== target || Linear_search(arr, target, index+1));     
    }
}
