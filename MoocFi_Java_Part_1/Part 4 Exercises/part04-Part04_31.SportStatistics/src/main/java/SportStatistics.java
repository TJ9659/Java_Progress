
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Game> games = readGamesFromFile(file);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        for(Game game : games){
            if(game.getGamesPlayed(team) == true){
                gamesPlayed++;
            }
            
            if(game.getGamesWon(team) == true){
                gamesWon++;
            }
            
            
        }
        
        gamesLost = gamesPlayed - gamesWon;
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);

    }
    
    public static ArrayList<Game> readGamesFromFile(String file){
        ArrayList<Game> games = new ArrayList<>();
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                
                if(line.isEmpty()){
                    continue;
                }
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int htPoints = Integer.valueOf(parts[2]);
                int vtPoints = Integer.valueOf(parts[3]);
                
                
                Game game = new Game(homeTeam, visitingTeam, htPoints, vtPoints);
                games.add(game);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return games;
    }

}
