package com.devuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devuperior.dsmovie.dto.MovieDTO;
import com.devuperior.dsmovie.dto.ScoreDTO;
import com.devuperior.dsmovie.entities.Movie;
import com.devuperior.dsmovie.entities.Score;
import com.devuperior.dsmovie.entities.User;
import com.devuperior.dsmovie.repositories.MovieRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private MovieRepository userRepository;
	
	@Autowired
	private MovieRepository scoreRepository;
	
	@Transactional
	public  MovieDTO saveScore(ScoreDTO dto) {
		
		User  user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());			
			user = userRepository.saveAndFlush(user);			
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();	
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScpre());
		
		score = scoreRepository.saveAndFlush(score);
		
	double sum = 0.0;
	   for (Score s : movie.getScores()) {
		   sum = sum + s.getValue();
	   }
	   
	   double avg = sum / movie.getScores().size();
	   
	   movie.setScore(avg);
	   movie.setCount(movie.getScores().size());
	   
	   movie = movieRepository.save(movie);
	   
	   return new MovieDTO(movie);
	   
	   
	   
	}
	
	
}
