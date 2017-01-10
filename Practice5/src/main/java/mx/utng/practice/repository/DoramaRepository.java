package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Dorama;

@Repository
public interface DoramaRepository extends JpaRepository<Dorama, Long>{

	@Query("select doramas from Dorama doramas")
	public List<Dorama> findAll();
	
}
