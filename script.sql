use bdmakemiracle2;
SELECT * FROM DISTRITOS;

INSERT INTO DISTRITOS (id,nombre)values (null,'san JUAN DE LURIGANCHO');

INSERT INTO DISTRITOS (id,nombre)values (null,'SAN ISIDRO');

SELECT * FROM ESTUDIANTES;
insert into ESTUDIANTES(ID,APELLIDO,CORREO,DIRECCION,ESTADO,FECHA_NAC,NOMBRE,SEXO,TELEFONO,ID_DISTRITO) VALUES (NULL,'CACERES','CACERES@GMAIL.COM','MZ K LT1','ACTIVO','2020-04-10','JASSON','M','698574128',1);
insert into ESTUDIANTES(ID,APELLIDO,CORREO,DIRECCION,ESTADO,FECHA_NAC,NOMBRE,SEXO,TELEFONO,ID_DISTRITO) VALUES (NULL,'CASTRO','CASTRO@GMAIL.COM','MZ Q LT2','ACTIVO','2020-03-11','KEVIN','M','698574128',1);
insert into ESTUDIANTES(ID,APELLIDO,CORREO,DIRECCION,ESTADO,FECHA_NAC,NOMBRE,SEXO,TELEFONO,ID_DISTRITO) VALUES (NULL,'RAMIREZ','RAMIREZ@GMAIL.COM','MZ H LT10','ACTIVO','2020-01-15','PAOLA','F','698574128',2);

select * from actividades;
insert into actividades(id,descripcion,direccion,estado,fecha_registro,nombre) values (null,'casa de la Familia Esther','Cerro el Paraiso' ,1,'2019-05-05','Construccion');

insert into actividades(id,descripcion,direccion,estado,fecha_registro,nombre) values (null,'TEMA DEL DIA : DAR GRACIAS','JERUSALEN' ,1,'2019-05-05','Star Kids');





select * from asistencia;
insert into asistencia(id,salida,comentario,entrada,total_horas,id_actividad,id_estudiante)values
 (null,'18:00','registro de todo los estudiantes','14:00','4:00',1,1);
 insert into asistencia(id,salida,comentario,entrada,total_horas,id_actividad,id_estudiante)values
 (null,'18:00:00','registro de todo los estudiantes','14:00:00','4:00:00',1,2);