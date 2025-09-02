public class WideningCasting {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue;  // Widening casting: int to long
        float floatValue = longValue;  // Widening casting: long to float
        double doubleValue = floatValue;  // Widening casting: float to double

        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
    }
}
