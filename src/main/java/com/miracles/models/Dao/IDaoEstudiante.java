package com.miracles.models.Dao;

import com.miracles.models.entity.Distrito;
import com.miracles.models.entity.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IDaoEstudiante extends CrudRepository<Estudiante,Long>{

    @Query("from Distrito")
    public List<Distrito>findAllDistrito();
}
