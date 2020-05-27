package com.miracles.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "ESTUDIANTES")
@Data
public class Estudiante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    @Column(name = "fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    private String sexo;
    private String direccion;
    private String telefono;
    private String correo;
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_distrito")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Distrito distrito;



    private static final long serialVersionUID = 1L;
}

