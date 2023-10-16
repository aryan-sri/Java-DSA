import java.util.HashMap;
import java.util.Map;

public class LSM {

    public static int longestSubstringWithMaxTwoOccurrences(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

            while (charCount.size() > 2) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abaabcad";
        int result = longestSubstringWithMaxTwoOccurrences(s);
        System.out.println(result); // Output: 5 (for "baabe")
    }
}
