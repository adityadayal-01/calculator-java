import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre first number: ");
        float a = sc.nextFloat();
        System.out.println("Entre second number: ");
        float b = sc.nextFloat();

        System.out.println("\nchoose operation: ");
        System.out.println("1.Addition");
        System.out.println("2.Substrsction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("Entre your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition= "+(a+b));
                break;
            case 2:
                System.out.println("Substraction= "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication= "+(a*b));
                break;
            case 4:
                if (b!=0)
                System.out.println("Division="+(a/b));
                else
                    System.out.println("Division by zero not allowed");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}