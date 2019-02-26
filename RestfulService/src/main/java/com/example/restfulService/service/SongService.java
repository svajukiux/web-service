package com.example.restfulService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.restfulService.model.Song;


@Component
public class SongService {
	
	private static List<Song> songs = new ArrayList<Song>();
	
	static {
		Song song1= new Song(1,"Jumpsuit","Twenty one Pilots", "Trench","Jumpsuit jumpsuit cover me","3:59");
		Song song2= new Song(2,"Bandito","Twenty one Pilots", "Trench","I'm a Bandito","5:31");
		Song song3= new Song(3,"Pet Cheetah","Twenty one Pilots", "Trench","I move slow","3:18");
		
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
	}
	
	public List<Song> getAllSongs(){
		return songs;
	}
	
	public Song getSongById(int id) {
		for(Song song : songs) {
			if(song.getId()== id) {
				return song;
			}
		}
		return null;
	}
	
	public Song addSong(Song song) {
		songs.add(song);
		return song;
	}
	
	public void updateSong(Song song) {
		for(Song oldSong: songs) {
			if(oldSong.getId()==song.getId()) {
				oldSong.setDescription(song.getDescription());	
			}
		}
		
	}
	
	public void deleteSong(int id) {
		for(Song song : songs) {
			if(song.getId()==id) {
				songs.remove(song);
				break;
			}
		}
	}
	
	
	
	
}
