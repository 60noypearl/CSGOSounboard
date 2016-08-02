//package com.example.android.csgorussian;
//
//import android.app.Activity;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import java.util.ArrayList;
//
//public class RandomActivity extends Activity implements View.OnClickListener {
//
//    Button bRandomSong;
//    MediaPlayer mp = null;
//    boolean isLoop = false;
//    ArrayList<String> list;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_random);
//        bRandomSong = (Button) findViewById(R.id.bRandomSong);
//        list = new ArrayList<String>();
//
//        list.add("appmidgokill");
//        list.add("behind");
//        list.add("cykablat");
//        list.add("dawaiblat");
//        list.add("go_b_screaming");
//        list.add("he_is_idiot_go_plant");
//        list.add("idiot_yellow_russian");
//        list.add("info_men_info_pls_is_b");
//        list.add("kapronski_something");
//        list.add("konektr_last_nice_team");
//        list.add("mute_and_report");
//        list.add("noobs_blat");
//        list.add("oh_my_got_noob");
//        list.add("one_ct_one_lonk_i_sink");
//        list.add("pashol_naxuy_");
//        list.add("proskablat");
//        list.add("riklema");
//        list.add("russian_mega_combo");
//        list.add("russian_sware");
//        list.add("shutupkmen");
//        list.add("smoke_mid");
//        list.add("somthing_blat");
//        list.add("suddenkill");
//        list.add("why_check_notmiddleafterhimgoingmiddleatmirage");
//        list.add("y_no_info");
//
//    }
//
//    public int randomNumber(){
//        double random =  Math.floor(Math.random() * 6) + 1;
//        Double d = new Double(random);
//        int randomInt = d.intValue();
//        return randomInt;
//    }
//
//    @Override
//    public void onClick(View v) {
//
//        if (mp != null || isLoop == true)
//            mp.stop();
//
//        mp.start();
//        isLoop = true;
//
//    }
//}
