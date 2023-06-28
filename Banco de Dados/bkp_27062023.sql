-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.27-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para academia
DROP DATABASE IF EXISTS `academia`;
CREATE DATABASE IF NOT EXISTS `academia` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `academia`;

-- Copiando estrutura para tabela academia.cargo
DROP TABLE IF EXISTS `cargo`;
CREATE TABLE IF NOT EXISTS `cargo` (
  `codCargo` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCargo` varchar(100) NOT NULL DEFAULT '',
  `salarioCargo` decimal(10,2) NOT NULL,
  PRIMARY KEY (`codCargo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.cargo: ~2 rows (aproximadamente)
DELETE FROM `cargo`;
INSERT INTO `cargo` (`codCargo`, `nomeCargo`, `salarioCargo`) VALUES
	(1, 'Personal Trainer', 3500.00);

-- Copiando estrutura para tabela academia.categoria
DROP TABLE IF EXISTS `categoria`;
CREATE TABLE IF NOT EXISTS `categoria` (
  `codCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCategoria` varchar(100) NOT NULL,
  PRIMARY KEY (`codCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.categoria: ~1 rows (aproximadamente)
DELETE FROM `categoria`;
INSERT INTO `categoria` (`codCategoria`, `nomeCategoria`) VALUES
	(1, 'Suplementos');

-- Copiando estrutura para tabela academia.cliente
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `codCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCliente` varchar(250) NOT NULL,
  `cpfCliente` varchar(45) NOT NULL,
  `emailCliente` varchar(200) NOT NULL,
  `telefoneCliente` varchar(45) NOT NULL,
  `nascimentoCliente` date NOT NULL,
  PRIMARY KEY (`codCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.cliente: ~2 rows (aproximadamente)
DELETE FROM `cliente`;
INSERT INTO `cliente` (`codCliente`, `nomeCliente`, `cpfCliente`, `emailCliente`, `telefoneCliente`, `nascimentoCliente`) VALUES
	(1, 'Salomão Ferreira Junior', '111.111.111-11', 'salomao@example.com', '(35)99769-5915', '2003-07-15');

-- Copiando estrutura para tabela academia.funcionario
DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `codFuncionario` int(11) NOT NULL AUTO_INCREMENT,
  `CARGO_codCargo` int(11) NOT NULL,
  `nomeFuncionario` varchar(250) NOT NULL,
  `cpfFuncionario` varchar(50) NOT NULL,
  `emailFuncionario` varchar(250) NOT NULL,
  `telefoneFuncionario` varchar(50) NOT NULL,
  `nascimentoFuncionario` date NOT NULL,
  PRIMARY KEY (`codFuncionario`),
  KEY `CARGO_codCargo` (`CARGO_codCargo`),
  CONSTRAINT `CARGO_codCargo` FOREIGN KEY (`CARGO_codCargo`) REFERENCES `cargo` (`codCargo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.funcionario: ~0 rows (aproximadamente)
DELETE FROM `funcionario`;

-- Copiando estrutura para tabela academia.item_venda
DROP TABLE IF EXISTS `item_venda`;
CREATE TABLE IF NOT EXISTS `item_venda` (
  `codItemVenda` int(11) NOT NULL AUTO_INCREMENT,
  `VENDA_codVenda` int(11) NOT NULL,
  `PRODUTO_codProduto` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  PRIMARY KEY (`codItemVenda`),
  KEY `fk_venda_has_produto_produto1_idx` (`PRODUTO_codProduto`) USING BTREE,
  KEY `fk_venda_has_produto_venda1_idx` (`VENDA_codVenda`) USING BTREE,
  CONSTRAINT `FK_item_venda_produto` FOREIGN KEY (`PRODUTO_codProduto`) REFERENCES `produto` (`codProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_item_venda_venda` FOREIGN KEY (`VENDA_codVenda`) REFERENCES `venda` (`codVenda`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.item_venda: ~0 rows (aproximadamente)
DELETE FROM `item_venda`;

-- Copiando estrutura para tabela academia.marca
DROP TABLE IF EXISTS `marca`;
CREATE TABLE IF NOT EXISTS `marca` (
  `codMarca` int(11) NOT NULL AUTO_INCREMENT,
  `nomeMarca` varchar(100) NOT NULL,
  PRIMARY KEY (`codMarca`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.marca: ~3 rows (aproximadamente)
DELETE FROM `marca`;
INSERT INTO `marca` (`codMarca`, `nomeMarca`) VALUES
	(1, 'Black Skull'),
	(2, 'Growth');

-- Copiando estrutura para tabela academia.plano
DROP TABLE IF EXISTS `plano`;
CREATE TABLE IF NOT EXISTS `plano` (
  `codPlano` int(11) NOT NULL AUTO_INCREMENT,
  `tipoPlano` varchar(100) NOT NULL,
  `valorPlano` decimal(10,2) NOT NULL,
  PRIMARY KEY (`codPlano`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.plano: ~0 rows (aproximadamente)
DELETE FROM `plano`;
INSERT INTO `plano` (`codPlano`, `tipoPlano`, `valorPlano`) VALUES
	(1, 'Mensal', 110.00);

-- Copiando estrutura para tabela academia.produto
DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `codProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(150) NOT NULL,
  `valorProduto` decimal(10,2) NOT NULL,
  `CATEGORIA_codCategoria` int(11) NOT NULL,
  `MARCA_codMarca` int(11) NOT NULL,
  `estoque` varchar(45) NOT NULL,
  PRIMARY KEY (`codProduto`) USING BTREE,
  KEY `fk_produto_categoria_idx` (`CATEGORIA_codCategoria`) USING BTREE,
  KEY `fk_produto_marca1_idx` (`MARCA_codMarca`) USING BTREE,
  CONSTRAINT `fk_produto_categoria` FOREIGN KEY (`CATEGORIA_codCategoria`) REFERENCES `categoria` (`codCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_produto_marca1` FOREIGN KEY (`MARCA_codMarca`) REFERENCES `marca` (`codMarca`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.produto: ~0 rows (aproximadamente)
DELETE FROM `produto`;
INSERT INTO `produto` (`codProduto`, `nomeProduto`, `valorProduto`, `CATEGORIA_codCategoria`, `MARCA_codMarca`, `estoque`) VALUES
	(1, 'Creatina 300g', 59.90, 1, 1, '25');

-- Copiando estrutura para tabela academia.venda
DROP TABLE IF EXISTS `venda`;
CREATE TABLE IF NOT EXISTS `venda` (
  `codVenda` int(11) NOT NULL AUTO_INCREMENT,
  `formaPagamento` enum('Pix','Cartão de Crédito','Cartão de Débito','Dinheiro') NOT NULL,
  `dataHora` datetime NOT NULL,
  `CLIENTE_codCliente` int(11) NOT NULL,
  PRIMARY KEY (`codVenda`) USING BTREE,
  KEY `fk_venda_cliente1_idx` (`CLIENTE_codCliente`) USING BTREE,
  CONSTRAINT `FK_venda_cliente` FOREIGN KEY (`CLIENTE_codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Copiando dados para a tabela academia.venda: ~0 rows (aproximadamente)
DELETE FROM `venda`;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
