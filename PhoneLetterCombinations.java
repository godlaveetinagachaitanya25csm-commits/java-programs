import java.util.*;

public class PhoneLetterCombinations {

    static Map<Character, String> phoneMap = new HashMap<>();

    static {
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
    }

    static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.isEmpty())
            return result;

        Queue<String> queue = new LinkedList<>();
        queue.add("");

        for (char d : digits.toCharArray()) {

            String letters = phoneMap.get(d);
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                String curr = queue.poll();

                for (char c : letters.toCharArray()) {
                    queue.add(curr + c);
                }
            }
        }

        result.addAll(queue);
        return result;
    }

    public static void main(String[] args) {

        System.out.println("23 => " + letterCombinations("23"));
        System.out.println("9 => " + letterCombinations("9"));
        System.out.println("2 => " + letterCombinations("2"));
    }
}