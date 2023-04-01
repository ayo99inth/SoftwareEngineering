public class functionality_6 {
    public static boolean isSquareFibonacci(int num) {
        // Check if num is a perfect square
        double sqrt = Math.sqrt(num);
        if (sqrt - Math.floor(sqrt) != 0) {
            return false;
        }
        
        // Check if num is a Fibonacci number
        int a = 0, b = 1, temp;
        while (b < num) {
            temp = b;
            b = a + b;
            a = temp;
        }
        if (b == num) {
            return true;
        }
        
        return false;
    }
}

