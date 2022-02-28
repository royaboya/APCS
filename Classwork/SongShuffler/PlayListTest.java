package Classwork.SongShuffler;

public class PlayListTest
{
  public static void main(String[] args)
  {
    System.out.println("Constructing PlayListManager...");
    Song[] songs = {new Song("Aria",3),
      new Song("Overture",1),
      new Song("Be Our Guest",6),
      new Song("Something There",8),
      new Song("Gaston",5),
      new Song("Day in the Sun",7),
      new Song("Prologue",2)};
    
    PlayListManager plm = new PlayListManager(songs);
    
    System.out.println();
    System.out.println("Add a Song");
    plm.add(new Song("Belle",4));
    
    System.out.println();
    System.out.println("Printing all songs, you should have 8 songs in total...");
    printArray(plm.getPlayList());
    
    System.out.println();
    System.out.println("Sorting...");
    plm.sort();
    printArray(plm.getPlayList());
    
    System.out.println();
    System.out.println("Shuffling...");
    plm.shuffle();
    printArray(plm.getPlayList());
  }
  
  public static void printArray(Song[] arr)
  {
    for(Song s: arr)
    {
      System.out.println(s);
    }
  }
}

