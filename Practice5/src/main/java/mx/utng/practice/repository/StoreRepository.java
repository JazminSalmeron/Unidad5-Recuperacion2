package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Dorama;
import mx.utng.practice.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{

	@Query("select stores from Store stores")
	public List<Store> findAll();
	
}
