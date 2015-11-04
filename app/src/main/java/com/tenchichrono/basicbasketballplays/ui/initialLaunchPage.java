package com.tenchichrono.basicbasketballplays.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.tenchichrono.basicbasketballplays.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class initialLaunchPage extends Activity {

    @InjectView(R.id.chronoImageView) ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_launch_page);
/*        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.photo);
        mImageView.setImageBitmap(bitmap);*/
        ButterKnife.inject(this);

    }

    @OnClick (R.id.startButton)
    public void startPlaysList(View view)
    {
        Intent intent = new Intent(this, MainPlaysMenu.class);
        startActivity(intent);
    }

}
