package com.miracles.models.Dao;

import com.miracles.models.entity.Actividad;
import com.miracles.models.entity.Asistencia;
import com.miracles.models.entity.Distrito;
import com.miracles.models.entity.Estudiante;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IDaoAsistencia extends CrudRepository<Asistencia,Long> {

    @Query("from Estudiante")
    public List<Estudiante> findAllEstudiante();
    @Query("from Actividad ")
    public List<Actividad> findAllActivdad();
}
