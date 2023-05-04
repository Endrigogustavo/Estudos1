-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Maio-2023 às 21:05
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_rh`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cargo`
--

CREATE TABLE `cargo` (
  `CodCargo` varchar(5) NOT NULL,
  `Descricao` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cargo`
--

INSERT INTO `cargo` (`CodCargo`, `Descricao`) VALUES
('1', 'Setor do Rh da empresa'),
('2', 'Setor de TI da empresa'),
('3', 'Setor de ADM da empresa'),
('4', 'Setor de Db da empresa'),
('5', 'Setor de LOG da empresa'),
('6', 'Setor de Marketing da empresa'),
('7', 'Setor do Design da empresa'),
('8', 'Setor de finanças da empresa'),
('9', 'Setor de lucro da empresa'),
('10', 'Setor do Vendas da empresa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `departamento`
--

CREATE TABLE `departamento` (
  `CodigoDep` int(11) NOT NULL,
  `Descricao` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `departamento`
--

INSERT INTO `departamento` (`CodigoDep`, `Descricao`) VALUES
(1, 'Setor do Rh da empresa'),
(2, 'Setor de TI da empresa'),
(3, 'Setor de ADM da empresa'),
(4, 'Setor de Db da empresa'),
(5, 'Setor de LOG da empresa'),
(6, 'Setor de Marketing da empresa'),
(7, 'Setor do Design da empresa'),
(8, 'Setor de finanças da empresa'),
(9, 'Setor de lucro da empresa'),
(10, 'Setor do Vendas da empresa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dependentes`
--

CREATE TABLE `dependentes` (
  `Matricula` int(11) NOT NULL,
  `NomeDescricao` varchar(30) NOT NULL,
  `DtNascimento` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `dependentes`
--

INSERT INTO `dependentes` (`Matricula`, `NomeDescricao`, `DtNascimento`) VALUES
(13512, 'João Tiago da Rocha', '07/04/1999'),
(1251235, 'Eduardo Henry Emanuel Vieira', '17/12/1987'),
(253112, 'Caroline Laura da Costa', '11/07/1979'),
(513223, 'Raquel Rosa Barros', '07/06/1989'),
(12523, 'Ricardo Benjamin Miguel da Mat', '12/12/2002'),
(12351, 'Aurora Agatha Assis', '06/01/1972'),
(12561, 'Emily Adriana Caldeira', '28/10/1979'),
(125123, 'Alessandra Eliane Assis', '25/03/1997'),
(1232135, 'Anderson Ian Lopes', '07/12/2000'),
(123521, 'Lorenzo Lucas Barros', '31/08/1989');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `Matricula` int(10) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `DataNas` varchar(10) NOT NULL,
  `Nascionalidade` varchar(30) NOT NULL,
  `Sexo` varchar(10) NOT NULL,
  `EstadoCivil` varchar(10) NOT NULL,
  `RG` varchar(15) NOT NULL,
  `CPF` varchar(35) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Telefone` varchar(15) NOT NULL,
  `Data admicao` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`Matricula`, `Nome`, `DataNas`, `Nascionalidade`, `Sexo`, `EstadoCivil`, `RG`, `CPF`, `Endereco`, `Telefone`, `Data admicao`) VALUES
(2341, 'Fábio Rafael de Paula', '21/07/1998', 'Brasileiro', 'Masculino', 'Casado', '42.667.109-0', '084.529.747-36', 'Avenida São Lucas', '(63) 98891-8694', '06/03/2014'),
(24513, 'José Tomás Renan Vieira', '12/11/1973', 'Portugues', 'Masculino', 'Solteiro', '17.893.900-6', '522.459.150-38', 'Rua das Alpíneas', '(66) 2740-0983', '16/01/2014'),
(34623, 'Adriana Catarina da Conceição', '24/10/1995', 'Brasileira', 'Feminino', 'Solteira', '42.075.378-3', '655.766.443-36', 'Rua Lontra', '(63) 98728-4194', '10/03/2010'),
(13413, 'Pedro Henrique Erick Yago Peixoto', '11/08/1987', 'Espanhou', 'Masculino', 'Solteiro', '45.733.072-7', '521.596.062-35', 'Rua Nélia Campos de OLiveira', '(22) 98899-4774', '28/11/2016'),
(235235, 'Iago Rafael Drumond', '01/03/1965', 'Brasileiro', 'Masculino', 'Solteiro', '40.269.140-4', '983.447.387-76', 'Rua Mário Colonhesi', '(14) 99307-5242', '15/04/2015'),
(234114, 'Carla Isis Corte Real', '10/01/1986', 'Portuguesa', 'Feminino', 'Solteiro', '35.719.706-9', '527.811.562-99', 'Rua Valentin Dalastra', '(66) 2824-9166', '13/03/2015'),
(547433, 'Marilene Quindeler Vogas', '11/11/1996', 'Brasileiro', 'Feminino', 'Solteiro', '36.945.838-2', '175.854.820-78', 'Rua Duzentos e Trinta e Seis', '(65) 3091-8655', '27/01/2018'),
(23634, 'Higor Ubaldo da Paixão', '28/05/1958', 'Brasileiro', 'Masculino', 'Solteiro', '19.262.065-4', '432.988.660-08', 'Rua Golfo do Alasca', '(92) 97686-3261', '15/03/2021'),
(6234623, 'Ana Caroline Lyrio Nigro', '28/02/1979', 'Brasileiro', 'Feminino', 'Solteiro', '16.827.648-3', '035.736.150-40', 'Rua Barão de Boa Esperança', '(97) 99778-2127', '10/10/2019'),
(623326, 'Celia Carneiro Kassab', '18/11/1964', 'Brasileiro', 'Feminino', 'Solteiro', '10.865.939-2', '231.108.480-15', 'Quadra SHPS Quadra 603 Conjunto 96C', '(61) 98733-9948', '18/07/2017'),
(6475431, 'Geanny Ascar Pacheco', '20/06/1974', 'Brasileiro', 'Masculino', 'Solteiro', '32.525.968-9', '509.373.010-60', 'Rua Piranema', '(77) 2860-4428', '21/12/2019'),
(12543, 'Oseias Carmanin Carmoriz', '12/12/1995', 'Brasileiro', 'Masculino', 'Solteiro', '49.241.348-4', '093.663.840-05', 'Rua Eunápolis', '(91) 3697-8865', '11/08/2015'),
(234626, 'Emanuel Lopez Vidal', '18/06/1967', 'Brasileiro', 'Masculino', 'Solteiro', '34.355.255-3', '719.637.360-01', 'Rua Porto Santo Julians', '(66) 2946-3164', '27/02/2021'),
(236236, 'Franciele Sodre Geraldo', '10/03/1960', 'Brasileiro', 'Masculino', 'Solteiro', '42.660.088-5', '485.929.790-30', 'Avenida Morobá', '(84) 3042-1768', '14/12/2022'),
(236213, 'Vivian Ascar Faria', '30/03/1963', 'Brasileiro', 'Masculino', 'Solteiro', '22.251.236-2', '174.676.440-60', 'Avenida Pinheiro Machado', '(96) 2379-7475', '17/05/2018');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lotacao`
--

CREATE TABLE `lotacao` (
  `Matricula` int(11) NOT NULL,
  `CodigoDep` varchar(30) NOT NULL,
  `DtInicio` varchar(20) NOT NULL,
  `Dtfim` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `lotacao`
--

INSERT INTO `lotacao` (`Matricula`, `CodigoDep`, `DtInicio`, `Dtfim`) VALUES
(12341, '9', '11/3/2000', '11/2/2020'),
(236132, '4', '21/12/1999', '21/12/2022'),
(15212, '2', '12/10/1991', '12/10/2018'),
(51215, '7', '30/12/1990', '30/12/2020'),
(123512, '10', '19/9/2000', '19/9/2020'),
(512563, '4', '10/12/2000', '10/12/2020'),
(43623, '8', '29/1/2001', '29/1/2029'),
(23623, '9', '20/3/2001', '20/3/2025'),
(263236, '3', '30/9/1980', '30/9/2024'),
(236423, '5', '1/2/1999', '1/2/2020'),
(23646, '1', '2/6/1999', '2/6/2019'),
(262346, '5', '7/2/1990', '7/2/2020'),
(236234, '3', '9/10/2000', '9/10/2023'),
(74457, '4', '2/10/2002', '2/10/2021'),
(436325, '1', '2/3/2000', '2/3/2020');

-- --------------------------------------------------------

--
-- Estrutura da tabela `ocupacao`
--

CREATE TABLE `ocupacao` (
  `Matricula` int(11) NOT NULL,
  `CodCargo` varchar(30) NOT NULL,
  `DtInicio` varchar(20) NOT NULL,
  `DtFim` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `ocupacao`
--

INSERT INTO `ocupacao` (`Matricula`, `CodCargo`, `DtInicio`, `DtFim`) VALUES
(12341, '9', '11/3/2000', '11/2/2020'),
(236132, '4', '21/12/1999', '21/12/2022'),
(15212, '2', '12/10/1991', '12/10/2018'),
(51215, '7', '30/12/1990', '30/12/2020'),
(123512, '10', '19/9/2000', '19/9/2020'),
(512563, '4', '10/12/2000', '10/12/2020'),
(43623, '8', '29/1/2001', '29/1/2029'),
(23623, '9', '20/3/2001', '20/3/2025'),
(263236, '3', '30/9/1980', '30/9/2024'),
(236423, '5', '1/2/1999', '1/2/2020'),
(23646, '1', '2/6/1999', '2/6/2019'),
(262346, '5', '7/2/1990', '7/2/2020'),
(236234, '3', '9/10/2000', '9/10/2023'),
(74457, '4', '2/10/2002', '2/10/2021'),
(436325, '1', '2/3/2000', '2/3/2020');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`CodCargo`);

--
-- Índices para tabela `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`CodigoDep`);

--
-- Índices para tabela `dependentes`
--
ALTER TABLE `dependentes`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices para tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices para tabela `lotacao`
--
ALTER TABLE `lotacao`
  ADD PRIMARY KEY (`Matricula`);

--
-- Índices para tabela `ocupacao`
--
ALTER TABLE `ocupacao`
  ADD PRIMARY KEY (`Matricula`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `Matricula` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6475432;

--
-- AUTO_INCREMENT de tabela `lotacao`
--
ALTER TABLE `lotacao`
  MODIFY `Matricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=512564;

--
-- AUTO_INCREMENT de tabela `ocupacao`
--
ALTER TABLE `ocupacao`
  MODIFY `Matricula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=512564;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
