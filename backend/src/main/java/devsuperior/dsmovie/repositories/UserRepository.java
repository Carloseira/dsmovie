package devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
