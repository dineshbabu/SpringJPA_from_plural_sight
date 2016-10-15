package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guitar.db.model.Location;

public interface LocationJpaRepository extends JpaRepository<Location, Long> {

	public List<Location> findByStateLike(String state);
	
	public List<Location> findByStateStartingWithIgnoreCase(String state);
	
	public List<Location> findByStateNotLike(String state);
	
	public List<Location> findByStateOrCountry(String state, String country); 
	
	public List<Location> findByStateAndCountry(String state, String country); 
}
