package com.tenchichrono.basicbasketballplays.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tenchichrono.basicbasketballplays.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class initialLaunchPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_launch_page);
        ButterKnife.inject(this);

    }

    @OnClick (R.id.startButton)
    public void startPlaysList(View view)
    {
        Intent intent = new Intent(this, PlaysList.class);
        startActivity(intent);
    }

}
