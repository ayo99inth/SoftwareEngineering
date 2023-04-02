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

public static int fibonacci(int n) {

	if (n <=1) {
		return n;
	}
	
	int prev1 = 0;
	int prev2 = 1;
	int current = 0;

	for (int i = 2; i <= n; i++) {
		current = prev1 + prev2;
		prev1 = prev2;
		prev2 = current;
	}

	return current;
	}
}
