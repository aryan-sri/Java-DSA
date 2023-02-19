import java.util.Arrays;

public class Quick_sort {
    
    public static void main(String[] args) {
        int nums[] = {5,4,3,2,1};
        sort(nums, 0 , nums.length-1);
        System.out.println("Sorted Array : "+ Arrays.toString(nums));
    }
    static void sort(int[] nums , int low ,int hi)
    {
        if(low>=hi)
        {
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e)
        {
            while(nums[s]<pivot) // It checks if LHS side is Less then no need to swap
            {
                s++;
            }
            while(nums[e]>pivot) //It Checks if RHS side is more then no need to swap
            {
                e--;
            }

            if(s<=e)
            {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }

            sort(nums, low, e);
            sort(nums, s, hi);

        }
    }
}
