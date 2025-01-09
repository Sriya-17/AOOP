package com.musicstreaming;

public class OnlineMusicSource implements MusicSource {
    @Override
    public void play() {
        System.out.println("Streaming music online...");
    }
}

