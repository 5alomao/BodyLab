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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela academia.categoria
DROP TABLE IF EXISTS `categoria`;
CREATE TABLE IF NOT EXISTS `categoria` (
  `codCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCategoria` varchar(100) NOT NULL,
  PRIMARY KEY (`codCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela academia.marca
DROP TABLE IF EXISTS `marca`;
CREATE TABLE IF NOT EXISTS `marca` (
  `codMarca` int(11) NOT NULL AUTO_INCREMENT,
  `nomeMarca` varchar(100) NOT NULL,
  PRIMARY KEY (`codMarca`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela academia.plano
DROP TABLE IF EXISTS `plano`;
CREATE TABLE IF NOT EXISTS `plano` (
  `codPlano` int(11) NOT NULL AUTO_INCREMENT,
  `tipoPlano` varchar(100) NOT NULL,
  `valorPlano` decimal(10,2) NOT NULL,
  PRIMARY KEY (`codPlano`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para procedure academia.proc_deletaCargo
DROP PROCEDURE IF EXISTS `proc_deletaCargo`;
DELIMITER //
CREATE PROCEDURE `proc_deletaCargo`(IN remCargo int)
BEGIN

	DELETE FROM cargo WHERE codCargo = remCargo;
	
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_deletaCategoria
DROP PROCEDURE IF EXISTS `proc_deletaCategoria`;
DELIMITER //
CREATE PROCEDURE `proc_deletaCategoria`(IN remCategoria int)
BEGIN

	DELETE FROM categoria WHERE codCategoria = remCategoria;
	
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_deletaCliente
DROP PROCEDURE IF EXISTS `proc_deletaCliente`;
DELIMITER //
CREATE PROCEDURE `proc_deletaCliente`(IN remCliente int)
BEGIN

	DELETE FROM cliente WHERE codCliente = remCliente;
	
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_deletaFuncionario
DROP PROCEDURE IF EXISTS `proc_deletaFuncionario`;
DELIMITER //
CREATE PROCEDURE `proc_deletaFuncionario`(IN remFuncionario int)
BEGIN

	DELETE FROM funcionario WHERE codFuncionario = remFuncionario;
	
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_deletaMarca
DROP PROCEDURE IF EXISTS `proc_deletaMarca`;
DELIMITER //
CREATE PROCEDURE `proc_deletaMarca`(IN remMarca int)
BEGIN

	DELETE FROM marca WHERE codMarca = remMarca;
	
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_deletaPlano
DROP PROCEDURE IF EXISTS `proc_deletaPlano`;
DELIMITER //
CREATE PROCEDURE `proc_deletaPlano`(IN remPlano int)
BEGIN

	DELETE FROM plano WHERE codPlano = remPlano;
	
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_deletaProduto
DROP PROCEDURE IF EXISTS `proc_deletaProduto`;
DELIMITER //
CREATE PROCEDURE `proc_deletaProduto`(IN remProduto int)
BEGIN

	DELETE FROM produto WHERE codProduto = remProduto;
	
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereCargo
DROP PROCEDURE IF EXISTS `proc_insereCargo`;
DELIMITER //
CREATE PROCEDURE `proc_insereCargo`(IN novoCargo VARCHAR(100), IN novoSalario DECIMAL(10,2))
BEGIN
	INSERT INTO cargo VALUES (NULL, novoCargo, novoSalario);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereCategoria
DROP PROCEDURE IF EXISTS `proc_insereCategoria`;
DELIMITER //
CREATE PROCEDURE `proc_insereCategoria`(IN novaCategoria VARCHAR(100))
BEGIN
	INSERT INTO categoria VALUES (NULL, novaCategoria);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereCliente
DROP PROCEDURE IF EXISTS `proc_insereCliente`;
DELIMITER //
CREATE PROCEDURE `proc_insereCliente`(IN novoNome VARCHAR(100), IN novoCpf VARCHAR(45), IN novoTelefone VARCHAR(50), IN novoEmail VARCHAR(150))
BEGIN
	INSERT INTO cliente VALUES (NULL, novoNome, novoCpf, novoEmail, novoTelefone);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereFuncionario
DROP PROCEDURE IF EXISTS `proc_insereFuncionario`;
DELIMITER //
CREATE PROCEDURE `proc_insereFuncionario`(IN novoNome VARCHAR(100), IN novoCpf VARCHAR(45), IN novoTelefone VARCHAR(50), IN novoEmail VARCHAR(150), IN novoCargo int)
BEGIN
	INSERT INTO funcionario VALUES (NULL, novoNome, novoCpf, novoEmail, novoTelefone, novoCargo);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereItemVenda
DROP PROCEDURE IF EXISTS `proc_insereItemVenda`;
DELIMITER //
CREATE PROCEDURE `proc_insereItemVenda`(IN codVendaProd INT, IN codProd INT, IN quantidade INT)
BEGIN
	INSERT INTO item_venda VALUES(codVendaProd,codProd,quantidade);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereMarca
DROP PROCEDURE IF EXISTS `proc_insereMarca`;
DELIMITER //
CREATE PROCEDURE `proc_insereMarca`(IN novaMarca VARCHAR(100))
BEGIN
	INSERT INTO marca VALUES (NULL, novaMarca);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_inserePlano
DROP PROCEDURE IF EXISTS `proc_inserePlano`;
DELIMITER //
CREATE PROCEDURE `proc_inserePlano`(IN novoTipo VARCHAR(100), IN novoValor DECIMAL(10,2))
BEGIN
	INSERT INTO plano VALUES (NULL, novoTipo, novoValor);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereProduto
DROP PROCEDURE IF EXISTS `proc_insereProduto`;
DELIMITER //
CREATE PROCEDURE `proc_insereProduto`(IN novoProduto VARCHAR(100), IN novoValor DECIMAL(10,2), IN codMarca INT, IN codCategoria INT, IN qtdEstoque int)
BEGIN
	INSERT INTO produto VALUES (NULL, novoProduto, novoValor, codCategoria, codMarca, qtdEstoque);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereVendaPlano
DROP PROCEDURE IF EXISTS `proc_insereVendaPlano`;
DELIMITER //
CREATE PROCEDURE `proc_insereVendaPlano`(
	IN `novoPagamento` ENUM('Pix','Cartão de Crédito','Cartão de Débito','Dinheiro'),
	IN `codCliente` INT,
	IN `codPlano` INT,
	IN `codFuncionario` INT,
	IN `horarioVenda` DATETIME
)
BEGIN
	INSERT INTO venda_plano VALUES(NULL, novoPagamento, horarioVenda, codCliente, codPlano, codFuncionario);
END//
DELIMITER ;

-- Copiando estrutura para procedure academia.proc_insereVendaProduto
DROP PROCEDURE IF EXISTS `proc_insereVendaProduto`;
DELIMITER //
CREATE PROCEDURE `proc_insereVendaProduto`(
	IN `novoPagamento` ENUM('Pix','Cartão de Crédito','Cartão de Débito','Dinheiro'),
	IN `codCliente` INT,
	IN `codFuncionario` INT,
	IN `horarioVenda` DATETIME
)
BEGIN
	INSERT INTO venda_produto VALUES (NULL, novoPagamento, horarioVenda, codCliente, codFuncionario);
END//
DELIMITER ;

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

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela academia.venda
DROP TABLE IF EXISTS `venda`;
CREATE TABLE IF NOT EXISTS `venda` (
  `codVenda` int(11) NOT NULL AUTO_INCREMENT,
  `formaPagamento` enum('Pix','Cartão de Crédito','Cartão de Débito') NOT NULL,
  `dataHora` datetime NOT NULL,
  `CLIENTE_codCliente` int(11) NOT NULL,
  PRIMARY KEY (`codVenda`) USING BTREE,
  KEY `fk_venda_cliente1_idx` (`CLIENTE_codCliente`) USING BTREE,
  CONSTRAINT `FK_venda_cliente` FOREIGN KEY (`CLIENTE_codCliente`) REFERENCES `cliente` (`codCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para view academia.v_clientes
DROP VIEW IF EXISTS `v_clientes`;
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `v_clientes` (
	`CODIGO` INT(11) NOT NULL,
	`NOME` VARCHAR(250) NOT NULL COLLATE 'utf8_general_ci',
	`CPF` VARCHAR(45) NOT NULL COLLATE 'utf8_general_ci',
	`TELEFONE` VARCHAR(45) NOT NULL COLLATE 'utf8_general_ci',
	`EMAIL` VARCHAR(200) NOT NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;

-- Copiando estrutura para view academia.v_funcionarios
DROP VIEW IF EXISTS `v_funcionarios`;
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `v_funcionarios` (
	`CODIGO` INT(11) NOT NULL,
	`NOME` VARCHAR(250) NOT NULL COLLATE 'utf8_general_ci',
	`CPF` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`EMAIL` VARCHAR(250) NOT NULL COLLATE 'utf8_general_ci',
	`TELEFONE` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`Cargo` VARCHAR(100) NOT NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;

-- Copiando estrutura para view academia.v_planos
DROP VIEW IF EXISTS `v_planos`;
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `v_planos` (
	`CODIGO` INT(11) NOT NULL,
	`TIPO` VARCHAR(100) NOT NULL COLLATE 'utf8_general_ci',
	`VALOR` DECIMAL(10,2) NOT NULL
) ENGINE=MyISAM;

-- Copiando estrutura para view academia.v_planosvendidos
DROP VIEW IF EXISTS `v_planosvendidos`;
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `v_planosvendidos` 
) ENGINE=MyISAM;

-- Copiando estrutura para view academia.v_produtos
DROP VIEW IF EXISTS `v_produtos`;
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `v_produtos` (
	`CODIGO` INT(11) NOT NULL,
	`NOME` VARCHAR(150) NOT NULL COLLATE 'utf8_general_ci',
	`VALOR` DECIMAL(10,2) NOT NULL,
	`CATEGORIA` VARCHAR(100) NOT NULL COLLATE 'utf8_general_ci',
	`MARCA` VARCHAR(100) NOT NULL COLLATE 'utf8_general_ci',
	`ESTOQUE` VARCHAR(45) NOT NULL COLLATE 'utf8_general_ci'
) ENGINE=MyISAM;

-- Copiando estrutura para view academia.v_produtosvendidos
DROP VIEW IF EXISTS `v_produtosvendidos`;
-- Criando tabela temporária para evitar erros de dependência de VIEW
CREATE TABLE `v_produtosvendidos` 
) ENGINE=MyISAM;

-- Copiando estrutura para view academia.v_clientes
DROP VIEW IF EXISTS `v_clientes`;
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `v_clientes`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `v_clientes` AS (SELECT codCliente AS CODIGO, 
nomeCliente AS NOME, 
cpfCliente AS CPF, 
telefoneCliente AS TELEFONE, 
emailCliente AS EMAIL 
FROM cliente) ;

-- Copiando estrutura para view academia.v_funcionarios
DROP VIEW IF EXISTS `v_funcionarios`;
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `v_funcionarios`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `v_funcionarios` AS (SELECT f.codFuncionario AS CODIGO,
f.nomeFuncionario AS NOME,
f.cpfFuncionario AS CPF,
f.emailFuncionario AS EMAIL,
f.telefoneFuncionario AS TELEFONE,
c.nomeCargo AS "Cargo"
FROM funcionario f INNER JOIN cargo c ON c.codCargo = f.cargo_codCargo) ;

-- Copiando estrutura para view academia.v_planos
DROP VIEW IF EXISTS `v_planos`;
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `v_planos`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `v_planos` AS (SELECT codPlano AS CODIGO,
tipoPlano AS TIPO,
valorPlano AS VALOR FROM plano) ;

-- Copiando estrutura para view academia.v_planosvendidos
DROP VIEW IF EXISTS `v_planosvendidos`;
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `v_planosvendidos`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `v_planosvendidos` AS (SELECT vpla.codVendaPlano AS CODIGO,
cli.nomeCliente AS "CLIENTE",
pla.tipoPlano AS "PLANO",
vpla.formaPagamento AS "FORMA DE PAGAMENTO",
date_format(vpla.dataHora,'%d/%m/%Y') as "DATA",
date_format(vpla.dataHora,'%Hh %Imin %Ssec') AS HORARIO,
fun.nomeFuncionario AS "FUNCIONARIO"
FROM venda_plano vpla
INNER JOIN cliente cli ON cli.codCliente = vpla.cliente_codCliente
INNER JOIN funcionario fun ON fun.codFuncionario = vpla.funcionario_codFuncionario
INNER JOIN plano pla ON pla.codPlano = vpla.plano_codPlano) ;

-- Copiando estrutura para view academia.v_produtos
DROP VIEW IF EXISTS `v_produtos`;
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `v_produtos`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `v_produtos` AS (SELECT p.codProduto AS CODIGO,
p.nomeProduto AS NOME,
p.valorProduto AS VALOR,
cat.nomeCategoria AS "CATEGORIA",
mar.nomeMarca AS "MARCA",
p.estoque AS ESTOQUE
FROM produto p
INNER JOIN categoria cat ON cat.codCategoria = p.categoria_codCategoria
INNER JOIN marca mar ON mar.codMarca = p.marca_codMarca) ;

-- Copiando estrutura para view academia.v_produtosvendidos
DROP VIEW IF EXISTS `v_produtosvendidos`;
-- Removendo tabela temporária e criando a estrutura VIEW final
DROP TABLE IF EXISTS `v_produtosvendidos`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `v_produtosvendidos` AS (SELECT vprod.codVendaProduto AS CODIGO,
cli.nomeCliente AS "CLIENTE",
prod.nomeProduto AS "PRODUTO",
iven.quantidade AS QUANTIDADE,
vprod.formaPagamento AS "FORMA DE PAGAMENTO",
date_format(vprod.dataHora,'%d/%m/%Y') as "DATA",
date_format(vprod.dataHora,'%Hh %Imin %Ssec') AS HORARIO,
fun.nomeFuncionario AS "FUNCIONARIO"
FROM venda_produto vprod
INNER JOIN item_venda iven ON iven.venda_codVendaProduto = vprod.codVendaProduto
INNER JOIN produto prod ON prod.codProduto = iven.produto_codProduto
INNER JOIN cliente cli ON cli.codCliente = vprod.cliente_codCliente
INNER JOIN funcionario fun ON fun.codFuncionario = vprod.funcionario_codFuncionario) ;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
