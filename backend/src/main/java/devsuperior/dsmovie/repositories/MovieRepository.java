package devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
