package com.example.onlinemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.JcPlayerManagerListener;
import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Object JcPlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();//For Hiding The Action bar ..,
       String url1="https://firebasestorage.googleapis.com/v0/b/online-music-player-4056f.appspot.com/o/%5BiSongs.info%5D%2004%20-%20Mehabooba.mp3?alt=media&token=87b2b8bc-72fa-426d-954b-baf719db43b4";
        String url2="https://firebasestorage.googleapis.com/v0/b/online-music-player-4056f.appspot.com/o/%5BiSongs.info%5D%2004%20-%20Dosti.mp3?alt=media&token=d731f643-fa95-4488-b662-6c66ae2848d5";
        String url3="https://firebasestorage.googleapis.com/v0/b/online-music-player-4056f.appspot.com/o/%5BiSongs.info%5D%2001%20-%20Halamithi%20Habibo%20(Telugu).mp3?alt=media&token=9c32fb0b-5265-4356-883c-6ce49bfe813b";
        String url4="https://firebasestorage.googleapis.com/v0/b/online-music-player-4056f.appspot.com/o/%5BiSongs.info%5D%2001%20-%20Toofan.mp3?alt=media&token=85fff628-87fa-4b37-8def-b0c9b4699b1f";
        String url5="https://firebasestorage.googleapis.com/v0/b/online-music-player-4056f.appspot.com/o/%5BiSongs.info%5D%2003%20-%20Beast%20Mode.mp3?alt=media&token=7be33a62-bf94-4ad1-91d5-44cf113c4dfa";
        String url6="https://firebasestorage.googleapis.com/v0/b/online-music-player-4056f.appspot.com/o/%5BiSongs.info%5D%2005%20-%20The%20Monster%20Song.mp3?alt=media&token=6e2bc605-f7b5-47a0-a6e5-1c69c9ffd01d";

        JcPlayerView jcPlayerView1= findViewById(R.id.jcplayer1);

        ArrayList<JcAudio> jcAudios = new ArrayList<>();

        jcAudios.add(JcAudio.createFromURL("Mehabooba",url1));
        jcAudios.add(JcAudio.createFromURL("Dosti",url2));
        jcAudios.add(JcAudio.createFromURL("Halamith-Habibo",url3));
        jcAudios.add(JcAudio.createFromURL("Toofan",url4));
        jcAudios.add(JcAudio.createFromURL("Beast",url5));
        jcAudios.add(JcAudio.createFromURL("Monster",url6));

        jcPlayerView1.initPlaylist(jcAudios, null);

        jcPlayerView1.createNotification(R.drawable.notimg);
        JcPlayerView jcPlayerView2= findViewById(R.id.jcplayer2);

        ArrayList<JcAudio> jcAudios2 = new ArrayList<>();

        jcAudios2.add(JcAudio.createFromURL("Mehabooba",url1));
        jcAudios2.add(JcAudio.createFromURL("Dosti",url2));
        jcAudios2.add(JcAudio.createFromURL("Halamith-Habibo",url3));
        jcAudios2.add(JcAudio.createFromURL("Toofan",url4));
        jcAudios2.add(JcAudio.createFromURL("Beast",url5));
        jcAudios2.add(JcAudio.createFromURL("Monster",url6));

        jcPlayerView2.initPlaylist(jcAudios, null);

        jcPlayerView2.createNotification(R.drawable.notimg);
    }
}