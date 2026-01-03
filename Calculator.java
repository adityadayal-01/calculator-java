import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Entre the first number: ");
            float a = sc.nextFloat();

            System.out.print("Entre the second number: ");
            float b = sc.nextFloat();

            System.out.println("\nchoose what operation you prefer: ");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Entre your choice: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Addittion: " + (a + b));
                    break;
                case 2:
                    System.out.println("Substraction: " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("Division: " + (a / b));
                    else
                        System.out.println("Division by zero not allowed");
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("\nDo you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println();
        } while (choice == 'y' || choice == 'y');
        sc.close();
        System.out.println("Calculator closed. Thank you");
    }
}