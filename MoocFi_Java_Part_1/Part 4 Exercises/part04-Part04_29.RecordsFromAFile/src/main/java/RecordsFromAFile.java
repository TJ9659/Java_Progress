
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        
        String file = scanner.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                
                if(line.isEmpty()){
                    continue;
                }
                
                String[] parts = line.split(",");
                
                String name = parts[0];
                String age = parts[1];
                
                System.out.println(name + ", age: " + age + " years");
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
