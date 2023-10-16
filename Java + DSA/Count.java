import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        int[] A = {2,7,4,6,8};
        int X = 4;
        int N = A.length;
        
        long result = count_pairs(N, A, X);
        
        System.out.println("Number of pairs with a product divisible by " +  + ": " + result);
    }

    static long count_pairs(int N, int[] A, int X) {
        long result = 0;
        
        // Create a HashMap to store the frequency of remainders when elements are divided by X
        Map<Integer, Integer> remainderFrequencyMap = new HashMap<>();
        
        // Iterate through the array A to calculate the frequency of remainders
        for (int i = 0; i < N; i++) {
            int num = A[i] % X;
            
            // Calculate the complementary remainder required to make a multiple of X
            int complementaryRemainder = (X - num) % X;
            
            // Check if the complementary remainder exists in the map
            if (remainderFrequencyMap.containsKey(complementaryRemainder)) {
                // Increment the result by the frequency of the complementary remainder
                result += remainderFrequencyMap.get(complementaryRemainder);
            }
            
            // Update the frequency map with the current remainder
            remainderFrequencyMap.put(num, remainderFrequencyMap.getOrDefault(num, 0) + 1);
        }
        
        return result;
    }
}
