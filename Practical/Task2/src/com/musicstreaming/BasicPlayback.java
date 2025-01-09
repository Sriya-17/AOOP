package com.musicstreaming;

public class BasicPlayback extends MusicPlayback {
    public BasicPlayback(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void playMusic() {
        System.out.println("Basic Playback:");
        musicSource.play();
    }
}