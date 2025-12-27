import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre first number: ");
        float a = sc.nextFloat();

        System.out.println("Entre second number: ");
        float b = sc.nextFloat();
        //for sum
        float sum = a+b;
        //for difference
        float difference = a-b;
        //for multiplication
        float product = a*b;
        //and for division
        float quotient = a / b;
        System.out.println("\nResult: ");
        System.out.println("Addition = " + sum);
        System.out.println("Substraction = " + difference);
        System.out.println("Multiplication = " + product);
        System.out.println("Division = " + quotient);

        sc.close();
    }
}