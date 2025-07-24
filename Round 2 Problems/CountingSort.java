 public class CountingSort {
    public static void main(String[] args) {
        String input = "edsab";
        String sorted = countSort(input);
        System.out.println("Sorted string: " + sorted);  // Output: abdes
    }

    public static String countSort(String arr) {
        int[] count = new int[26]; // 26 letters for a-z

        // Count frequency of each character
        for (int i = 0; i < arr.length(); i++) {
            int index = arr.charAt(i) - 'a'; // 'a' = 0, 'b' = 1, ..., 'z' = 25
            count[index]++;
        }

        // Build the sorted result
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                ans.append((char)(i + 'a'));
            }
        }

        return ans.toString();
    }
}
