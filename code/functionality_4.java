import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class functionality_4 {
    //public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        //System.out.print("Enter the size of the array: ");
        //int n = input.nextInt();

        //int[] numbers = new int[n];

        //System.out.println("Enter the elements of the array: ");
        //for (int i = 0; i < n; i++) {
          //  numbers[i] = input.nextInt();
        //}

        // Call the isFibonacci method from the Fibonacci class
        //boolean[] result = new boolean[n];
        //for (int i = 0; i < n; i++) {
        //    result[i] = functionality_1.isFibonacci(numbers[i]);
      //  }

    //    System.out.println("Result: " + Arrays.toString(result));
  //  }
//}

    public static void main(String[] args) {
        try {
            File file = new File("Fibonacci.txt");
            Scanner scanner = new Scanner(file);

            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // Call the isFibonacci method from the Fibonacci class
            boolean[] result = new boolean[n];
            for (int i = 0; i < n; i++) {
                result[i] = functionality_1.isFibonacci(numbers[i]);
            }

            System.out.println("Result: " + Arrays.toString(result));

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

