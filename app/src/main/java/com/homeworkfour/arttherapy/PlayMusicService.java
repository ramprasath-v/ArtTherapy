package com.homeworkfour.arttherapy;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;

import java.io.IOException;


public class PlayMusicService extends IntentService {

    public PlayMusicService() {
        super("PlayMusicService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Uri mp3 = Uri.parse("android.resource://com.homeworkfour.arttherapy/raw/eraser");

        try {
            MediaPlayer mp = new MediaPlayer();
            mp.setDataSource(this, mp3);
            mp.prepare();
            mp.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
