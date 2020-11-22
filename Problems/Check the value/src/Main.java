import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        boolean result;
        if (number < 10 && number > 0) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }
}