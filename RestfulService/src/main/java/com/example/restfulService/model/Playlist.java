package com.example.restfulService.model;

public class Playlist {
	private int id;
	private String name;
	private String description;
	private int numberOfSongs;
	private Song songs[];
	
	public Playlist() {
		super();
	}
	
	public Playlist(int id, String name, String description, int numberOfSongs, Song[] songs) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.numberOfSongs = numberOfSongs;
		this.songs = songs;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}
	public Song[] getSongs() {
		return songs;
	}
	public void setSongs(Song[] songs) {
		this.songs = songs;
	}
	
	
	

}
