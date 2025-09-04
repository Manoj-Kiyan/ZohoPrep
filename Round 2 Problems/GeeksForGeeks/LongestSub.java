import java.util.*;

public class LongestSub {
    public static void main(String[] args) {
        String s = "abcabcbbd";
        lengthOfLongestSubstring(s);
    }

    public static void lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        int maxStartIndex = 0; 
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }

            map.put(c, right);

            int currentLen = right - left + 1;
            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxStartIndex = left;
            }
        }

        String longestSub = s.substring(maxStartIndex, maxStartIndex + maxLen);

        System.out.println("Length: " + maxLen);
        System.out.println("Substring: " + longestSub);
    }
}
