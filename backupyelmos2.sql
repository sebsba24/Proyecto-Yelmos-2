-- MariaDB dump 10.19  Distrib 10.4.25-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: yelmos2
-- ------------------------------------------------------
-- Server version	10.4.25-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorias`
--

DROP TABLE IF EXISTS `categorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categorias` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias`
--

LOCK TABLES `categorias` WRITE;
/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contratos`
--

DROP TABLE IF EXISTS `contratos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contratos` (
  `id_contrato` int(11) NOT NULL AUTO_INCREMENT,
  `detalles` varchar(100) DEFAULT NULL,
  `fecha_finc` datetime(6) DEFAULT NULL,
  `fecha_inicioc` datetime(6) DEFAULT NULL,
  `fk_evento` int(11) DEFAULT NULL,
  `fk_proveedor` int(11) DEFAULT NULL,
  `fk_tipo_contrato` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_contrato`),
  KEY `FKecwrrr5grbb34hne1lnvd8qml` (`fk_evento`),
  KEY `FKo4xqpvp8i8l5knmjdxytm3qb2` (`fk_proveedor`),
  KEY `FKh8q7ljt0w53o77hs9jsxm772y` (`fk_tipo_contrato`),
  CONSTRAINT `FKecwrrr5grbb34hne1lnvd8qml` FOREIGN KEY (`fk_evento`) REFERENCES `eventos` (`id_evento`),
  CONSTRAINT `FKh8q7ljt0w53o77hs9jsxm772y` FOREIGN KEY (`fk_tipo_contrato`) REFERENCES `tiposcontratos` (`id_tipo_contrato`),
  CONSTRAINT `FKo4xqpvp8i8l5knmjdxytm3qb2` FOREIGN KEY (`fk_proveedor`) REFERENCES `proveedores` (`id_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contratos`
--

LOCK TABLES `contratos` WRITE;
/*!40000 ALTER TABLE `contratos` DISABLE KEYS */;
/*!40000 ALTER TABLE `contratos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `despachos`
--

DROP TABLE IF EXISTS `despachos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `despachos` (
  `id_despacho` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad_salida` int(11) DEFAULT NULL,
  `estado_despacho` varchar(12) DEFAULT NULL,
  `fecha_salida` datetime(6) DEFAULT NULL,
  `fk_packing` int(11) DEFAULT NULL,
  `fk_productod` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_despacho`),
  KEY `FKpqyug0g5jkaui8x13lhtw7jyf` (`fk_packing`),
  KEY `FKndw6d7o26hk92lsr93cxq4py7` (`fk_productod`),
  CONSTRAINT `FKndw6d7o26hk92lsr93cxq4py7` FOREIGN KEY (`fk_productod`) REFERENCES `productos` (`id_producto`),
  CONSTRAINT `FKpqyug0g5jkaui8x13lhtw7jyf` FOREIGN KEY (`fk_packing`) REFERENCES `packing` (`id_packing`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `despachos`
--

LOCK TABLES `despachos` WRITE;
/*!40000 ALTER TABLE `despachos` DISABLE KEYS */;
/*!40000 ALTER TABLE `despachos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventos`
--

DROP TABLE IF EXISTS `eventos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventos` (
  `id_evento` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad_implementos_adicional` int(11) DEFAULT NULL,
  `cantidad_implemento` int(11) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `nombree` varchar(50) DEFAULT NULL,
  `implementos_adicionales` varchar(20) DEFAULT NULL,
  `fk_reservae` int(11) DEFAULT NULL,
  `fk_tipo_evento` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_evento`),
  KEY `FK5ix5vawl5rhc0k4qto8xmx65p` (`fk_reservae`),
  KEY `FKlrrs36xnxdi2hfhphpotx94j6` (`fk_tipo_evento`),
  CONSTRAINT `FK5ix5vawl5rhc0k4qto8xmx65p` FOREIGN KEY (`fk_reservae`) REFERENCES `reservas` (`id_reseva`),
  CONSTRAINT `FKlrrs36xnxdi2hfhphpotx94j6` FOREIGN KEY (`fk_tipo_evento`) REFERENCES `tiposeventos` (`id_tipo_evento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventos`
--

LOCK TABLES `eventos` WRITE;
/*!40000 ALTER TABLE `eventos` DISABLE KEYS */;
/*!40000 ALTER TABLE `eventos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventarios`
--

DROP TABLE IF EXISTS `inventarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventarios` (
  `id_inventario` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `fecha_ingreso` datetime(6) DEFAULT NULL,
  `fk_productoi` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_inventario`),
  KEY `FK606cw1u0srharomeffpkf41xt` (`fk_productoi`),
  CONSTRAINT `FK606cw1u0srharomeffpkf41xt` FOREIGN KEY (`fk_productoi`) REFERENCES `productos` (`id_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventarios`
--

LOCK TABLES `inventarios` WRITE;
/*!40000 ALTER TABLE `inventarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `packing`
--

DROP TABLE IF EXISTS `packing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `packing` (
  `id_packing` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad_entrada` int(11) DEFAULT NULL,
  `observaciones` varchar(120) DEFAULT NULL,
  `fk_reservap` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_packing`),
  KEY `FKrmrymd2bvtlaxkkeyyytjj57f` (`fk_reservap`),
  CONSTRAINT `FKrmrymd2bvtlaxkkeyyytjj57f` FOREIGN KEY (`fk_reservap`) REFERENCES `reservas` (`id_reseva`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `packing`
--

LOCK TABLES `packing` WRITE;
/*!40000 ALTER TABLE `packing` DISABLE KEYS */;
/*!40000 ALTER TABLE `packing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(100) DEFAULT NULL,
  `fk_categoria` int(11) DEFAULT NULL,
  `fk_tipo_producto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_producto`),
  KEY `FKefy3ut7h0hv7fqr5tyfuq3j32` (`fk_categoria`),
  KEY `FK440dm7543nqfwrrowo6ud0iym` (`fk_tipo_producto`),
  CONSTRAINT `FK440dm7543nqfwrrowo6ud0iym` FOREIGN KEY (`fk_tipo_producto`) REFERENCES `tipoproductos` (`id_tipo_producto`),
  CONSTRAINT `FKefy3ut7h0hv7fqr5tyfuq3j32` FOREIGN KEY (`fk_categoria`) REFERENCES `categorias` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedores` (
  `id_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `emailp` varchar(80) DEFAULT NULL,
  `nombre_proveedor` varchar(60) DEFAULT NULL,
  `telefonop` bigint(20) DEFAULT NULL,
  `fk_tipo_proveedor` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`),
  KEY `FKpjv71pgsjjn86ltdkyrqcpb22` (`fk_tipo_proveedor`),
  CONSTRAINT `FKpjv71pgsjjn86ltdkyrqcpb22` FOREIGN KEY (`fk_tipo_proveedor`) REFERENCES `tiposproveedores` (`id_tipo_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservas` (
  `id_reseva` int(11) NOT NULL AUTO_INCREMENT,
  `direccionr` varchar(40) DEFAULT NULL,
  `emailr` varchar(60) DEFAULT NULL,
  `fecha_finr` datetime(6) DEFAULT NULL,
  `fecha_inicior` datetime(6) DEFAULT NULL,
  `localidadr` varchar(30) DEFAULT NULL,
  `telefonor` bigint(20) DEFAULT NULL,
  `fk_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_reseva`),
  KEY `FKd8f7n44q7t4urbrbquv2ia309` (`fk_usuario`),
  CONSTRAINT `FKd8f7n44q7t4urbrbquv2ia309` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `rol` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_rol` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoproductos`
--

DROP TABLE IF EXISTS `tipoproductos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoproductos` (
  `id_tipo_producto` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoproductos`
--

LOCK TABLES `tipoproductos` WRITE;
/*!40000 ALTER TABLE `tipoproductos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoproductos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiposcontratos`
--

DROP TABLE IF EXISTS `tiposcontratos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiposcontratos` (
  `id_tipo_contrato` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_tipo_contrato` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_contrato`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiposcontratos`
--

LOCK TABLES `tiposcontratos` WRITE;
/*!40000 ALTER TABLE `tiposcontratos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiposcontratos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiposeventos`
--

DROP TABLE IF EXISTS `tiposeventos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiposeventos` (
  `id_tipo_evento` int(11) NOT NULL AUTO_INCREMENT,
  `implementos` varchar(40) DEFAULT NULL,
  `nombre_tipoe` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_evento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiposeventos`
--

LOCK TABLES `tiposeventos` WRITE;
/*!40000 ALTER TABLE `tiposeventos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiposeventos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiposproveedores`
--

DROP TABLE IF EXISTS `tiposproveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tiposproveedores` (
  `id_tipo_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `implemento` varchar(50) DEFAULT NULL,
  `nombre_tipop` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_tipo_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiposproveedores`
--

LOCK TABLES `tiposproveedores` WRITE;
/*!40000 ALTER TABLE `tiposproveedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiposproveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `apellidou` varchar(40) NOT NULL,
  `contrasena` varchar(50) NOT NULL,
  `documento` bigint(20) NOT NULL,
  `emailu` varchar(80) NOT NULL,
  `estado` varchar(14) NOT NULL,
  `nombreu` varchar(40) NOT NULL,
  `rol` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `FKdx3q9geysrtun4ybgi1rptbkx` (`rol`),
  CONSTRAINT `FKdx3q9geysrtun4ybgi1rptbkx` FOREIGN KEY (`rol`) REFERENCES `roles` (`rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-17 15:56:42
