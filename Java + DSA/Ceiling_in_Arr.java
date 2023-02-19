

class Ceiling_in_arr
{
    public static void main(String[] args) 
    {
        int arr[] = { 2,4,5,7,9,13,16,17,20,25};
        int target = 15;
        int ans = Ceiling_in_Arr(arr , target);
        System.out.println(arr[ans]);
        
    }
    public static int Ceiling_in_Arr(int[] arr , int target)
    {
        int start = 0;
        int end =  arr.length;
       while(start<=end)
       {
        int mid = start +(end -start) /2;
        if(arr[mid]>target)
        {
            end = mid -1;
        }
        else if( arr[mid]<target)
        {
            start = start +1;
        }
        else 
        {
            return mid;
        }
       }
       return start;
}
}