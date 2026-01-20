import java.util.*;

public class q27_number_to_words {

    private static final String[] ones = {
        "", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
    };

    private static final String[] teens = {
        "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN",
        "EIGHTEEN", "NINETEEN"
    };

    private static final String[] tens = {
        "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
    };

    private static final String[] thousands = {
        "", "THOUSAND", "MILLION", "BILLION"
    };

   
    private static String convertLessThanOneThousand(int num) {
        String words = "";

        if (num >= 100) {
            words += ones[num / 100] + " HUNDRED";
            num %= 100;
            if (num > 0) words += " AND ";
        }

        if (num >= 20) {
            words += tens[num / 10];
            num %= 10;
            if (num > 0) words += " " + ones[num];
        } else if (num >= 10) {
            words += teens[num - 10];
        } else if (num > 0) {
            words += ones[num];
        }

        return words.trim();
    }

   
    public static String numToWords(long num) {
        if (num == 0) return "ZERO";

        String words = "";
        int group = 0;

        while (num > 0) {
            int chunk = (int)(num % 1000);
            if (chunk != 0) {
                String chunkWords = convertLessThanOneThousand(chunk);
                if (!chunkWords.isEmpty()) {
                    words = chunkWords + " " + thousands[group] + " " + words;
                }
            }
            num /= 1000;
            group++;
        }

        return words.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to Convert to Words: ");
        long num = sc.nextLong();
        System.out.println(numToWords(num));
    }
}
