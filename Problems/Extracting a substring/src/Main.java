import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(str.substring(firstNumber, secondNumber + 1));
    }
}