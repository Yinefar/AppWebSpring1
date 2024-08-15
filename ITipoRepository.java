package com.AppWebSpring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AppWebSpring1.model.Tipo;


@Repository
public interface ITipoRepository extends JpaRepository <Tipo, Integer>  {
	

}
