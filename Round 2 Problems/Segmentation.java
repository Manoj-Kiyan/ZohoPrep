import java.util.*;

public class Segmentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> dict = new HashSet<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "ice", "cream", "icecream"));
        List<String> result = new ArrayList<>();

        System.out.println("Enter the input: ");
        String str = sc.nextLine();

        if (CanSegment(str,dict,result)) {
            System.out.println("Segmentation: " + String.join(" ", result));
        } else {
            System.out.println("No segmentation possible.");
        }
    }
    private static boolean CanSegment(String str, Set<String> dict, List<String> result) {
        if (str.length() == 0) {
            return true;
        }

        for (int i = 1; i <= str.length(); i++) {
            String prefix = str.substring(0, i);
            if (dict.contains(prefix)) {
                result.add(prefix);
                if (CanSegment(str.substring(i), dict, result)) {
                    return true;
                }
                result.remove(result.size() - 1); 
            }
        }
        return false;
    }
}
