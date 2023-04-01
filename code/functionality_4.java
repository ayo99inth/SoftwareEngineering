import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class functionality_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        // Call the isFibonacci method from the Fibonacci class
        boolean[] result = new boolean[n];
        for (int i = 0; i < n; i++) {
            result[i] = functionality_1.isFibonacci(numbers[i]);
        }

        System.out.println("Result: " + Arrays.toString(result));
    }
}

