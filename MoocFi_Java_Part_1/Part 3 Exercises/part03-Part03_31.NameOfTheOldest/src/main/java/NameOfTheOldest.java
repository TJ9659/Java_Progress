
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = Integer.MIN_VALUE;
        String oldestPerson = "";

        while(true){
            String str = scanner.nextLine();

            if(str.equals("")){
                break;
            }

            String[] pieces = str.split(",");

            int age = Integer.valueOf(pieces[1]);

            System.out.println(age);
            if(oldest < age){
                oldest = age;
                oldestPerson = pieces[0];
            }

        }

        System.out.println("Name of the oldest: " + oldestPerson);

    }
}
