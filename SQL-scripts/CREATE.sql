
--------- TABLE creation --------

CREATE TABLE cliente (id_clie SERIAL NOT NULL, numero_identificacion varchar(15) NOT NULL, primer_apellido varchar(100) NOT NULL, segundo_apellido varchar(100), nombre varchar(100) NOT NULL, telefono1 varchar(15), telefono2 varchar(15), correo varchar(100), sexo varchar(1) NOT NULL, fecha_nacimiento date NOT NULL, fecha_creacion date NOT NULL, fecha_modificacion date, usu_creador varchar(10) NOT NULL, usu_modificador varchar(10), estado varchar(1) NOT NULL, id_tiid int NOT NULL, PRIMARY KEY (id_clie));
CREATE TABLE destinations (id_dest SERIAL NOT NULL, codigo varchar(5) NOT NULL, nombre varchar(100) NOT NULL, descripcion varchar(300) NOT NULL, id_deca int NOT NULL, tierra varchar(1) DEFAULT 'N' NOT NULL, aire varchar(1) DEFAULT 'N' NOT NULL, mar varchar(1) DEFAULT 'N' NOT NULL, fecha_creacion date NOT NULL, fecha_modificacion date, usu_creador varchar(10) NOT NULL, usu_modificador varchar(10), estado varchar(1) NOT NULL, id_tide int NOT NULL, PRIMARY KEY (id_dest));
CREATE TABLE detalle_plan (id_depl SERIAL NOT NULL, alimentacion varchar(1) DEFAULT 'N' NOT NULL, hospedaje varchar(1) DEFAULT 'N' NOT NULL, transporte varchar(1) DEFAULT 'N' NOT NULL, traslados varchar(1) DEFAULT 'N' NOT NULL, valor numeric(19, 2) DEFAULT 0 NOT NULL, cantidad_noches int NOT NULL, cantidad_dias int NOT NULL, fecha_creacion date NOT NULL, fecha_modificacion date, usu_creador varchar(10) NOT NULL, usu_modificador varchar(10), estado varchar(1) NOT NULL, id_plan int NOT NULL, id_dest int NOT NULL, PRIMARY KEY (id_depl));
CREATE TABLE plan (id_plan SERIAL NOT NULL, codigo varchar(5) NOT NULL, descripcion_solicitud varchar(300) NOT NULL, nombre varchar(100) NOT NULL, cantidad_personas int NOT NULL, fecha_solicitud date NOT NULL, fecha_inicio_viaje date, fecha_fin_viaje date, valor_total numeric(19, 2) DEFAULT 0 NOT NULL, fecha_creacion date NOT NULL, fecha_modificacion date, usu_creador varchar(10) NOT NULL, usu_modificador varchar(10), estado varchar(1) NOT NULL, id_clie int NOT NULL, id_usua int NOT NULL, PRIMARY KEY (id_plan));
CREATE TABLE tipo_destino (id_tide SERIAL NOT NULL, codigo varchar(5) NOT NULL, nombre varchar(100) NOT NULL UNIQUE, descripcion varchar(300) NOT NULL, fecha_creacion date NOT NULL, fecha_modificacion date, usu_creador varchar(10) NOT NULL, usu_modificador varchar(10), estado varchar(1) NOT NULL, PRIMARY KEY (id_tide));
CREATE TABLE tipo_identificacion (id_tiid SERIAL NOT NULL, codigo varchar(5) NOT NULL, nombre varchar(100) NOT NULL, fecha_creacion date NOT NULL, fecha_modificacion date, usu_creador varchar(10) NOT NULL, usu_modificador varchar(10), estado varchar(1) NOT NULL, PRIMARY KEY (id_tiid));
CREATE TABLE usuario (id_usua SERIAL NOT NULL, login varchar(10) NOT NULL, password varchar(50) NOT NULL, nombre varchar(100) NOT NULL, identificacion varchar(15) NOT NULL, fecha_creacion date NOT NULL, fecha_modificacion date, usu_creador varchar(10) NOT NULL, usu_modificador varchar(10), estado varchar(1) NOT NULL, PRIMARY KEY (id_usua));
CREATE TABLE destination_categories (id_deca SERIAL NOT NULL, code varchar(5) NOT NULL, "name" varchar(100) NOT NULL UNIQUE, creation_date date NOT NULL, modification_date date, creator_user varchar(10) NOT NULL, modifier_user varchar(10), "status" varchar(1) NOT NULL, PRIMARY KEY (id_deca));
CREATE TABLE destination_destination_categories (id_deca SERIAL NOT NULL, PRIMARY KEY (id_deca));

--------- INDEX creation -------

CREATE UNIQUE INDEX cliente_id_clie ON cliente (id_clie);
CREATE UNIQUE INDEX cliente_numero_identificacion ON cliente (numero_identificacion);
CREATE UNIQUE INDEX destino_id_dest ON destinations (id_dest);
CREATE UNIQUE INDEX destino_codigo ON destinations (codigo);
CREATE UNIQUE INDEX detalle_plan_id_depl ON detalle_plan (id_depl);
CREATE UNIQUE INDEX plan_id_plan ON "plan" (id_plan);
CREATE UNIQUE INDEX plan_codigo ON "plan" (codigo);
CREATE UNIQUE INDEX tipo_destino_id_tide ON tipo_destino (id_tide);
CREATE UNIQUE INDEX tipo_destino_codigo ON tipo_destino (codigo);
CREATE UNIQUE INDEX tipo_identificacion_id_tiid ON tipo_identificacion (id_tiid);
CREATE UNIQUE INDEX tipo_identificacion_codigo ON tipo_identificacion (codigo);
CREATE UNIQUE INDEX usuario_id_usua ON usuario (id_usua);
CREATE UNIQUE INDEX destination_category_id_deca ON DESTINATION_CATEGORIES (id_deca);
CREATE UNIQUE INDEX destination_category_code ON DESTINATION_CATEGORIES (code);

-------- Foreign Keys creation --------

ALTER TABLE plan ADD CONSTRAINT FK_CLIE_PLAN FOREIGN KEY (id_clie) REFERENCES cliente (id_clie);
ALTER TABLE detalle_plan ADD CONSTRAINT FK_DEST_DEPL FOREIGN KEY (id_dest) REFERENCES destino (id_dest);
ALTER TABLE detalle_plan ADD CONSTRAINT FK_PLAN_DEPL FOREIGN KEY (id_plan) REFERENCES "plan" (id_plan);
ALTER TABLE DESTINATION ADD CONSTRAINT FK_TIDE_DEST FOREIGN KEY (id_tide) REFERENCES tipo_destino (id_tide);
ALTER TABLE DESTINATION ADD CONSTRAINT FK_DECA_DEST FOREIGN KEY (id_deca) REFERENCES DESTINATION_CATEGORIES (id_deca);
ALTER TABLE cliente ADD CONSTRAINT FK_TIID_CLIE FOREIGN KEY (id_tiid) REFERENCES tipo_identificacion (id_tiid);
ALTER TABLE plan ADD CONSTRAINT FK_USUA_PLAN FOREIGN KEY (id_usua) REFERENCES usuario (id_usua);
