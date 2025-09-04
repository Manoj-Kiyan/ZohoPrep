public class RemoveSpaceStr {
 

    public static void main(String[] args) {
        String input = "Vaanga da mapla!";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                output.append(ch);
            }
        }

        System.out.println("Result: " + output.toString());
    }
}

