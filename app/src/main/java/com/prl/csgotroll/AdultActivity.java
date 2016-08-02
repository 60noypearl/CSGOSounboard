package com.prl.csgotroll;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class AdultActivity extends Activity implements View.OnClickListener {


    ImageButton ib1, ib2, ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12;
    MediaPlayer mp = null;
    boolean isLoop = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult);


        ib1 = (ImageButton) findViewById(R.id.ib1);
        ib2 = (ImageButton) findViewById(R.id.ib2);
        ib3 = (ImageButton) findViewById(R.id.ib3);
        ib4 = (ImageButton) findViewById(R.id.ib4);

        ib5 = (ImageButton) findViewById(R.id.ib5);

        ib6 = (ImageButton) findViewById(R.id.ib6);

        ib7 = (ImageButton) findViewById(R.id.ib7);

        ib8 = (ImageButton) findViewById(R.id.ib8);

        ib9 = (ImageButton) findViewById(R.id.ib9);

        ib10 = (ImageButton) findViewById(R.id.ib10);
        ib11 = (ImageButton) findViewById(R.id.ib11);
        ib12 = (ImageButton) findViewById(R.id.ib12);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_adult, menu);
        return true;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib1:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.cykablat);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib2:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp= MediaPlayer.create(this,R.raw.he_is_idiot_go_plant);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib3:
                if(mp!= null || isLoop == true)
                    mp.stop();

                mp = MediaPlayer.create(this,R.raw.somthing_blat);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib4:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.russian_sware);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib5:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.proskablat);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib6:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.noobs_blat);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib7:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.oh_my_got_noob);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib8:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.why_check_notmiddleafterhimgoingmiddleatmirage);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib9:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.go_b_screaming);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib10:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.oh_my_got_noob);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib11:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.riklema);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib12:
                if(mp!= null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this,R.raw.mute_and_report);
                mp.start();
                isLoop = true;

                break;

        }

    }
}
