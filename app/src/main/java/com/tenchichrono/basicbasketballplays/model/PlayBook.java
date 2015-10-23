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
        playBook.add(0, play);

        play = new Play();
        play.setDetail("ABASFA");
        play.setName("Pick wefasdf");
        playBook.add(1, play);

        play = new Play();
        play.setDetail("This is asdfawjelfjas");
        play.setName("Pick and Ro436246af");
        playBook.add(2, play);

        play = new Play();
        play.setDetail("This o;aijfa;iejsfa sdf.");
        play.setName("Pick w83jlksjdlfj");
        playBook.add(3, play);
    }

    public List<Play> getPlayBook() {
        return playBook;
    }
}
