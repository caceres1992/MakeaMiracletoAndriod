INSERT INTO DISTRITOS (id,nombre)values (null,'san JUAN DE LURIGANCHO');
INSERT INTO DISTRITOS (id,nombre)values (null,'SAN ISIDRO');


insert into ESTUDIANTES(ID,APELLIDO,CORREO,DIRECCION,ESTADO,FECHA_NAC,NOMBRE,SEXO,TELEFONO,ID_DISTRITO) VALUES (NULL,'CACERES','CACERES@GMAIL.COM','MZ K LT1','ACTIVO','2020-04-10','JASSON','M','698574128',1);
insert into ESTUDIANTES(ID,APELLIDO,CORREO,DIRECCION,ESTADO,FECHA_NAC,NOMBRE,SEXO,TELEFONO,ID_DISTRITO) VALUES (NULL,'CASTRO','CASTRO@GMAIL.COM','MZ Q LT2','ACTIVO','2020-03-11','KEVIN','M','698574128',1);
insert into ESTUDIANTES(ID,APELLIDO,CORREO,DIRECCION,ESTADO,FECHA_NAC,NOMBRE,SEXO,TELEFONO,ID_DISTRITO) VALUES (NULL,'RAMIREZ','RAMIREZ@GMAIL.COM','MZ H LT10','ACTIVO','2020-01-15','PAOLA','F','698574128',2);


insert into actividades(id,descripcion,direccion,estado,fecha_registro,nombre) values (null,'casa de la Familia Esther','Cerro el Paraiso' ,1,'2019-05-05','Construccion');

insert into actividades(id,descripcion,direccion,estado,fecha_registro,nombre) values (null,'TEMA DEL DIA : DAR GRACIAS','JERUSALEN' ,1,'2019-05-05','Star Kids');

insert into asistencia(id,salida,comentario,entrada,estado,total_horas,id_actividad,id_estudiante) values (null,'18:00','registro de todo los estudiantes','14:00',1,null,1,1);

