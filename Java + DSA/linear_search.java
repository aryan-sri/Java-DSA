import java.util.*;
class linear_search
{
    public static void main(String agrs[])
    {
        int[] arr = { 13, 12 , 43 ,41 , 23 , 69, 39};
        System.out.println("Enter Target Value");
        int target = new Scanner(System.in).nextInt();
        Boolean res = linear_search(arr , target);    
        if (res)
        {
            System.out.println("The Element is Present");
        }    
        else
        {
            System.out.println("The element is absent");
        }


    }
    static Boolean linear_search(int[] arr, int target)
    {
          if(arr.length == 0)
          {
            return false;
          }
          else
          {
            for(int i =0;i < arr.length; i++)
            {
                if(arr[i] == target)
                {
                    return true;
                }
            }
          }
          return false;
    }
}