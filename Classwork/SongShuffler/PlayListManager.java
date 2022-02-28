package Classwork.SongShuffler;

import java.util.ArrayList;

public class PlayListManager {
    private ArrayList<Song> playlist = new ArrayList<>();

    public PlayListManager(Song[] songs) {
        for (Song s : songs) {
            playlist.add(s);
        }
    }

    public void add(Song s){
        playlist.add(s);
    }

    public Song[] getPlayList() {
        Song[] songArr = new Song[playlist.size()];
        for (int i = 0; i < playlist.size(); i++) {
            songArr[i] = playlist.get(i);
        }
        return songArr;

    }

    public void sort() {
        int low;

        for (int i = 0; i < playlist.size(); i++) {
            low = i;
            for (int j = i + 1; j < playlist.size(); j++) {
                if (playlist.get(j).compareTo(playlist.get(low)) < 0) {
                    low = j;
                }
            }
            Song temp = playlist.get(i);
            playlist.set(i, playlist.get(low));
            playlist.set(low, temp);
        }
    }

    public void shuffle() {
        for(int i = 0; i < playlist.size(); i++){
            int rand = (int) (Math.random() * playlist.size());

            Song temp = playlist.get(i);
            playlist.set(i, playlist.get(rand));
            playlist.set(rand, temp);
        }
    }

}
