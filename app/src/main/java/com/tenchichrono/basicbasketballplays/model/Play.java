package com.tenchichrono.basicbasketballplays.model;

/**
 * Created by dchi on 10/22/2015.
 */
public class Play {
    private String mName;
    private String mDetail;

    public Play()
    {

    }

    public Play(String name, String detail)
    {
        mName = name;
        mDetail = detail;
    }

    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        mName = name;
    }

    public String getDetail()
    {
        return mDetail;
    }

    public void setDetail(String detail)
    {
        mDetail = detail;
    }

    public Play[] createPlays()
    {
        Play[] play = new Play[10];
        play[0].setDetail("This play does this.");
        play[0].setName("Pick and Roll");
        play[1].setDetail("This play does that.");
        play[1].setName("Pick and Pop");
        play[2].setDetail("This play does nothing.");
        play[2].setName("The nothing");
        play[3].setDetail("This play is a back door cut while the dribbler lures the defense");
        play[3].setName("Backdoor Cut");

        return play;
    }
}
