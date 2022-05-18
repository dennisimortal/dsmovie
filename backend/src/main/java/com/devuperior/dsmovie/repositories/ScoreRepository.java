package com.devuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devuperior.dsmovie.entities.Score;
import com.devuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
