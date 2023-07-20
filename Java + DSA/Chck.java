import java.util.*;
public class Chck {
    public static void main(String[] args) {
        int[] arr = { 3 ,5,6,8,12,10,9,34,56,67,78,90};
       changeName(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeName(int[] nums)
    {
        nums[0] = 99;
    }

    
}
