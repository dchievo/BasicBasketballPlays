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

    public String toString()
    {
        return getName();
    }
}
