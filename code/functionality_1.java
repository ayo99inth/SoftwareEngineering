import java.io.File;
import java.util.Scanner;

public class functionality_1 {

	//public static boolean isFibonacci(int number) {


    //if (number == 0 || number == 1) {
      //  return true;
    //}
    //int a = 0, b = 1, c = 1;
    //while (c < number) {
        //c = a + b;
        //a = b;
      //  b = c;
    //}
  //  return (c == number);
//	}
//}

//public static int fibonacci(int n) {

//	if (n <=1) {
//		return n;
//	}
	
//	int prev1 = 0;
//	int prev2 = 1;
//	int current = 0;

//	for (int i = 2; i <= n; i++) {
//		current = prev1 + prev2;
//		prev1 = prev2;
//		prev2 = current;
//	}

//	return current;
//	}
//}


    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }
        int a = 0, b = 1, c = 1;
        while (c < number) {
            c = a + b;
            a = b;
            b = c;
        }
        return (c == number);
    }

    public static void main(String[] args) {
        try {
            File file = new File("Fibonacci.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                boolean isFibonacci = isFibonacci(number);
                System.out.println(number + " is " + (isFibonacci ? "" : "not ") + "a Fibonacci number");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

