public class Recursion_Binary {
    
public static void main(String[] args) {
    int arr[] = {2,4,6,8,10,13,15};
    System.out.println(Binary(0,arr.length-1,arr,10));
}
public static int Binary(int start , int end , int arr[], int c)
{
   
    if(start<=end)
    {
        int mid = (start+end)/2;
        if(arr[mid] == c)
        {
            return mid;
        }
        else if ( arr[mid]> c)
        {
            end = mid-1;
            return Binary(start, end, arr, c);
        }
        else
        {
            start = mid+1;
            return Binary(start, end, arr, c);
        }
    }
    else
    {
        return -1;
    }
    
}
}