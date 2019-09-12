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
public class Player {
    
    String name;
    int chips;
    public Card[][] hand = new Card[1][1];
    
    
    public void fold(){
        System.out.println(name + " folds");
    }
    
    public void check(){
        System.out.println(name + " checks");
    }
    
    public void raise(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Input amount to raise:");
        int raisedChips = getInput.nextInt();
        if(raisedChips <= chips){
            System.out.println(name + " raised " + raisedChips);
            chips-=raisedChips;
        }else{
            System.out.println("Not enough chips");
        }
    }
    
    public void displayInfo(){
        System.out.println("Player name: " + name);
        System.out.println("Chips: " + chips);
       //System.out.println("Hand: " + hand[0][0].translation);
       //System.out.println("Hand: " + hand[0][1].translation);
    }
    
    public void controller(){
        int option;
        Scanner getInput = new Scanner(System.in);
        do{
            System.out.println("[1]Fold [2]Check [3]Raise [4]Display Player Info");
            option = getInput.nextInt();
            switch(option){
                case 1:
                    fold();
                    break;
                case 2:
                    check();
                    break;
                case 3:
                    raise();
                    break;
                case 4:
                    displayInfo();
            }
        }while(option >3);
    }
    
}
