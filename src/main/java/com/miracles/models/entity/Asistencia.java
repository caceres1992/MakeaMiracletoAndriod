package com.miracles.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "ASISTENCIA")
@Data
public class Asistencia implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private LocalTime entrada;
   @Column
    private LocalTime Salida;


    @Column(name = "total_horas")
    private LocalTime totaldehoras;
    private String comentario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_actividad")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Actividad actividad;

    private boolean estado;

    @PrePersist

        public void Prepresist(){
        estado = true;
        entrada = LocalTime.now();
       ;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estudiante")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Estudiante estudiante;



    private static final long serialVersionUID = 1L;
}
