import java.util.Scanner;
class Boolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print number for checking on even: ");
        double num = scanner.nextDouble();
        double num2 = num % 2;
        boolean tf = (num2 == 0);
        System.out.println(num + " is even? " + tf);
        }
    }
