import java.util.*;
class TwoD_Binary_Search
{
    public static void main(String args[]) 
    {
        int[][] arr = { {10 , 20 , 30 , 40},
                        {13 , 25 , 32 , 41},
                        {15 , 26 , 35 , 45},
                        {18 , 27 , 39 , 49} };

        int target = 27;
        
        System.out.println(Arrays.toString(Search(arr , target)));
    }
    public static int[] Search(int[][] arr , int target) 
    {
         int row = 0;
         int col = arr.length-1;
         while( row<= arr.length -1 && col>=0)
         {
            if(arr[row][col] == target)
            {
                return new int[]{row,col};
            }
            else if(arr[row][col] > target)
            {
                col--;
            }
            else
            {
                row++;
            }
         }        
         return new int[]{-1,-1};

    }
}