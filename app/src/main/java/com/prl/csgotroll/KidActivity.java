package com.prl.csgotroll;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class KidActivity extends Activity implements View.OnClickListener {

    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9, ib10, ib11, ib12;
    MediaPlayer mp = null;
    boolean isLoop = false;
    ImageButton[] imageButtons = new ImageButton[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid);

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
        switch (v.getId()) {
            case R.id.ib1:

                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.appmidgokill);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib2:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.behind);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib3:
                if (mp != null || isLoop == true)
                    mp.stop();

                mp = MediaPlayer.create(this, R.raw.info_men_info_pls_is_b);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib4:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.kapronski_something);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib5:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.konektr_last_nice_team);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib6:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.suddenkill);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib7:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.one_ct_one_lonk_i_sink);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib8:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.pashol_naxuy_);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib9:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.russian_mega_combo);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib10:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.shutupkmen);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib11:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(this, R.raw.smoke_mid);
                mp.start();
                isLoop = true;

                break;

            case R.id.ib12:
//                String ibNum = "ib";
//                Random random = new Random();
//                int randomNum = random.nextInt(11 - 1 + 1) + 1;
//
//                String myIb = (String) (ibNum + randomNum);
//                Toast.makeText(KidActivity.this,"my ib string: " +myIb, Toast.LENGTH_SHORT).show();
//
//                int intMyIb = Integer.parseInt(myIb);
//                Toast.makeText(KidActivity.this,"my ib: " +intMyIb, Toast.LENGTH_SHORT).show();
//                ImageButton randomImgButton = (ImageButton) findViewById(intMyIb) ;
//                randomImgButton.performClick();

//                if (mp != null || isLoop == true)
//                    mp.stop();
//                mp = MediaPlayer.create(this, R.raw.);
//                mp.start();
//                isLoop = true;
                break;

        }

    }
}
