package com.example.theatremanagement.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.theatremanagement.entity.Movie;
import com.example.theatremanagement.entity.Screen;
import com.example.theatremanagement.entity.Seat;

public interface ScreenRepository extends JpaRepository<Screen,Integer> {

	

}