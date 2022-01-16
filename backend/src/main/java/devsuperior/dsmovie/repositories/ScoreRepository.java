package devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devsuperior.dsmovie.entities.Score;
import devsuperior.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
