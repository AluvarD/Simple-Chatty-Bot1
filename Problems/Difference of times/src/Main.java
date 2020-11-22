import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hourOne = scanner.nextInt();
        int minuteOne = scanner.nextInt();
        int secondOne = scanner.nextInt();
        int hourTwo = scanner.nextInt();
        int minuteTwo = scanner.nextInt();
        int secondTwo = scanner.nextInt();
        int hourThree = hourTwo - hourOne;
        int minuteThree = minuteTwo - minuteOne;
        int secondThree = secondTwo - secondOne;
        int result = hourThree * 60 * 60 + minuteThree * 60 + secondThree;
        System.out.println(result);
    }
}