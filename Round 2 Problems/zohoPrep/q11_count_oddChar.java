import java.util.*;

public class q11_count_oddChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String ans = oddChar(str);
        System.out.println("Characters with odd frequency: " + ans);
    }

    public static String oddChar(String str) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        List<Character> result = new ArrayList<>();

       
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        
        for (char ch : freq.keySet()) {
            if (freq.get(ch) % 2 != 0) {
                result.add(ch);
            }
        }

        
        return result.toString();
    }
}
