public class NoOfFrogs {

     public static void main(String[] args) {
        String input = "crcroakoak"; // Change this to test other inputs

        int result = minNumberOfFrogs(input);

        if (result == -1) {
            System.out.println("Invalid croak sequence");
        } else {
            System.out.println("Minimum frogs needed: " + result);
        }
    }

    public static int minNumberOfFrogs(String croakOfFrogs) {
        int[] count = new int[5]; // For 'c', 'r', 'o', 'a', 'k'
        int frogs = 0;
        int maxFrogs = 0;

        for (int i = 0; i < croakOfFrogs.length(); i++) {
            char ch = croakOfFrogs.charAt(i);

            switch (ch) {
                case 'c':
                    count[0]++;
                    frogs++; 
                    maxFrogs = Math.max(maxFrogs, frogs);
                    System.out.println("Start new frog: " + frogs);
                    break;

                case 'r':
                    if (count[0] == 0) return -1;
                    count[0]--; count[1]++;
                    System.out.println("'c' → 'r'");
                    break;

                case 'o':
                    if (count[1] == 0) return -1;
                    count[1]--; count[2]++;
                    System.out.println("'r' → 'o'");
                    break;

                case 'a':
                    if (count[2] == 0) return -1;
                    count[2]--; count[3]++;
                    System.out.println("'o' → 'a'");
                    break;

                case 'k':
                    if (count[3] == 0) return -1;
                    count[3]--; 
                    frogs--;
                    System.out.println("Frog finished: " + frogs + " active");
                    break;

                default:
                    return -1; // Invalid character
            }

            // Debug print
            System.out.println("Counts: c=" + count[0] + " r=" + count[1] + " o=" + count[2] + " a=" + count[3]);
        }

        // After processing all, no frog should be mid-way
        for (int c : count) {
            if (c != 0) return -1;
        }

        return maxFrogs;
    }

   
}