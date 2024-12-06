/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Cube {
    private int edgeLength;
    private int volume;
    public Cube (int edgeLength){
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        return (int)(Math.pow(edgeLength, 3));
    }
    
    @Override
    public String toString(){
        return "The length of the edge is " + this.edgeLength + " and the volume " + this.volume();
    }
    
    //"The length of the edge is l and the volume v"
}
