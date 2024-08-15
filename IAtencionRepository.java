package com.AppWebSpring1.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AppWebSpring1.model.Atencion;

@Repository
public interface IAtencionRepository extends JpaRepository <Atencion, Integer> {
	
	
	}

