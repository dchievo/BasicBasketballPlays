package com.tenchichrono.basicbasketballplays.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.tenchichrono.basicbasketballplays.R;
import com.tenchichrono.basicbasketballplays.model.Play;

/**
 * Created by dchi on 10/23/2015.
 */
public class PlaysAdapter extends BaseAdapter
{
    private Context mContext;
    private Play[] mPlay;

    public PlaysAdapter(Context context, Play[] play) {
        mContext = context;
        mPlay = play;
    }

    @Override
    public int getCount()
    {
        return 0;
    }

    @Override
    public Object getItem(int position)
    {
        return mPlay[position];
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.content_plays_list, null);
            holder = new ViewHolder() {
            }
        }
    }
}
