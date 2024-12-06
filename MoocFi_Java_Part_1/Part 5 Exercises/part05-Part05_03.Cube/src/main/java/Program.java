
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;

        // Experiment with your program here
        while(true){
            System.out.println("Please enter your cube's length: ");
            length = Integer.parseInt(scanner.nextLine());
            
            if(length < 0){
                break;
            }
            
            Cube cube = new Cube(length);
            
            System.out.println(cube);
        }
    }
}
