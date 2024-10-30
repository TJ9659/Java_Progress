
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a String: ");

        String str = scanner.nextLine();

        System.out.print(str + str + str);

        scanner.close();

    }
}
