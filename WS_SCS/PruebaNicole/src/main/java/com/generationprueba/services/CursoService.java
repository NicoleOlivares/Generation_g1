package com.generationprueba.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationprueba.models.Curso;
import com.generationprueba.repositories.CursoRepository;

@Service
public class CursoService {
	@Autowired
	CursoRepository cursoRepository;

	// Logica de negocio

	// guardar un curso
	public void guardarCurso(@Valid Curso curso) {
		cursoRepository.save(curso);

	}

	// obtener una lista de alumnos
	public List<Curso> findAll() {

		return cursoRepository.findAll();
	}

	public Curso buscarId(Long id) {
		return cursoRepository.findById(id).get();
	}

}
