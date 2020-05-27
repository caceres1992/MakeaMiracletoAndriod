package com.miracles.service;

import com.miracles.models.entity.Actividad;

import java.util.List;

public interface IActividadService {

    public List<Actividad>findAll();
    public Actividad finById(Long id);
    public Actividad save (Actividad actividad);
    public void delete(Long id);

}
