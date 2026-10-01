
import java.util.*;

public class LongestSubstring {

    static int lengthOfLongest(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right)))
                set.remove(s.charAt(left++));

            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    static String longestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, start = 0, max = 0;

        for (int r = 0; r < s.length(); r++) {

            if (map.containsKey(s.charAt(r)))
                left = Math.max(left, map.get(s.charAt(r)) + 1);

            map.put(s.charAt(r), r);

            if (r - left + 1 > max) {
                max = r - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + max);
    }

    public static void main(String[] args) {

        String[] tests = {
            "abcabcbb",
            "pwwkew",
            "bbbbb",
            "dvdf"
        };

        for (String s : tests)
            System.out.println(
                s + " | Len:" + lengthOfLongest(s) +
                " | Sub:" + longestSubstring(s)
            );
    }
}