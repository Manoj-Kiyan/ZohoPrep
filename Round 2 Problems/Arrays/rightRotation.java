package Arrays;

import java.util.Scanner;

public class rightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number of rotations
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();

        // Normalize rotations (in case k > n)
        k = k % n;

        // Rotate array (right rotation)
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        // Print rotated array
        System.out.println("Rotated Array:");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
