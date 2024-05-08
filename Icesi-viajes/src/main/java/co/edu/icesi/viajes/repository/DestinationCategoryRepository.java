package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.DestinationCategory;

public interface DestinationCategoryRepository extends JpaRepository<DestinationCategory, Integer> {
	
	
}
