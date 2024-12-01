
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        
        Statistics sumOfAll = new Statistics();
        Statistics sumOfEven = new Statistics();
        Statistics sumOfOdd = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        
        
        
        while(true){
            num = Integer.parseInt(scanner.nextLine());
            
            if(num == -1){
                break;
            }
            
            sumOfAll.addNumber(num);
            if(num % 2 == 0){
                sumOfEven.addNumber(num);
            }else{
                sumOfOdd.addNumber(num);
            }
            
            
        }
        
        
        
        
        
        
        System.out.println("Sum: " + sumOfAll.sum());
        System.out.println("Sum of even numbers: " + sumOfEven.sum());
        System.out.println("Sum of odd numbers: " + sumOfOdd.sum());
        
        
        
    }
}
