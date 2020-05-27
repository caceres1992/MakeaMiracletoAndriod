package com.miracles.controllers;

import com.miracles.models.entity.Actividad;
import com.miracles.models.entity.Asistencia;
import com.miracles.service.ActividadServiceImp;
import com.miracles.service.IActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class ActividadControllers {

    @Autowired
    private IActividadService actividadService;

    @GetMapping("/actividad")
    public List<Actividad>index(){
        return actividadService.findAll();
    }

    @PostMapping("/actividad")
    public ResponseEntity<?> save(@RequestBody Actividad actividad){

        Actividad nuevaActividad = null;

        Map<String, Object> response = new HashMap<>();

        try {
        nuevaActividad = actividadService.save(actividad);
        }catch (DataAccessException e){
            response.put("mensaje", "error al realiar la el insert en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "la Actividad fue Creada con Exito");
        response.put("actividad",nuevaActividad);
        return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);

    }

}
