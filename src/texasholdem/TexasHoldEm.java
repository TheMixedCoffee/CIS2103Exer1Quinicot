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

        TexasHoldEm creator = new TexasHoldEm();
        creator.setTable(creator);
        System.out.println();
        creator.startRound();
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
    
    public void setTable(TexasHoldEm creator){
        Scanner getInput = new Scanner(System.in);
        boolean bool = false;
        int players;
        do{
            System.out.println("Set number of players");
            players = getInput.nextInt();
            if(players < 2 || players > 8){
                System.out.println("There should be 2-8 players only");
            }else{
                bool = true;
            }
        }while(bool == false);
        if(bool == true){
            for(; players >0; players--){
                creator.createPlayer();
            }
        }               
    }
    
    public void startRound(){
        int playerCounter;
        if(numPlayers>=2){
            for(playerCounter = 0; playerCounter < numPlayers; playerCounter++){
                System.out.println(playerList[playerCounter].name + "'s turn");
                playerList[playerCounter].controller();
                System.out.println("End of turn");
            }
        }
    }
}


