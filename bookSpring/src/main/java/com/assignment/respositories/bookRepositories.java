package com.assignment.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.models.book;

@Repository
public interface bookRepositories extends CrudRepository <book, Long>{

	List<book> findAll();
	
	List<book> findByDescriptionContaining(String search);
	List<book> findByTitleContaining(String search);
	Long countByTitleContaining(String search);
	Long deleteByTitleStartingWith(String search);
 }
