import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int queenOneX = scanner.nextInt();
        int queenOneY = scanner.nextInt();
        int queenTwoX = scanner.nextInt();
        int queenTwoY = scanner.nextInt();
        if (queenOneX == queenTwoX) {
            System.out.println("YES");
        } else if (queenOneY == queenTwoY) {
            System.out.println("YES");
        } else if (Math.abs(queenTwoX - queenOneX) == Math.abs(queenTwoY - queenOneY)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
