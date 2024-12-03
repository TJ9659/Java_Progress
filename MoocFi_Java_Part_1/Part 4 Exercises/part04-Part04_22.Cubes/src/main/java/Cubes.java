import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            String row = scanner.nextLine();
            
            if(row.equalsIgnoreCase("end")){
                break;
            }
            
            int num = Integer.valueOf(row);
            System.out.println(num * num * num);
            
            
        }
        
        

    }
}
