/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int htPoints;
    private int vtPoints;
    
    public Game(String homeTeam, String visitingTeam, int htPoints, int vtPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.htPoints = htPoints;
        this.vtPoints = vtPoints;
    }
    
    
    
    public boolean getGamesPlayed(String team){
        
        return (this.homeTeam.equalsIgnoreCase(team) || this.visitingTeam.equalsIgnoreCase(team));
    }
    
    public boolean getGamesWon(String team){
        return (this.htPoints > this.vtPoints && this.homeTeam.equalsIgnoreCase(team) || this.htPoints < this.vtPoints && this.visitingTeam.equalsIgnoreCase(team));
    }
    
    
    
}
