 import java.util.Scanner;
public class ParameterExample {
    public static void main(String[] args) {
     int ans = sumOf(23, 32);
     System.out.println(ans);
    System.out.println("Enter the name ");
     Scanner sc = new Scanner(System.in);
     String name =sc.next();
     String message =greet(name);
     System.out.println(message);

    }
    static int sumOf(int a, int b){
        int sum = a + b;
        return sum;

    }
static String greet(String name){
    String message ="Hello "+name;
    return message;
}
}
