public class NarrowingCasting {
    public static void main(String[] args) {
        double doubleValue = 100.04;
        float floatValue = (float) doubleValue;  // Narrowing casting: double to float
        long longValue = (long) floatValue;  // Narrowing casting: float to long
        int intValue = (int) longValue;  // Narrowing casting: long to int

        System.out.println("double value: " + doubleValue);
        System.out.println("float value: " + floatValue);
        System.out.println("long value: " + longValue);
        System.out.println("int value: " + intValue);
    }
}
