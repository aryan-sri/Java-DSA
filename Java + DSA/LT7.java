import java.util.Arrays;

class LT7 {
    public static int firstMissingPositive(int[] nums) {
        int i =0;
        while(i < nums.length)
        {
            int correct = nums[i]-1;
            if(nums[i] > 0 && nums[i] != nums[correct])
            {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else 
            {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        for(int j =0;j<nums.length;j++)
        {
            if(j+1 != nums[j])
            {
                return j+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        int nums[] = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }
}