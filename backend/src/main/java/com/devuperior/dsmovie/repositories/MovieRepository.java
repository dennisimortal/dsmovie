package com.devuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devuperior.dsmovie.entities.Movie;
import com.devuperior.dsmovie.entities.Score;
import com.devuperior.dsmovie.entities.User;
	
public interface MovieRepository extends JpaRepository<Movie,Long>{

	User findByEmail(String email);

	Score saveAndFlush(Score score);

	User saveAndFlush(User user);

	

}
