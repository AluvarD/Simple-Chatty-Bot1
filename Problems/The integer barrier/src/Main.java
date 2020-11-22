import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sumOfInputNumbers = 0;
        while (true) {
            int inputNumber = scanner.nextInt();
            sumOfInputNumbers = sumOfInputNumbers + inputNumber;
            if (inputNumber == 0 || sumOfInputNumbers >= 1000) {
                break;
            }
        }
        if (sumOfInputNumbers >= 1000) {
            sumOfInputNumbers = sumOfInputNumbers - 1000;
        }
        System.out.println(sumOfInputNumbers);
    }
}