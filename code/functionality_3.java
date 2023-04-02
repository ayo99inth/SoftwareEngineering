public class functionality_3 {	
//	public static boolean isInteger(double number){
//	return Double.valueOf(number).intValue() == number;
//	}

    public static boolean isInteger(double number) {
        int n = Double.valueOf(number).intValue();
        if (number < 0) {
            return false;
        }
        if (n == number) {
            return true;
        }
        return false;
    }
}

