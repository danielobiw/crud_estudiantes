package com.registro.estudiante.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.estudiante.model.Estudiante;
import com.registro.estudiante.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public Estudiante save(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}

	@Override
	public Optional<Estudiante> get(Integer codigo) {
		return estudianteRepository.findById(codigo);
	}

	@Override
	public void update(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
	}

	@Override
	public void delete(Integer codigo) {
		estudianteRepository.deleteById(codigo);
	}

	@Override
	public List<Estudiante> findAll() {
		return estudianteRepository.findAll();
	}

}
