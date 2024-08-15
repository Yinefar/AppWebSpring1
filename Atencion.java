package com.AppWebSpring1.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "atencion")
public class Atencion {
	@Id
	private int num_atencion;
	private LocalDate fecha;
	private String nom_paciente;
	private int cod_tipo_atencion;
	
	
	@ManyToOne
	@JoinColumn (name = "cod_tipo_atencion", referencedColumnName = "cod_tipo_atencion", insertable = false, updatable = false)
	private Tipo tipoAtencion;
}
