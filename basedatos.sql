prestamoCREATE DATABASE creditos

CREATE TABLE empleado(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (100) NOT NULL,
n_identificacion VARCHAR (100) NOT NULL,
usuario VARCHAR (10) NOT NULL,
contrasena VARCHAR (150) NOT NULL,
correo VARCHAR (100) NOT NULL,
telefono VARCHAR (100) NOT NULL);

CREATE TABLE prestamo (
  id INT AUTO_INCREMENT PRIMARY KEY,
  identificacion_cliente VARCHAR(100) NOT NULL,
  monto_prestamo FLOAT NOT NULL,
  monto_interes FLOAT NOT NULL,
  fecha_prestamo DATE NOT NULL,
  fecha_pago DATE NOT NULL,
  estado VARCHAR (50) NOT NULL,
  FOREIGN KEY (identificacion_cliente) REFERENCES cliente(cedula)
);


CREATE TABLE lista_negra (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_cliente INT NOT NULL,
  identificacion VARCHAR(100) NOT NULL,
  nombre_cliente VARCHAR(100) NOT NULL,
  razon_bloqueo VARCHAR(100) NOT NULL,
  fecha_bloqueo DATE NOT NULL,
  tiempo_bloqueo VARCHAR(50) NOT NULL,
  CONSTRAINT fk_id_cliente FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);


CREATE TABLE cliente (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  cedula VARCHAR(100) NOT NULL UNIQUE,
  edad INT NOT NULL,
  ingresos_mensuales FLOAT NOT NULL,
  cuenta_bancaria BOOLEAN NOT NULL,
  historial_crediticio BOOLEAN NOT NULL,
  correo VARCHAR(100) NOT NULL, 
  telefono VARCHAR(100) NOT NULL
);
