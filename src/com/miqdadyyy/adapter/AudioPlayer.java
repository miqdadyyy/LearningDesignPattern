package com.miqdadyyy.adapter;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.printf("Playing %s on mp3 Format", fileName);
        } else if(type.equalsIgnoreCase(VlcPlayer.FORMAT) || type.equalsIgnoreCase(Mp4Player.FORMAT)){
            this.mediaAdapter = new MediaAdapter(type);
            this.mediaAdapter.play(type, fileName);
        } else {
            System.out.println("Invalid format");
        }
    }
}
