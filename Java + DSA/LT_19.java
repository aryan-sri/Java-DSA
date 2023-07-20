import java.util.Arrays;

public class LT_19 {

    public static void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
    // System.out.println(Arrays.toString(nums));
}

public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
    System.out.println(Arrays.toString(nums));

}
    public static int[] Rotate(int nums[])
    {
        int ans[] = new int[nums.length];
        int last = nums[nums.length-1];
        for(int i =nums.length-1;i>0;i--)
        {
             nums[i] = nums[i-1];
        }
        nums[0] = last;
        return nums;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        rotate(nums,k);
        // System.out.println(Arrays.toString(Rotate(nums)));
    }
}


