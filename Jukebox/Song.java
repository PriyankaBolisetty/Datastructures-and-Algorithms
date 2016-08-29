package jukebox;

public class Song implements Comparable<Song>{
	private String title;
	private String artist;
	private String rating;
	private String bpm;
	
	public Song(String title, String artist, String rating, String bpm) {
		super();
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.bpm = bpm;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getBpm() {
		return bpm;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
	public int compareTo(Song otherSong) {
		return title.compareTo(otherSong.getTitle());
	}
	
	//Overriding hashCode to check for the duplicate reference equality
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	//Overriding equals to check for the duplicate object equality
	@Override
	public boolean equals(Object otherObj) {
		Song otherSong = (Song)otherObj;
		if(!(otherSong instanceof Song)){
			return false;
		}
		return getTitle().equals(otherSong.getTitle());
	}
}
