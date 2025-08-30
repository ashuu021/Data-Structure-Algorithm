import java.util.Scanner;

public class Input {

public static void main(String[] args) {
    System.out.println("Enter your name");
Scanner input = new Scanner(System.in);
System.out.println(input.next()); //Take the str(one word)
System.out.println(input.nextLine()); //Take the str(set of words)

System.out.println(input.nextInt());//Take the integer
input.close();
} 
}