import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        while (true) {
            inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                break;
            } else if (inputNumber % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}