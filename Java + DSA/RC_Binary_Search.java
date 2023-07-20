public class RC_Binary_Search {
    public static int Binary_Search(int[] arr, int start, int end, int target)
    {
        if(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid]< target)
            {
                start = mid+1;
                return Binary_Search(arr, start, end, target);
            }
            else
            {
                end = mid-1;
                return Binary_Search(arr, start,end , target);
            }
        }
        else{
        return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(Binary_Search(arr,0 , arr.length,target));
    }
}
