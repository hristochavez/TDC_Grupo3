CREATE DATABASE SISTMARCACION;
USE SISTMARCACION;

CREATE TABLE TIPOAREA
(
	ID INT UNSIGNED NOT NULL,
    NOMBRE VARCHAR(50),
    PRIMARY KEY (ID)
);

INSERT INTO TIPOAREA
VALUES (1, "OPERACIONES"),
       (2, "APOYO"),
       (3, "COMERCIAL");

CREATE TABLE TIPOEMPLEADO
(
    ID INT UNSIGNED NOT NULL,
    NOMBRE VARCHAR(50),
    PRIMARY KEY (ID)
);

INSERT INTO TIPOEMPLEADO 
VALUES (1, "ASESOR"),
       (2, "COORDINADOR"),
       (3, "SUPERVISOR"),
       (4, "RRHH");

CREATE TABLE TIPODOCUMENTO
(
	ID INT UNSIGNED NOT NULL,
    NOMBRE VARCHAR(40),
    PRIMARY KEY (ID)
);

INSERT INTO TIPODOCUMENTO
VALUES (1, "DNI"),
       (2, "CARNÉ EXTRANJERIA");

CREATE TABLE TIPOMARCACION
(
    ID INT UNSIGNED NOT NULL,
    NOMBRE VARCHAR(50),
    PRIMARY KEY (ID)
);

INSERT INTO TIPOMARCACION
VALUES (1, "MARCACIÓNENTRADAJORNADA"),
       (2, "MARCACIONFINJORNADA"),
       (3, "MARCACIONENTRADABANIO"),
       (4, "MARCACIONFINBANIO"),
       (5, "MARCACIONENTRADATOPICO"),
       (6, "MARCACIONFINTOPICO"),
       (7, "MARCACIONENTRADALACTANCIA"),
       (8, "MARCACIONFINLACTANCIA");

CREATE TABLE CAMPANIA
(
    ID INT UNSIGNED NOT NULL,
    NOMBRE VARCHAR(50),
    PRIMARY KEY (ID)
);

INSERT INTO CAMPANIA
VALUES (1, "CLARO"),
       (2, "MOVISTAR");

CREATE TABLE ROL
(
    ID INT UNSIGNED NOT NULL,
    NOMBRE VARCHAR(40),
    PRIMARY KEY (ID)
);

INSERT INTO ROL
VALUES (1, "ADMIN"),
       (2, "SUPERADMIN");

CREATE TABLE AREAS
(
    ID INT UNSIGNED NOT NULL,
    NOMBRE VARCHAR(50),
    TIPO INT UNSIGNED,
    CAMPANIA INT UNSIGNED,
    PRIMARY KEY (ID),
    FOREIGN KEY (TIPO) REFERENCES TIPOAREA(ID),
    FOREIGN KEY (CAMPANIA) REFERENCES CAMPANIA(ID)
);

INSERT INTO AREAS
VALUES (1, "AREA A", 1, 1),
       (2, "AREA B", 1, 2),
       (3, "AREA C", 2, 1),
       (4, "AREA D", 2, 2);

CREATE TABLE EMPLEADOS
(
	ID CHAR(8) NOT NULL,
    CONTRASENIA VARCHAR(255),
    NOMBRE VARCHAR(30),
    APEPAT VARCHAR(255),
    APEMAT VARCHAR(255),
    TIPODOCUMENTO INT UNSIGNED,
    TIPOEMPLEADO INT UNSIGNED,
    PRIMARY KEY (ID),
    FOREIGN KEY (TIPODOCUMENTO) REFERENCES TIPODOCUMENTO(ID)
);

INSERT INTO EMPLEADOS
VALUES ("74576066", "1234", "ANDY", "CHAVEZ", "HUERTAS", 1, 1),
       ("75328598", "5678", "ROSMERY", "YALICO", "CHAVARRIA", 1, 3);

CREATE TABLE ASESORES
(
    ID CHAR(8),
    AREATRABAJO INT UNSIGNED,
    FOREIGN KEY (ID) REFERENCES EMPLEADOS(ID),
    FOREIGN KEY (AREATRABAJO) REFERENCES AREAS(ID)
);

INSERT INTO ASESORES
VALUES ("74576066", 1);

CREATE TABLE SUPERVISORES
(
    ID CHAR(8),
    AREASUPERVISADA INT UNSIGNED,
    IDROL INT UNSIGNED,
    FOREIGN KEY (ID) REFERENCES EMPLEADOS(ID),
    FOREIGN KEY (AREASUPERVISADA) REFERENCES AREAS(ID),
    FOREIGN KEY (IDROL) REFERENCES ROL(ID)
);

INSERT INTO SUPERVISORES
VALUES ("75328598", 1, 1);

CREATE TABLE COORDINADORES
(
    ID CHAR(8),
    CAMPANIACOORDINADA INT UNSIGNED,
    FOREIGN KEY (ID) REFERENCES EMPLEADOS(ID),
    FOREIGN KEY (CAMPANIACOORDINADA) REFERENCES CAMPANIA(ID)   
);

CREATE TABLE RRHH
(
    ID CHAR(8),
    IDROL INT UNSIGNED,
    FOREIGN KEY (ID) REFERENCES EMPLEADOS(ID),
    FOREIGN KEY (IDROL) REFERENCES ROL(ID)
);

CREATE TABLE MARCACION
(
    ID INT UNSIGNED NOT NULL,
    FECHA DATETIME,
    IDEMPLEADO CHAR(8),
    TIPOMARCACION INT UNSIGNED,
    PRIMARY KEY (ID),
    FOREIGN KEY (IDEMPLEADO) REFERENCES EMPLEADOS(ID),
    FOREIGN KEY (TIPOMARCACION) REFERENCES TIPOMARCACION(ID)
);
