/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package texasholdem;


/**
 *
 * @author quinicotis_cis21035
 */
public class Dealer {
    public static Deck cardDeck = new Deck();
    
    public static void shuffle(){
        System.out.println("Shuffling deck");
    }
    
    public static int collect(Player[] playerList, int numPlayers){
        int retVal = 0;
        for(int i = 0;i<numPlayers;i++){
            retVal += playerList[i].chips;
        }
        return retVal;
    }
    
    public static void deal(Player[] playerList, int numPlayers){
        int i, j;
        for(i=0;i<numPlayers;i++){
            for(j = 0; j<2; j++){
                playerList[i].hand = cardDeck.getRandomCard(cardDeck.deck);
            }
        }
        
    }
}
