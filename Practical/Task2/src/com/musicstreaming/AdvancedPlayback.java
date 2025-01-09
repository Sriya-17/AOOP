package com.musicstreaming;

public class AdvancedPlayback extends MusicPlayback {
    public AdvancedPlayback(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void playMusic() {
        System.out.println("Advanced Playback with buffering and metadata:");
        musicSource.play();
    }
}