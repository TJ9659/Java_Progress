
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNext()){
                String row = fileScanner.nextLine();
                System.out.println(row);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        

    }
}