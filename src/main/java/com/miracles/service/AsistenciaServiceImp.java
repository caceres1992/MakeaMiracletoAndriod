package com.miracles.service;

import com.miracles.models.Dao.IDaoAsistencia;
import com.miracles.models.entity.Actividad;
import com.miracles.models.entity.Asistencia;
import com.miracles.models.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AsistenciaServiceImp implements IAsistenciaService {

    @Autowired
    private IDaoAsistencia daoAsistencia;


    @Override
    @Transactional(readOnly = true)
    public List<Asistencia> findAll() {
        return (List<Asistencia>) daoAsistencia.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Asistencia findById(long id) {
        return daoAsistencia.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Asistencia save(Asistencia asistencia) {
        return daoAsistencia.save(asistencia);
    }

    @Override
    @Transactional
    public void delete(long id) {
        daoAsistencia.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> findAllEstudiante() {
        return daoAsistencia.findAllEstudiante();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Actividad> findAllActivdad() {
        return daoAsistencia.findAllActivdad();
    }
}
