import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        a = --a;
        b = --b;
        c = --c;
        d = --d;
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}