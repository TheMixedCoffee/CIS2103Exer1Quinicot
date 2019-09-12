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
    public Deck hand = new Deck();
    
    
    public void fold(){
        System.out.println(name + "folds");
    }
    
    public void check(){
        System.out.println(name + "checks");
    }
    
    public void raise(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Input amount to raise:");
        int raisedChips = getInput.nextInt();
        if(raisedChips <= chips){
            System.out.println(name + "raised" + raisedChips);
            chips-=raisedChips;
        }
    }
    
    public void displayInfo(){
        System.out.println("Player name: " + name);
        System.out.println("Chips: " + chips);
    }
    
}
