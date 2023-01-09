package com.example.labour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.labour.model.Labourer;

@Repository
public interface LaborRepo extends JpaRepository<Labourer, Integer> {

	List<Labourer> findByLocation(String location);

}
