import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 1;
        int maxNumber = 0;
        while (inputNumber > 0) {
            inputNumber = scanner.nextInt();
            if (inputNumber > maxNumber) {
                maxNumber = inputNumber;
            }
        }
        System.out.println(maxNumber);
    }
}