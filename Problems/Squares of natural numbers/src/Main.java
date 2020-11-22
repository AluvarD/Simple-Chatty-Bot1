import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = 1;
        int inputNumber = scanner.nextInt();
        while (Math.pow(naturalNumber, 2) <= inputNumber) {
            System.out.println((int) Math.pow(naturalNumber, 2));
            naturalNumber++;
        }
    }
}
