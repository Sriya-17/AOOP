package com.musicstreaming;

public class RadioStationSource implements MusicSource {
    @Override
    public void play() {
        System.out.println("Playing music from radio station...");
    }
}
