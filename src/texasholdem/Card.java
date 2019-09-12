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
public class Card {
    int suit;
    int value;
    String translation;
    int taken; // Card is not yet taken = 0, otherwise 1
    
    public void translateCard(){
        switch(value){
            case 1:
                translation = "Ace of ";
                break;
            case 2:
                translation = "Two of ";
                break;
            case 3:
                translation = "Three of ";
                break;
            case 4:
                translation = "Four of ";
                break;    
            case 5:
                translation = "Five of";
                break;
            case 6:
                translation = "Six of ";
                break;
            case 7:
                translation = "Seven of ";
                break;
            case 8:
                translation = "Eight of ";
                break;
            case 9:
                translation = "Nine of ";
                break;
            case 10:
                translation = "Ten of ";
                break;
            case 11:
                translation = "Jack of ";
                break;
            case 12:
                translation = "Queen of ";
                break;
            case 13:
                translation = "King of ";
                break;
        }
        switch(suit){
            case 1:
                translation += "Hearts ";
                break;
            case 2:
                translation += "Clubs ";
                break;
            case 3:
                translation += "Spades ";
                break;
            case 4:
                translation += "Diamonds ";
                break;
        }
    }
}
