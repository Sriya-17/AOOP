package com.musicstreaming;

public abstract class PlaybackDecorator extends MusicPlayback {
    protected MusicPlayback decoratedPlayback;

    public PlaybackDecorator(MusicPlayback decoratedPlayback) {
        super(decoratedPlayback.musicSource);
        this.decoratedPlayback = decoratedPlayback;
    }

    @Override
    public void playMusic() {
        decoratedPlayback.playMusic();
    }
}

