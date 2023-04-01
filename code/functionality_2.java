public class functionality_2 {
	
	public static int getNextFibonacciNumber(int n){
	
	int first = 0, second = 1, next = 1;
	while (next <=n){
	first = second;
	second = next;
	next = first + second;
	}
	return next;
	}
}
