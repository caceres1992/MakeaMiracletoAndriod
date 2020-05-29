package com.miracles.controllers;


import com.miracles.models.entity.Asistencia;
import com.miracles.service.IAsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class AsistenciaControllers {

    @Autowired
    private IAsistenciaService asistenciaService;

    @GetMapping("/asistencias")
    public List<Asistencia> index() {

        return asistenciaService.findAll();

    }


    @PostMapping("/asistencias")
    public ResponseEntity<?> create(@RequestBody Asistencia asistencia) {

        Asistencia newAsistencia = null;

        Map<String, Object> response = new HashMap<>();

        try {


            newAsistencia = asistenciaService.save(asistencia);
        } catch (DataAccessException e) {
            response.put("mensaje", "error al realiar la el insert en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "Exito al Realizar la asistencia ");
        response.put("Asistencia", newAsistencia);

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);

    }


   @PutMapping("/asistencias/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Asistencia Salida(@PathVariable Long id) {
        Asistencia HoraSalida = asistenciaService.findById(id);
                if (HoraSalida.getSalida()==null){
                    HoraSalida.setSalida(LocalTime.now());
                }
        return asistenciaService.save(HoraSalida);
    }


}
