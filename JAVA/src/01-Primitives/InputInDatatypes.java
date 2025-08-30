import java.util.Scanner;
public class InputInDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll number : ");
        int roll_number =sc.nextInt();
        System.out.println("Your roll number is "+roll_number);
        String name = sc.next();
        System.out.println("Your name is "+name);   
        float marks = sc.nextFloat();
        System.out.println("Your marks is "+marks);
        boolean isPassed = sc.nextBoolean();
        System.out.println("Is you passed? "+isPassed);
        sc.close();
    }
}
