package Classwork.SongShuffler;

public class Song implements Comparable<Song>
{
  private String name;
  private int track;

  public Song(String n, int t) { name = n; track = t; };

  public int getTrack() { return track; }

  public int compareTo(Song other) { return track - other.getTrack(); }
  
  public String toString() {return track + "\t" + name;}
}
