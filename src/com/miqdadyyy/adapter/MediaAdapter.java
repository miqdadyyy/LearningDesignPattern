package com.miqdadyyy.adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase(VlcPlayer.FORMAT)) {
            this.advancedMediaPlayer = new VlcPlayer();
        } else if (type.equalsIgnoreCase(Mp4Player.FORMAT)) {
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase(VlcPlayer.FORMAT)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (type.equalsIgnoreCase(Mp4Player.FORMAT)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
