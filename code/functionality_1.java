public class functionality_1 {

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
}
