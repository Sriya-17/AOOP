package com.musicstreaming;

public class VolumeControlDecorator extends PlaybackDecorator {
    public VolumeControlDecorator(MusicPlayback decoratedPlayback) {
        super(decoratedPlayback);
    }

    @Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Adjusting volume level...");
    }
}

