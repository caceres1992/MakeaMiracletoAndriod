package com.miracles.controllers;

import com.miracles.models.entity.Estudiante;
import com.miracles.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class EstudianteControllers {

    @Autowired
    private IEstudianteService estudianteService;


    //listamos

    @GetMapping("/estudiantes")
    public List<Estudiante> index() {

        return estudianteService.findAll();

    }

}
