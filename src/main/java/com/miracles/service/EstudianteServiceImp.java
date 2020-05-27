package com.miracles.service;

import com.miracles.models.Dao.IDaoEstudiante;
import com.miracles.models.entity.Distrito;
import com.miracles.models.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteServiceImp implements IEstudianteService{

    @Autowired
    private IDaoEstudiante iDaoEstudiante;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> findAll() {
        return (List<Estudiante>) iDaoEstudiante.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiante findById(long id) {
        return iDaoEstudiante.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Estudiante save(Estudiante estudiante) {
        return iDaoEstudiante.save(estudiante);
    }

    @Override
    @Transactional
    public void delete(long id) {
        iDaoEstudiante.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Distrito> findAllDistrito() {
        return iDaoEstudiante.findAllDistrito();
    }
}
