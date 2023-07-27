package com.qa.blackjack;

public class Blackjack {

    public String playGame(int handOne, int handTwo){
        if(handOne < 0 || handTwo < 0){
            return "A player has a total below 0";
        } else if(handOne > 21 && handTwo > 21){
            return "Both players have gone bust!";
        } else if(handOne == handTwo){
            return "Draw! Both players have the same";
        } else if(handOne > 21){
            return "Hand 2 wins with a hand of " + String.valueOf(handTwo);
        } else if(handTwo > 21){
            return "Hand 1 wins with a hand of " + String.valueOf(handOne);
        } else if(handOne > handTwo){
            return "Hand 1 wins with a hand of " + String.valueOf(handOne);
        } else{
            return "Hand 2 wins with a hand of " + String.valueOf(handTwo);
        }
    }
}
