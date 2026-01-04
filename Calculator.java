import java.util.Scanner;

class Calculator {

    // Method to show menu
    static void showMenu() {
        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    static float add(float a, float b) {
        return a + b;
    }

    static float subtract(float a, float b) {
        return a - b;
    }

    static float multiply(float a, float b) {
        return a * b;
    }

    static void divide(float a, float b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero not allowed");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char repeat;

        do {
            System.out.print("Enter first number: ");
            float a = sc.nextFloat();

            System.out.print("Enter second number: ");
            float b = sc.nextFloat();

            showMenu();

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition = " + add(a, b));
                    break;

                case 2:
                    System.out.println("Subtraction = " + subtract(a, b));
                    break;

                case 3:
                    System.out.println("Multiplication = " + multiply(a, b));
                    break;

                case 4:
                    divide(a, b);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            repeat = sc.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        sc.close();
        System.out.println("Calculator closed.");
    }
}
