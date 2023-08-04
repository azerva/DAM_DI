-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-01-2023 a las 10:21:20
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gym`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `TipoCliente` varchar(10) NOT NULL,
  `Telefono` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idCliente`, `Nombre`, `TipoCliente`, `Telefono`) VALUES
(1, 'Rosa Luque Pérez', 'VIP', '652147788'),
(2, 'Pedro Marín Ramos', 'Normal', '652341787'),
(3, 'Juan León Santos', 'Normal', '658147733'),
(4, 'Elena Ruiz López', 'VIP', '632247326'),
(5, 'Diana Martín Fernández', 'Normal', '690140998'),
(6, 'Luisa Jiménez Sáenz', 'Normal', '659874431'),
(7, 'Natalia Romero García', 'Normal', '633427511'),
(8, 'Lucía Sánchez Martos', 'VIP', '655222172'),
(9, 'Carmen Ortiz Ramírez', 'VIP', '636253107'),
(10, 'Teresa Díaz Zamora', 'Normal', '654778559');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenamiento`
--

CREATE TABLE `entrenamiento` (
  `idEntrenamiento` int(11) NOT NULL,
  `tipoEntrenamiento` varchar(15) NOT NULL,
  `sala` varchar(20) NOT NULL,
  `precioSesion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entrenamiento`
--

INSERT INTO `entrenamiento` (`idEntrenamiento`, `tipoEntrenamiento`, `sala`, `precioSesion`) VALUES
(101, 'Muscular', 'Sala Musculación', 25),
(102, 'Físico', 'Sala Fitness', 50),
(103, 'Funcional', 'Sala Fitness', 35),
(104, 'Fuerza', 'Sala Musculación', 35),
(105, 'Running', 'Sala Cross', 20),
(106, 'Crossfit', 'Sala Cross', 80);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesiones`
--

CREATE TABLE `sesiones` (
  `idSesion` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idEntrenamiento` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `horaInicio` time NOT NULL,
  `horaFin` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sesiones`
--

INSERT INTO `sesiones` (`idSesion`, `idCliente`, `idEntrenamiento`, `fecha`, `horaInicio`, `horaFin`) VALUES
(1, 3, 103, '2020-07-11', '19:30:00', '20:30:00'),
(2, 5, 102, '2020-07-11', '09:00:00', '10:00:00'),
(3, 2, 101, '2020-07-11', '17:00:00', '18:00:00'),
(4, 7, 104, '2020-07-11', '17:00:00', '18:00:00'),
(5, 9, 105, '2020-07-12', '09:00:00', '10:00:00'),
(6, 10, 102, '2020-07-13', '19:30:00', '20:30:00'),
(7, 6, 103, '2020-07-14', '19:30:00', '20:30:00'),
(8, 1, 101, '2020-07-14', '17:00:00', '18:00:00'),
(9, 4, 104, '2020-07-15', '09:00:00', '10:00:00'),
(10, 8, 101, '2020-07-16', '09:00:00', '10:00:00'),
(11, 2, 103, '2020-07-16', '17:00:00', '18:00:00'),
(12, 7, 102, '2020-07-17', '19:30:00', '20:30:00'),
(13, 9, 104, '2020-07-18', '09:00:00', '10:00:00'),
(14, 3, 106, '2020-07-19', '19:30:00', '20:30:00'),
(15, 1, 103, '2020-07-20', '09:00:00', '10:00:00'),
(16, 1, 105, '2020-07-21', '19:30:00', '20:30:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `entrenamiento`
--
ALTER TABLE `entrenamiento`
  ADD PRIMARY KEY (`idEntrenamiento`),
  ADD KEY `idEntrenamiento` (`idEntrenamiento`);

--
-- Indices de la tabla `sesiones`
--
ALTER TABLE `sesiones`
  ADD PRIMARY KEY (`idSesion`),
  ADD KEY `idEntrenamiento` (`idEntrenamiento`),
  ADD KEY `idCliente` (`idCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `sesiones`
--
ALTER TABLE `sesiones`
  MODIFY `idSesion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `sesiones`
--
ALTER TABLE `sesiones`
  ADD CONSTRAINT `sesiones_ibfk_1` FOREIGN KEY (`idEntrenamiento`) REFERENCES `entrenamiento` (`idEntrenamiento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `sesiones_ibfk_2` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
