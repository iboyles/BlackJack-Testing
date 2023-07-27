package com.qa;
import com.qa.blackjack.Blackjack;
import org.junit.jupiter.api.Test;

import java.util.prefs.BackingStoreException;

import static junit.framework.TestCase.assertEquals;

public class BlackjackTest {
    Blackjack play = new Blackjack();
    @Test
    public void draw(){
        int handOne = 0;
        int handTwo = 0;

        assertEquals("Draw! Both players have the same", play.playGame(handOne,handTwo));
    }
    @Test
    public void handWin() {
        int handOne = 14;
        int handTwo = 20;
        assertEquals("Hand 2 wins with a hand of 20",play.playGame(handOne,handTwo));
        handOne = 20;
        handTwo = 19;
        assertEquals("Hand 1 wins with a hand of 20",play.playGame(handOne,handTwo));

    }
    @Test
    public void underOrBust(){
        int handOne = 4;
        int handTwo = -1;
        assertEquals("A player has a total below 0",play.playGame(handOne,handTwo));
        handOne = 24;
        handTwo = 23;
        assertEquals("Both players have gone bust!",play.playGame(handOne,handTwo));
        handOne = 18;
        handTwo = 23;
        assertEquals("Hand 1 wins with a hand of 18",play.playGame(handOne,handTwo));
        handOne = 24;
        handTwo = 17;
        assertEquals("Hand 2 wins with a hand of 17",play.playGame(handOne,handTwo));

    }


}
