class Main
{
    public static void main(String[] args) 
    {
        int arr[] = { 2,4,5,7,9,13,17,20,25};
        int target = 15;
        int ans = binary_search(arr , target);
        System.out.println(arr[ans]);
        
    }
    public static int binary_search(int[] arr , int target)
    {
        int start = 0;
        int end =  arr.length-1;
      
        while(start < end)
        {
            int mid = (start+end)/2;
            if(arr[mid] == target)
            {
                
                return mid; 
            }
            else if( arr[mid]> target)
            {
                
                end = mid-1;
            }
            else if( arr[mid]<target)
            {
                start = mid+1;
            }
            
            
        }
       

     return -1;
        
    }
}