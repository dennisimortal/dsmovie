package com.devuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
