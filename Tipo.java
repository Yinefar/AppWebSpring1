package com.AppWebSpring1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo")
public class Tipo {
	@Id
	private int  cod_tipo_atencion;
	private String nom_tipo_atencion;
	private double precio;
	
}
