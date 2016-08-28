package jukebox;

import java.util.*;
import java.io.*;

public class Jukebox {
	
	//Initially started by creating an ArrayList of type String
	//ArrayList<String> songList = new ArrayList<String>();
	
	//Using Song object to create a list of Songs instead of just String literals
	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		new Jukebox().go();
	}
	
	//Inner class implementing a Custom comparator
	class ArtistCompare implements Comparator<Song>{
		
		//Overriding compare method to compare two songs by an artist
		public int compare(Song song1, Song song2) {
			return song1.getArtist().compareTo(song2.getArtist());
		}
	}
	
	public void go() {
		getSongs();
		System.out.println(songList);
		
		//Using Collections.sort() method to sort all the Songs alphabetically
		Collections.sort(songList);
		System.out.println(songList);
		
		ArtistCompare artistCompare = new ArtistCompare();
		
		//Using Collections.sort() method to sort all the Songs based on an Artist 
		Collections.sort(songList, artistCompare);
		System.out.println(songList);
	}
	
	void getSongs(){
		try{
			//File file = new File("src/SongList.txt");
			
			File file = new File("src/SongListMore.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = reader.readLine()) != null){
				addSong(line);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	void addSong(String lineToParse){
		String[] tokens = lineToParse.split("/");
		
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);
	}
}
