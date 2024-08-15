package com.AppWebSpring1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.AppWebSpring1.model.Atencion;
import com.AppWebSpring1.service.AtencionService;

@Controller
public class AtencionController {
	@Autowired
	private AtencionService servicio;

	@GetMapping({"/","/cargar"})
	 public String cargarPagCrud(Model model) {
		 model.addAttribute("atencion", new Atencion());
		 model.addAttribute("lstTipos", servicio.listaTipos());
		 model.addAttribute("lstAtenciones", servicio.listaAtenciones());
		 return "atencionesVista";
	 }
	//Para guardar la información del registro. Es la tabla. Se actualiza con lo de la derecha que es indicado o llenado por la vista
	
	 @PostMapping("/grabar")
	 public  String grabarPagCrud(@ModelAttribute Atencion atencion,  Model model) {
		 try {
			 servicio.grabarAtencion(atencion);
			 model.addAttribute("mensaje", "Registro guardado con éxito."); 
			 model.addAttribute("cssmensaje", "alert alert-success");
		 } catch (Exception e) {
			 model.addAttribute("mensaje", "¡Error al guardar el registro! "+ ""+ e.getMessage()); 
			 model.addAttribute("cssmensaje", "alert alert-danger"); 
		 }
		 model.addAttribute("lstTipos", servicio.listaTipos());
		 model.addAttribute("lstAtenciones", servicio.listaAtenciones());
		 return "atencionesVista";
	 }
	 
	 
}
