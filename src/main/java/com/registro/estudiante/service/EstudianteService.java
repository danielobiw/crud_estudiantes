package com.registro.estudiante.service;

import java.util.List;
import java.util.Optional;

import com.registro.estudiante.model.Estudiante;

public interface EstudianteService {

	public Estudiante save(Estudiante estudiante);

	public Optional<Estudiante> get(Integer codigo);

	public void update(Estudiante estudiante);

	public void delete(Integer codigo);

	public List<Estudiante> findAll();

}
