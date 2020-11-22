import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int A = 5, B = 4, C = 3, D = 2;
        int[] inputNumbers = new int[29];
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0;
        int gradesCount = scanner.nextInt();
        for (int i = 0; i < gradesCount; i++) {
            inputNumbers[i] = scanner.nextInt();
            if (inputNumbers[i] == A) {
                aCount++;
            } else if (inputNumbers[i] == B) {
                bCount++;
            } else if (inputNumbers[i] == C) {
                cCount++;
            } else if (inputNumbers[i] == D) {
                dCount++;
            }
        }
        System.out.println(dCount + " " + cCount + " " + bCount + " " + aCount);
    }
}