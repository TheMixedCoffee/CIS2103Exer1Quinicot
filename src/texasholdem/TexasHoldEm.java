/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package texasholdem;
import java.util.Scanner;
/**
 *
 * @author quinicotis_cis21035
 */
public class TexasHoldEm {

    /**
     * @param args the command line arguments
     */
    int numPlayers;
    int pot;
    Player[] playerList = new Player[8];
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public void createPlayer(){
        if(numPlayers < 8){
            playerList[numPlayers] = new Player();
            Scanner getInput = new Scanner(System.in);
            System.out.println("Input player name:");
            playerList[numPlayers].name = getInput.nextLine();
            System.out.println("Set initial chips:");
            playerList[numPlayers].chips = getInput.nextInt();
            numPlayers ++;
            System.out.println("Successfully added " + playerList[numPlayers-1].name);
        }else{
            System.out.println("Maximum number of players reached");
        }
    }
    
}
