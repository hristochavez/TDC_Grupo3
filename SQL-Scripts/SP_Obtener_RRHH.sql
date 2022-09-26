DELIMITER $$
CREATE PROCEDURE OBTENER_COORDINADOR
    (
        IN ID VARCHAR(8),
        OUT ID_EMPLEADO VARCHAR(8),
        OUT NOMBRE VARCHAR(40),
        OUT APE_PAT VARCHAR(50),
        OUT APE_MAT VARCHAR(50),
        OUT TIPO_DOCUMENTO INT
    )
BEGIN
    SELECT
        A.ID AS "DNI",
        A.NOMBRE AS "NOMBRE EMPLEADO",
        A.APEPAT AS "APELLIDO PATERNO",
        A.APEMAT AS "APELLIDO MATERNO",
        A.TIPODOCUMENTO AS "TIPO DOCUMENTO"
        INTO ID_EMPLEADO, NOMBRE, APE_PAT, APE_MAT, TIPO_DOCUMENTO
    FROM 
        EMPLEADOS AS A
    INNER JOIN 
        RRHH AS B
    ON A.ID = B.ID 
    WHERE
        A.ID = ID;
END $$
DELIMITER ;
