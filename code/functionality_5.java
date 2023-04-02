public class functionality_5 {
    //public static boolean isSquare(int number) {
        //if (number < 0) {
         //   return false;
       // }
        //int sqrt = (int) Math.sqrt(number);
        //return sqrt * sqrt == number;
    //}
    
    public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int sqrt = 0;
        while (sqrt * sqrt <= number) {
            if (sqrt * sqrt == number) {
                return true;
            }
            sqrt++;
        }
        return false;
    }
}

