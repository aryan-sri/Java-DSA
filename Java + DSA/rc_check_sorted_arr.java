public class rc_check_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {0,1,2,8,4,5};
        System.out.println(ifsort(0, arr));
        System.out.print(ifsort(0, arr));
    
        System.out.print(ifsort(0, arr));
        
        System.out.print(ifsort(0, arr));
        
    }
   
    public static boolean ifsort(int c , int arr[])
    {
        if(c==arr.length-2)
        {
            return true;
        }
        return (arr[c] < arr[c+1] && ifsort(c+1, arr));
    }
}
