package com.musicstreaming;

public class EqualizerDecorator extends PlaybackDecorator {
    public EqualizerDecorator(MusicPlayback decoratedPlayback) {
        super(decoratedPlayback);
    }

    @Override
    public void playMusic() {
        super.playMusic();
        System.out.println("Applying equalizer settings...");
    }
}

