-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: mariadb-176567-db.mariadb-176567:10045
-- Tempo de geração: 25-Jun-2024 às 14:40
-- Versão do servidor: 11.1.2-MariaDB-1:11.1.2+maria~ubu2004
-- versão do PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `viagens`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `destinos`
--

CREATE TABLE `destinos` (
  `id` int(11) DEFAULT NULL,
  `nome` varchar(255) NOT NULL COMMENT 'Nome de destino',
  `descricao` varchar(255) DEFAULT NULL COMMENT 'Descrição do destino'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `reservas`
--

CREATE TABLE `reservas` (
  `id` int(11) DEFAULT NULL COMMENT 'Identificador único de reserva',
  `id_usuario` int(11) DEFAULT NULL COMMENT 'Referência ao ID do usuário que fez a reserva',
  `id_destino` int(11) DEFAULT NULL COMMENT 'Referência ao ID do destino de reserva',
  `data` date DEFAULT NULL COMMENT 'Data de reserva',
  `status` varchar(255) DEFAULT 'Pendente' COMMENT 'Status da reserva confirmada, pendente, cancelada e etc...'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) DEFAULT NULL,
  `nome` varchar(255) NOT NULL COMMENT 'Nome completo do usuário',
  `email` varchar(100) NOT NULL COMMENT 'Email do usuário deve ser único',
  `endereco` varchar(50) NOT NULL COMMENT 'Endereço de residencia o usuário',
  `data_nascimento` date DEFAULT NULL COMMENT 'Data de nascimento do usuário'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD UNIQUE KEY `email` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
