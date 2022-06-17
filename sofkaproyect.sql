-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-06-2022 a las 19:52:42
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sofkaproyect`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `navelanzadera`
--

CREATE TABLE `navelanzadera` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `peso` int(11) NOT NULL,
  `Metodos` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `navelanzadera`
--

INSERT INTO `navelanzadera` (`id`, `nombre`, `peso`, `Metodos`) VALUES
(1, 'saturno', 188, 'Despegar-Atterizar-Activar_propulsores'),
(2, 'mercurio', 155, 'Despegar-Atterizar-Activar_propulsores'),
(3, 'jupiter', 700, 'Despegar-Atterizar-Activar_propulsores'),
(13, 'naveespecial', 999, 'Despegar-Atterizar-Activar_propulsores');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `navenotripulada`
--

CREATE TABLE `navenotripulada` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `peso` int(11) NOT NULL,
  `Metodos` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `navenotripulada`
--

INSERT INTO `navenotripulada` (`id`, `nombre`, `peso`, `Metodos`) VALUES
(1, 'jean', 800, 'Despegar-Atterizar-Distancia_a_la_tierra'),
(2, 'mercurio', 455, 'Despegar-Atterizar-Distancia_a_la_tierra'),
(3, 'sofia', 788, 'Despegar-Atterizar-Distancia_a_la_tierra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `navepersonal`
--

CREATE TABLE `navepersonal` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `peso` int(11) NOT NULL,
  `Metodos` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `navepersonal`
--

INSERT INTO `navepersonal` (`id`, `nombre`, `peso`, `Metodos`) VALUES
(1, 'efren', 7885, 'Despegar-Atterizar-Distancia_al_planeta_final'),
(2, 'maria', 544, 'Despegar-Atterizar-Distancia_al_planeta_final'),
(3, 'dalgy', 669, 'Despegar-Atterizar-Distancia_al_planeta_final'),
(8, 'bestnave', 7777, 'Despegar-Atterizar-Distancia_al_planeta_final');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `navetripulada`
--

CREATE TABLE `navetripulada` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `peso` int(11) NOT NULL,
  `Metodos` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `navetripulada`
--

INSERT INTO `navetripulada` (`id`, `nombre`, `peso`, `Metodos`) VALUES
(1, 'savi', 475, 'Despegar-Atterizar-Medidor_velocidad_actual'),
(2, 'yuri', 693, 'Despegar-Atterizar-Medidor_velocidad_actual'),
(3, 'cami', 669, 'Despegar-Atterizar-Medidor_velocidad_actual');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `navelanzadera`
--
ALTER TABLE `navelanzadera`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `navenotripulada`
--
ALTER TABLE `navenotripulada`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `navepersonal`
--
ALTER TABLE `navepersonal`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `navetripulada`
--
ALTER TABLE `navetripulada`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `navelanzadera`
--
ALTER TABLE `navelanzadera`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `navenotripulada`
--
ALTER TABLE `navenotripulada`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `navepersonal`
--
ALTER TABLE `navepersonal`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `navetripulada`
--
ALTER TABLE `navetripulada`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
