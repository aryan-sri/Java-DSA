import java.util.*;

public class Amazon {

    public static int maxDistinctSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] converted = new int[n];
        Set<Integer> distinct = new HashSet<>();
        int maxSum = 0;
        int currentSum = 0;

      
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                converted[i] = nums[i] - 1;
            } else {
                converted[i] = nums[i];
            }
        }

        for (int right = 0, left = 0; right < n; right++) {
            while (distinct.contains(converted[right])) {
                distinct.remove(converted[left]);
                currentSum -= converted[left];
                left++;
            }
            distinct.add(converted[right]);
            currentSum += converted[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                distinct.remove(converted[left]);
                currentSum -= converted[left];
                left++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner ob  =new Scanner(System.in);
        int n = ob.nextInt(); ;
        int k = ob.nextInt();
        int nums[]  =new int[n];
        for(int i =0;i<n;i++)
        {
            nums[i] = ob.nextInt();
        }
        int result = maxDistinctSubarraySum(nums, k);
        System.out.println(result);
    }
}
