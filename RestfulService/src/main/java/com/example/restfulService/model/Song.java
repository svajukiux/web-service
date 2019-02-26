package com.example.restfulService.model;

public class Song {
	private int id;
	private String name;
	private String artist;
	private String album;
	private String description;
	private String songLenght;
	
	public Song() {
		super();
	}

	public Song(int id, String name, String artist, String album, String description, String songLenght) {
		super();
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.description = description;
		this.songLenght = songLenght;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSongLenght() {
		return songLenght;
	}

	public void setSongLenght(String songLenght) {
		this.songLenght = songLenght;
	}
	
	
	
	
}
