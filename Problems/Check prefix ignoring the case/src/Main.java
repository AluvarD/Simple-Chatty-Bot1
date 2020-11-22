import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        inputString = inputString.toLowerCase();
        if (inputString.startsWith("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}