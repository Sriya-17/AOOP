package com.musicstreaming;

public class MusicStreamingApp {
    public static void main(String[] args) {
        // Local Music Playback
        MusicSource localMusic = new LocalMusicSource();
        MusicPlayback localPlayback = new BasicPlayback(localMusic);
        
        // Adding features using decorators
        MusicPlayback enhancedLocalPlayback = new EqualizerDecorator(new VolumeControlDecorator(localPlayback));
        enhancedLocalPlayback.playMusic();

        System.out.println();

        // Online Music Playback
        MusicSource onlineMusic = new OnlineMusicSource();
        MusicPlayback onlinePlayback = new AdvancedPlayback(onlineMusic);
        
        // Adding features using decorators
        MusicPlayback enhancedOnlinePlayback = new VolumeControlDecorator(onlinePlayback);
        enhancedOnlinePlayback.playMusic();

        System.out.println();

        // Radio Station Playback
        MusicSource radioStation = new RadioStationSource();
        MusicPlayback radioPlayback = new BasicPlayback(radioStation);
        
        // Adding features using decorators
        MusicPlayback enhancedRadioPlayback = new EqualizerDecorator(radioPlayback);
        enhancedRadioPlayback.playMusic();
    }
}

