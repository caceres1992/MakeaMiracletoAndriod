package com.miracles.service;

import com.miracles.models.Dao.IDaoActividad;
import com.miracles.models.entity.Actividad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ActividadServiceImp implements IActividadService{

    @Autowired
    private IDaoActividad daoActividad;


    @Override
    @Transactional(readOnly = true)
    public List<Actividad> findAll() {
        return (List<Actividad>) daoActividad.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Actividad finById(Long id) {
        return daoActividad.findById(id).orElse(null);
    }



    @Override
    @Transactional
    public Actividad save(Actividad actividad) {
        return daoActividad.save(actividad);
    }

    @Override
    @Transactional
    public void delete(Long id) {
            daoActividad.deleteById(id);
    }
}
