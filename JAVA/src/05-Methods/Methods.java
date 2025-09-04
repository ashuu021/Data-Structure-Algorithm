public class Methods {
    // Method without parameters and without return value
    void displayMessage() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and without return value
    void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method without parameters but with return value
    int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    // Method with parameters and with return value
    int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();

        // Calling method without parameters and without return value
        methods.displayMessage();

        // Calling method with parameters and without return value
        methods.greetUser("Alice");

        // Calling method without parameters but with return value
        int randomNum = methods.getRandomNumber();
        System.out.println("Random Number: " + randomNum);

        // Calling method with parameters and with return value
        int sum = methods.addNumbers(5, 10);
        System.out.println("Sum: " + sum);
    } 
}
