public class functionality_2 {
	
	//public static int getNextFibonacciNumber(int n){
	
	//int first = 0, second = 1, next = 1;
	//while (next <=n){
	//first = second;
	//second = next;
	//next = first + second;
	//}
	//return next;
	//}
	
	public static int getNextFibonacciNumber(int n){
	
		int prev1 = 0, prev2 = 1;
		
		for (int i = 2; i <= n; i++) {
			int current = prev1 + prev2;
			prev1 = prev2;
			prev2 = current;
		}
		
		return prev2;
	}
}

