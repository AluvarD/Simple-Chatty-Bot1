//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Input guest's for first double room:");
        String firsDoubleRoom1 = scanner.next();
        String firsDoubleRoom2 = scanner.next();

        //System.out.println("Input guest's for single room:");
        String singleRoom = scanner.next();

        //System.out.println("Input guest's for family room:");
        String familyRoom1 = scanner.next();
        String familyRoom2 = scanner.next();
        String familyRoom3 = scanner.next();

        //System.out.println("Input guest's for second double room:");
        String secondDoubleRoom1 = scanner.next();
        String secondDoubleRoom2 = scanner.next();

        System.out.println(/*"Guests: \n" + */secondDoubleRoom2 + "\n" + secondDoubleRoom1 + "\n"
                + familyRoom3 + "\n" + familyRoom2 + "\n" + familyRoom1 + "\n" + singleRoom + "\n"
                + firsDoubleRoom2 + "\n" + firsDoubleRoom1);
    }
}
