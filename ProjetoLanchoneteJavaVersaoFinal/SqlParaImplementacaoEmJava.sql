CREATE DATABASE SalgadosECia;
GO
USE SalgadosECia;

/* Criação de tabelas */

--CREATE TABLE Cliente (cli_cpf		  CHAR(11) PRIMARY KEY NOT NULL,
--					    cli_nome   	  VARCHAR(50) NOT NULL,
--					    cli_dataNasc	  DATE		  NOT NULL,
--                      cli_endereco VARCHAR(100) NOT NULL,
--  				   	cli_telefone    CHAR   (11) NOT NULL,
--                      cli_gmail       VARCHAR(50) NOT NULL UNIQUE);

--CREATE TABLE Funcionarios (func_cpf 	    CHAR(11) PRIMARY KEY NOT NULL,
--                       	   func_nome   	    VARCHAR(30) NOT NULL,
--                       	   func_telefone    VARCHAR(11) NOT NULL,
--						   func_dataNasc	DATE		NOT NULL,
--						   func_salario		MONEY		NOT NULL,
--                       	   func_endereco	VARCHAR(75) NOT NULL,
--						   func_cargo		VARCHAR(15) NOT NULL,
--						   func_dataAdmissao DATE NOT NULL,
--						   func_email VARCHAR(50) NOT NULL,
--						   func_turno CHAR(5) NOT NULL,
--						   func_tipoContrato VARCHAR(25));

--CREATE TABLE Fornecedor (frn_cnpj  	  CHAR	 (14) PRIMARY KEY,
--                     	 frn_nomeEmpresa  VARCHAR(80) NOT NULL,
--                     	 frn_endereco     VARCHAR(50),
--                     	 frn_telefone  	  CHAR	 (11) NOT NULL,
--						 frn_email		  VARCHAR(50) NOT NULL UNIQUE,
--                     	 frn_produtoFornecido VARCHAR(50) NOT NULL);

--CREATE TABLE Pedido (ped_numero			  INTEGER PRIMARY KEY IDENTITY(1,1),
--                 	 ped_nomeCliente		  VARCHAR(30)  NOT NULL,
--					 ped_quant				  INTEGER	   NOT NULL,
--                 	 ped_produtosSelecionados VARCHAR(200) NOT NULL,
--                 	 ped_produtosDisponiveis  VARCHAR(100) NOT NULL,
--					 ped_status				  VARCHAR(20)  NOT NULL,
--                 	 cli_descricao			  VARCHAR(100) NOT NULL);

--CREATE TABLE PedidosAoFornecedor(pedForn_Id INTEGER PRIMARY KEY IDENTITY(1,1),
--								 pedForn_produto VARCHAR(100),
--								 pedForn_quant INTEGER);

--CREATE TABLE Produto (prd_codigo  		   INTEGER PRIMARY KEY IDENTITY(1,1),
--  					  prd_nome 			   VARCHAR(50) NOT NULL,
--  				      prd_quantidade       INTEGER NOT NULL,
--					  prd_validade         DATE NOT NULL,
--					  prd_fornecedor       VARCHAR(40) NOT NULL);
