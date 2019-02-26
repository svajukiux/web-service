package com.example.restfulService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.restfulService.model.Song;
import com.example.restfulService.service.SongService;

@RestController
public class SongController {

	@Autowired
	private SongService songService;
	
	@GetMapping("/song/")
	public List<Song>getAllSongs(){
		return songService.getAllSongs();
	}
	
	@GetMapping("/song/{songId}")
	public Song getSongById(@PathVariable int songId) {
		return songService.getSongById(songId);
	}

	@PostMapping("/song/")
	public ResponseEntity<Void> addSong(@RequestBody Song newSong, UriComponentsBuilder builder){
		Song song = songService.addSong(newSong);
		
		if(song==null) {
			return ResponseEntity.noContent().build();
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/song/{id}").buildAndExpand(song.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		
	}
		
		@PutMapping("/song/")
		public ResponseEntity<Song> updateSong(@RequestBody Song song){
			Song tempSong = songService.getSongById(song.getId());
			if(tempSong == null) {
				return new ResponseEntity<Song>(HttpStatus.NOT_FOUND);
				
			}
			tempSong.setDescription(song.getDescription());
			
			songService.updateSong(tempSong);
			return new ResponseEntity<Song>(tempSong,HttpStatus.OK);
			
			}

		@DeleteMapping("/song/{songId}")
		public ResponseEntity<Song> deteleSong(@PathVariable int songId){
			Song tempSong = songService.getSongById(songId);
			if(tempSong == null) {
				return new ResponseEntity<Song>(HttpStatus.NOT_FOUND);
				}
			songService.deleteSong(songId);
			return new ResponseEntity<Song>(HttpStatus.NO_CONTENT);
			}
		}
