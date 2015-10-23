package com.tenchichrono.basicbasketballplays.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dchi on 10/23/2015.
 */
public class PlayBook
{
    private List<Play> playBook;
    private Play play;

    public PlayBook ()
    {
        playBook = new ArrayList<>();
        play = new Play();

        play.setDetail("This is the pick and roll.");
        play.setName("Pick and Roll");
        playBook.add(play);

        play.setDetail("This is the pick and pop.");
        play.setName("Pick and pop");
        playBook.add(play);

        play.setDetail("This is the backdoor cut.");
        play.setName("Backdoor cut");
        playBook.add(play);

        play.setDetail("Slashing slasher");
        play.setName("Fake and Slash");
        playBook.add(play);
    }
}
