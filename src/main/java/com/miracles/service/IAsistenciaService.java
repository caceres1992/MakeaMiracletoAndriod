package com.miracles.service;

import com.miracles.models.entity.Actividad;
import com.miracles.models.entity.Asistencia;
import com.miracles.models.entity.Estudiante;

import java.util.List;

public interface IAsistenciaService {

    public List<Asistencia>findAll();
    public Asistencia findById(long id);
    public Asistencia save(Asistencia asistencia);
    public void delete(long id);
    public List<Estudiante> findAllEstudiante();
    public List<Actividad> findAllActivdad();
}
