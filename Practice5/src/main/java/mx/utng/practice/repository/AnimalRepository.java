package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Animal;
import mx.utng.practice.model.Dorama;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

	@Query("select animals from Animal animals")
	public List<Animal> findAll();
	
}
