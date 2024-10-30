
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;

        while(true){
            String str = scanner.nextLine();

            if(str.equals("")){
                break;
            }

            String[] pieces = str.split(",");

            if(oldest < Integer.valueOf(pieces[1])){
                oldest = Integer.valueOf(pieces[1]);
            }

        }

        System.out.println("Age of the oldest: " + oldest);
    }
}
