import java.util.*;
class DecimalToBinary{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        int decimal = scanner.nextInt();

        String binaryUsingBuiltIn = convertUsingBuiltInMethod(decimal);
        System.out.println("Binary (using built-in method): " + binaryUsingBuiltIn);

        String binaryUsingLoop = convertUsingLoop(decimal);
        System.out.println("Binary (using loop): " + binaryUsingLoop);

        scanner.close();
    
    }
    

    public static String convertUsingBuiltInMethod(int decimal) {
        return Integer.toBinaryString(decimal);
    }

   
    public static String convertUsingLoop(int decimal) {
        if (decimal == 0) {
            return "0"; 
        }

        StringBuilder binary = new StringBuilder();
        int number = decimal;

      
        while (number > 0) {
            int remainder = number % 2;
            binary.append(remainder);
            number /= 2;
        }

        
        return binary.reverse().toString();
    }
}

       

