package com.tenchichrono.basicbasketballplays.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dchi on 10/23/2015.
 */
public class PlayBook
{
    private List<Play> playBook = new ArrayList<>();
    private Play mPlay;

    public PlayBook ()
    {
        createPlayBook();
    }

    private void createPlayBook()
    {

        mPlay = new Play();
        mPlay.setDetail("This is a play about the pick and roll.");
        mPlay.setName("Pick and Roll");
        playBook.add(mPlay);

        mPlay = new Play();
        mPlay.setDetail("This is the play about pick and pop.");
        mPlay.setName("Pick and Pop");
        playBook.add(mPlay);

        mPlay = new Play();
        mPlay.setName("Pretend and slash.");
        mPlay.setDetail("Fake doing something and then cut.");
        playBook.add(mPlay);

        mPlay = new Play();
        mPlay.setName("Pretend and slash. 1");
        mPlay.setDetail("Fake doing something and then cut.");
        playBook.add(mPlay);

        mPlay = new Play();
        mPlay.setName("Pretend and slash 2.");
        mPlay.setDetail("Fake doing something and then cut.");
        playBook.add(mPlay);

        mPlay = new Play();
        mPlay.setName("Pretend and slash 3.");
        mPlay.setDetail("Fake doing something and then cut.");
        playBook.add(mPlay);

    }


    public List<Play> getPlayBook() {
        return playBook;
    }
}
