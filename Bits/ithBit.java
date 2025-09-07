package Bits;

public class ithBit {


    // 🧾 Print binary representation (8-bit padded)
    static void printBinary(int num) {
        System.out.println(num + " → " + String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0'));
    }

    // ➡️ Left Shift
    static void leftShift(int num, int shiftBy) {
        int result = num << shiftBy;
        System.out.println("\n🔁 Left Shift by " + shiftBy);
        printBinary(num);
        printBinary(result);
    }

    // ⬅️ Right Shift
    static void rightShift(int num, int shiftBy) {
        int result = num >> shiftBy;
        System.out.println("\n🔁 Right Shift by " + shiftBy);
        printBinary(num);
        printBinary(result);
    }

    // ✳️ Set Bit
    static void setBit(int num, int i) {
        int result = num | (1 << i);
        System.out.println("\n✅ Set Bit at position " + i);
        printBinary(num);
        printBinary(result);
    }

    // 🧹 Reset Bit
    static void resetBit(int num, int i) {
        int result = num & ~(1 << i);
        System.out.println("\n❌ Reset Bit at position " + i);
        printBinary(num);
        printBinary(result);
    }

    // 🔁 Toggle Bit
    static void toggleBit(int num, int i) {
        int result = num ^ (1 << i);
        System.out.println("\n🔄 Toggle Bit at position " + i);
        printBinary(num);
        printBinary(result);
    }

    // 🔍 Check Bit
    static void checkBit(int num, int i) {
        int bit = (num >> i) & 1;
        System.out.println("\n🔎 Check Bit at position " + i + ": " + (bit == 1 ? "SET (1)" : "NOT SET (0)"));
        printBinary(num);
    }

    // 🚀 Main Method: Test All
    public static void main(String[] args) {
        int num = 23;

        leftShift(num, 2);
        rightShift(num, 2);
        setBit(num, 1);
        resetBit(num, 2);
        toggleBit(num, 0);
        checkBit(num, 2);  // Should be set
        checkBit(num, 3);  // Should be set
        checkBit(num, 6);  // Should be not set
    }
}

