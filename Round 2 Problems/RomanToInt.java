import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String roman = "MCMXCIV";  // 1000 + 900 + 90 + 4 = 1994
        int result = romanToInteger(roman);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Loop from last to first
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int current = map.get(ch);

            if (current < prevValue) {
                result -= current;
            } else {
                result += current;
            }

            prevValue = current;
        }

        return result;
    }
}
