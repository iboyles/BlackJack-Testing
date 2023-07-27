package com.qa.blackjack;

import com.qa.Blackjack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackjackTest {

    Blackjack play = new Blackjack();

    @Test
    public void draw(){
        int handOne = 20;
        int handTwo = 20;

        assertEquals("Draw! Both players have the same", play.playGame(handOne, handTwo));
    }
}
