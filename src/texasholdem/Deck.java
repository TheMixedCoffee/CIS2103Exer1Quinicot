/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package texasholdem;
import java.util.Random;
/**
 *
 * @author quinicotis_cis21035
 */
public class Deck {
    public Card[][] deck = new Card[4][13];
    
    public Deck(){
        int i = 0;
        int j = 0;
        
        for(int suit = 1; suit<5; suit++){
            for(int value = 1; value<14; value++){
                deck[j][i].suit = suit;
                deck[j][i].value = value;
                i++;
            }
            j++;
        }
    }
    
    public static Deck dealRandom(){
        Random rand = new Random();
        int suit = rand.nextInt(3);
        int value = rand.nextInt(12);
        
    }
}
