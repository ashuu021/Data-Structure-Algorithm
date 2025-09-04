import java.util.Scanner;
public class ReturnValueFunction {
    public static void main(String[] args) {
        int ans =sum();
System.out.print("Sum is "+ans);

    }
    static int sum(){
        int num1 ,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second value : ");
        num2 = sc.nextInt();
        int sum = num1+num2;
        sc.close();
        return sum;//the function is over 
    }

}
