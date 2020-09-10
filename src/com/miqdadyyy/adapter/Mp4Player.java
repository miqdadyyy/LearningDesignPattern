package com.miqdadyyy.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    public static final String FORMAT = "mp4";

    @Override
    public void playMp4(String fileName) {
        System.out.printf("Play %s with Mp4Player class\n", fileName);
    }

    @Override
    public void playVlc(String fileName) {
        // Do Nothing
    }
}
