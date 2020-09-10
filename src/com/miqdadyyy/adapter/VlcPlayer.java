package com.miqdadyyy.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    public static final String FORMAT = "vlc";

    @Override
    public void playMp4(String fileName) {
        // Do Nothing
    }

    @Override
    public void playVlc(String fileName) {
        System.out.printf("Play %s with VlcPlayer Class\n", fileName);
    }
}
