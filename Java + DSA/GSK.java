// Java program for the above approach
import java.io.*;
import java.lang.*;
import java.util.*;
 
class GSK{
 
static int findCount(List<Integer> arr)
{
    if(arr.size()<=1)
    {
        return 0;
    }
     int N = arr.size();
   
    int ans = 0;
 
    
    int bits[] = new int[32];
 
   
    for(int i = 0; i < N; i++)
    {
         
        
        int val = (int)(Math.log(arr.get(i)) /
                        Math.log(2));
 
        ans += bits[val];
        bits[val]++;
    }
    return N * (N - 1) / 2 - ans;
}
 
// Driver Code
public static void main(String[] args)
{
     
    // Given array arr[]
    int arr[] = { 1,1,5,7};
 
    int N = arr.length;
 
    // Function Call
    System.out.println(findCount(arr, N));
}
}