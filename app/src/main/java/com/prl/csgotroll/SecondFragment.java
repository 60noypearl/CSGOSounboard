package com.prl.csgotroll;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Random;

/**
 * Created by Pearl on 3/4/2016.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    public static final String ARG_SECTION_NUMBER = "section_number";
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9, ib10, ib11, ib12;
    MediaPlayer mp = null;
    boolean isLoop = false;
    int clicksCounter = 4;
    int currentRandom = -1;
    InterstitialAd mInterstitialAd;
    ImageButton[] buttons = new ImageButton[11];


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_adult, container, false);
        MobileAds.initialize(getActivity().getApplicationContext(), "ca-app-pub-2426860412658306~6071334677");

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId(getString(R.string.inter_ad_unit_id));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });

        requestNewInterstitial();
        ib1 = (ImageButton) rootView.findViewById(R.id.ib1);
        ib2 = (ImageButton) rootView.findViewById(R.id.ib2);
        ib3 = (ImageButton) rootView.findViewById(R.id.ib3);
        ib4 = (ImageButton) rootView.findViewById(R.id.ib4);
        ib5 = (ImageButton) rootView.findViewById(R.id.ib5);
        ib6 = (ImageButton) rootView.findViewById(R.id.ib6);
        ib7 = (ImageButton) rootView.findViewById(R.id.ib7);
        ib8 = (ImageButton) rootView.findViewById(R.id.ib8);
        ib9 = (ImageButton) rootView.findViewById(R.id.ib9);
        ib10 = (ImageButton) rootView.findViewById(R.id.ib10);
        ib11 = (ImageButton) rootView.findViewById(R.id.ib11);
        ib12 = (ImageButton) rootView.findViewById(R.id.ib12);

        //Setting onClickListener because of a one-time exception 7:11 5/3/2016
        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);
        ib4.setOnClickListener(this);
        ib5.setOnClickListener(this);
        ib6.setOnClickListener(this);
        ib7.setOnClickListener(this);
        ib8.setOnClickListener(this);
        ib9.setOnClickListener(this);
        ib10.setOnClickListener(this);
        ib11.setOnClickListener(this);
        ib12.setOnClickListener(this);


        buttons[0] = (ImageButton)  rootView.findViewById(R.id.ib1);
        buttons[1] = (ImageButton)  rootView.findViewById(R.id.ib2);
        buttons[2] = (ImageButton)  rootView.findViewById(R.id.ib3);
        buttons[3] = (ImageButton)  rootView.findViewById(R.id.ib4);
        buttons[4] = (ImageButton)  rootView.findViewById(R.id.ib5);
        buttons[5] = (ImageButton)  rootView.findViewById(R.id.ib6);
        buttons[6] = (ImageButton)  rootView.findViewById(R.id.ib7);
        buttons[7] = (ImageButton)  rootView.findViewById(R.id.ib8);
        buttons[8] = (ImageButton)  rootView.findViewById(R.id.ib9);
        buttons[9] = (ImageButton) rootView.findViewById(R.id.ib10);
        buttons[10] = (ImageButton) rootView.findViewById(R.id.ib11);



        return rootView;
    }

    public void showInter(){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    public void checkAndShowAd(){
        clicksCounter --;
        if (clicksCounter == 0 ){
            showInter();
            clicksCounter = 4;
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib1:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.cykablat);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib2:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.he_is_idiot_go_plant);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib3:
                if (mp != null || isLoop == true)
                    mp.stop();

                mp = MediaPlayer.create(getActivity(), R.raw.funnyrussian);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib4:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.russian_sware);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib5:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.proskablat);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib6:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.noobs_blat);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib7:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.oh_my_got_noob);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib8:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.why_check_notmiddleafterhimgoingmiddleatmirage);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib9:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.go_b_screaming);
                mp.start();
                isLoop = true;
                checkAndShowAd();
                break;

            case R.id.ib10:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.idiot_yellow_russian);
                mp.start();
                isLoop = true;
                checkAndShowAd();

                break;

            case R.id.ib11:
                if (mp != null || isLoop == true)
                    mp.stop();
                mp = MediaPlayer.create(getActivity(), R.raw.insanerussian);
                mp.start();
                isLoop = true;
                checkAndShowAd();
                break;


            case R.id.ib12:
                if (mp != null || isLoop == true){
                    mp.stop();
                }
                Random random = new Random();
                int randomNum = random.nextInt(10 - 1 + 1) + 1;
                currentRandom = randomNum;
                if (currentRandom != -1 && currentRandom == randomNum){
                    randomNum = random.nextInt(10 - 0 + 1) +0;
                }
                buttons[randomNum].performClick();
                checkAndShowAd();
                break;

        }
    }

private void requestNewInterstitial() {
    AdRequest adRequest = new AdRequest.Builder()
            .addTestDevice("5fc01f3906d75ad6")
            .build();

    mInterstitialAd.loadAd(adRequest);
}

}