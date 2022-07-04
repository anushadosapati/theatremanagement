package com.example.theatremanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.theatremanagement.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

	//List<Movie> findAllByOrderByRatingAsc(double rating); 

}
