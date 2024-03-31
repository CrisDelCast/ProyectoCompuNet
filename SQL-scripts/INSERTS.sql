
------------ Inserts tipo identificacion ---------------

INSERT INTO tipo_identificacion (id_tiid, codigo, nombre, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (1, 'CC', 'CEDULA CIUDADANIA', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_identificacion (id_tiid, codigo, nombre, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (2, 'TI', 'TARJETA DE IDENTIDAD', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_identificacion (id_tiid, codigo, nombre, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (3, 'CE', 'CEDULA EXTRANJERA', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_identificacion (id_tiid, codigo, nombre, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (4, 'PA', 'PASAPORTE', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_identificacion (id_tiid, codigo, nombre, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (5, 'RC', 'REGISTRO CIVIL', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');

------------ Inserts tipo destino ---------------

INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (2, 'PLAYA', 'PLAYA Y MAR', 'DESTINO QUE CUENTA CON MAR, BRISA Y ARENA', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (3, 'BOSQU', 'NATURALEZA, BOSQUE Y AIRE', 'DESTINO QUE SE ENCUENTRA RODEADO DE NATURALEZ, ARBOLES, RIOS, ANIMALES... AIRE PURO Y UN PAISAJE VERDE', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (4, 'DESIE', 'DESIERTO Y SOL', 'DESTINO QUE CUENTA CON UN AREA DESERTICA', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (5, 'NIEVE', 'BLANCA NIEVE', 'DESTINO QUE CUENTA CON PAISAJES BLANCOS Y FRÍOS', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (6, 'TREKK', 'TREKKING', 'TREKKING Y MONTAÑISMO', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (7, 'CULTU', 'CULTURAL', 'DESCUBRE CULTURAS DIFERENTES A LA TUYA', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (8, 'SORPR', 'SORPRESA', 'DEJATE SORPRENDER', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO tipo_destino (id_tide, codigo, nombre, descripcion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (9, 'LAGOS', 'LAGUNAS MAJESTUOSAS', 'LAGUNAS, AGUA Y MONTAÑAS', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');

------------ Inserts usuario  ---------------

INSERT INTO usuario (id_usua, login, password, nombre, identificacion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (1, 'CLOPEZ', '123456', 'CESAR LOPEZ', '1151946203', '2021-02-13', NULL, 'CLOPEZ', NULL, 'A');
INSERT INTO usuario (id_usua, login, password, nombre, identificacion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (2, 'JBRAWN', '123456', 'JUAN BRAWN', '1002827007', '2021-02-13', NULL, 'JLORA', NULL, 'A');
INSERT INTO usuario (id_usua, login, password, nombre, identificacion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (3, 'dCASTILLO', '123456', 'CRISTIAN D. CASTILLO', '1002827008', '2021-02-13', NULL, 'JLORA', NULL, 'A');
INSERT INTO usuario (id_usua, login, password, nombre, identificacion, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado) VALUES (4, 'JLORA', '123456', 'JUAN DIEGO LORA', '1002827009', '2021-02-13', NULL, 'JLORA', NULL, 'A');

------------ Inserts Destination Categories  ---------------

INSERT INTO DESTINATION_CATEGORIES (id_deca, code , "name", creation_date, modification_date, creator_user, modifier_user, "status") VALUES (1, 'LATAM', 'SURAMERICA', '2024-03-31', NULL, 'JLORA', NULL, 'A');
INSERT INTO DESTINATION_CATEGORIES (id_deca, code , "name", creation_date, modification_date, creator_user, modifier_user, "status") VALUES (2, 'ECONO', 'ECONOMICOS', '2024-03-31', NULL, 'JLORA', NULL, 'A');
INSERT INTO DESTINATION_CATEGORIES (id_deca, code , "name", creation_date, modification_date, creator_user, modifier_user, "status") VALUES (3, 'PREMI', 'PREMIUM', '2024-03-31', NULL, 'JLORA', NULL, 'A');


------------ Inserts Destino  -------------

INSERT INTO destino (id_dest, codigo, nombre, descripcion, id_deca, tierra, aire , mar, fecha_creacion, fecha_modificacion, usu_creador, usu_modificador, estado, id_tide) VALUES (1, 'LAZUL', 'LAGO AZUL', 'Un lago azul bonito', 1 ,'N','N','N', '2024-03-31', NULL, 'JLORA', NULL, 'A', 9)