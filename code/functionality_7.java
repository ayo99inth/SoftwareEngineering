public class functionality_7 {

    //public static int fibonacci(int n) {
        //if (n <= 1) {
         //   return n;
        //} else {
       //     return fibonacci(n-1) + fibonacci(n-2);
     //   }
    //}
    
    //public static void main(String[] args) {
    //    int n = 7; // Replace with the desired input value
  //      int result = fibonacci(n);
//        System.out.println("The " + n + "th Fibonacci number is: " + result);
    //}

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } 
        
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = b;
            b = a + b;
            a = temp;
        }
        
        return b;
    }
    
    public static void main(String[] args) {
        int n = 7; // Replace with the desired input value
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}


