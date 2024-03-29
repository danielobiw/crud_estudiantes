package com.registro.estudiante.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registro.estudiante.model.Estudiante;
import com.registro.estudiante.service.EstudianteService;


@Controller
@RequestMapping() // ("/estudiante")
public class EstudianteController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(EstudianteController.class);

	@Autowired
	private EstudianteService estudianteService;

	// MOSTRAR ESTUDIANTES
	@GetMapping("/estudiantes/consultar")
	public String show(Model model) {
		model.addAttribute("estudiantes", estudianteService.findAll());
		return "consultar";
	}

	// REGISTRAR ESTUDIANTE
	@GetMapping("/estudiantes/registrar")
	public String create() {
		return "registrar";
	}

	// GUARDAR REGISTROS
	@PostMapping("/estudiantes/guardar")
	public String guardar(Estudiante estudiante) {
		LOGGER.info("Este el el estudiante guardado: {}", estudiante);
		estudianteService.save(estudiante);
		return "redirect:consultar";
	}

	// EDITAR ESTUDIANTES
	@GetMapping("/estudiantes/actualizar/{codigo}")
	public String editar(@PathVariable Integer codigo, Model model) {
		Estudiante estudiante = new Estudiante();
		Optional<Estudiante> optionalEstudiante = estudianteService.get(codigo);
		estudiante = optionalEstudiante.get();

		LOGGER.info("El estudiante buscado es: {}", estudiante);
		model.addAttribute("estudiante", estudiante);

		return "actualizar";
	}

	// ACTUALIZAR INFO
	@PostMapping("/estudiantes/update")
	public String actualizar(Estudiante estudiante) {
		estudianteService.update(estudiante);

		return "redirect:consultar";
	}

	// ELIMINAR ESTUDIANTE
	@GetMapping("/estudiantes/delete/{codigo}")
	public String delete(@PathVariable Integer codigo) {
		estudianteService.delete(codigo);

		return "redirect:/estudiantes/consultar";
	}

	// HOME
	@GetMapping("")
	public String titularPagina(Model model) {

		return "index";
	}

}
