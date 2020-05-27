package com.miracles.service;

import com.miracles.models.entity.Distrito;
import com.miracles.models.entity.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IEstudianteService {

public List<Estudiante>findAll();
public Estudiante findById(long id);
public Estudiante save(Estudiante estudiante);
public void delete(long id);
public List<Distrito>findAllDistrito();

}
