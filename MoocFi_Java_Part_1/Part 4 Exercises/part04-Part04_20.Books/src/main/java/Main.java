import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            
            Book book = new Book(title, pages, publicationYear);
            
            books.add(book);
        }
        
        System.out.println("What information will be printed?");
        String information = scanner.nextLine();
        
        if(information.equalsIgnoreCase("everything")){
            for(Book book : books){
                System.out.println(book);
            }
        }else if(information.equalsIgnoreCase("name")){
            for(Book book : books){
                System.out.println(book.getTitle());
            }
        }else if(information.equalsIgnoreCase("pages")){
            for(Book book : books){
                System.out.println(book.getPages());
            }
        }else if(information.equalsIgnoreCase("year")){
            for(Book book : books){
                System.out.println(book.getPublicationYear());
            }
        }

    }
}
