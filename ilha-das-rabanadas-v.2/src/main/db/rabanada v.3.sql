-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27-Abr-2023 às 14:17
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `rabanada`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carrinho`
--

CREATE TABLE `carrinho` (
  `idCarrinho` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nomeCliente` varchar(100) NOT NULL,
  `sobrenome` varchar(100) NOT NULL,
  `numeroCliente` varchar(50) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `rua` varchar(100) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `numero` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `idLogin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `idLogin` int(11) NOT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`idLogin`, `login`, `senha`) VALUES
(3, 'jj@gmail.com', '$2y$10$seMgziP9tIHMbASF.XXV4OPgyu7ZknPvs6xvQf4OCpafdb6zZBJtO');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `dataEntrega` varchar(15) NOT NULL,
  `hora` varchar(8) NOT NULL,
  `valorPedido` varchar(20) NOT NULL,
  `quantidadePedido` varchar(10) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `formaPagamento` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `nomeProduto` varchar(100) DEFAULT NULL,
  `preco` varchar(20) DEFAULT NULL,
  `descricao` text DEFAULT NULL,
  `imagem` varchar(100) DEFAULT NULL,
  `idProduto` int(11) NOT NULL,
  `categoria` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`nomeProduto`, `preco`, `descricao`, `imagem`, `idProduto`, `categoria`) VALUES
('Rabanada com Maracujá', '5,00', 'Rabanada tradicional com recheio de maracujá.', 'teste', 223, 'Doces'),
('Rabanada com  morango', 'R$ 5,00', 'Rabanada tradicional com recheio de morango.', 'http://localhost/projetoIntegrador/public/imgs/uploads/rabanaada-morango.webp', 224, 'Doce'),
('Rabanada com maracujá', 'R$ 5,00', 'Rabanada tradicional com recheio de maracujá.', 'http://localhost/projetoIntegrador/public/imgs/uploads/rabanaada-maracuja.webp', 225, 'Doce'),
('Rabanada com Brigadeiro', 'R$ 5,00', 'Rabanada tradicional com recheio de brigadeiro.', 'http://localhost/projetoIntegrador/public/imgs/uploads/rabanaada-choco.webp', 226, 'Doce'),
('Rabanada com limão', 'R$ 5,00', 'Rabanada tradicional com recheio de limão.', 'http://localhost/projetoIntegrador/public/imgs/uploads/rabanaada-limao.webp', 227, 'Doce'),
('Rabanada c/ doce de leite', 'R$ 5,00', 'Rabanada tradicional com recheio de  doce de leite', 'http://localhost/projetoIntegrador/public/imgs/uploads/rabanaada-doce-de-leitepng.webp', 228, 'Doce'),
('Rabanada com beijinho', 'R$ 5,00', 'Rabanada tradicional com recheio de coco', 'http://localhost/projetoIntegrador/public/imgs/uploads/rabanaada-coc.webp', 229, 'Doce'),
('Rabanada com  calabresa', 'R$ 5,00', 'Rabanada tradicional com recheio de  calabresa', 'http://localhost/projetoIntegrador/public/imgs/uploads/rabanaada-calabresa.webp', 230, 'Salgado'),
('Rabanada com  queijo', 'R$ 5,00', 'Rabanada tradicional com recheio de  queijo', 'http://localhost/projetoIntegrador/public/imgs/uploads/queijo.webp', 232, 'Salgado'),
('Rabanada com frango', 'R$ 5,00', 'Rabanada tradicional com recheio de  frango', 'http://localhost/projetoIntegrador/public/imgs/uploads/vegana.webp', 233, 'Salgado'),
('Rabanada vegana', 'R$ 5,00', 'Rabanada tradicional', 'http://localhost/projetoIntegrador/public/imgs/uploads/vegana.webp', 234, 'Vegana');

-- --------------------------------------------------------

--
-- Estrutura da tabela `recibo`
--

CREATE TABLE `recibo` (
  `idRecibo` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `dataRecibo` varchar(100) NOT NULL,
  `statusRecibo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `carrinho`
--
ALTER TABLE `carrinho`
  ADD PRIMARY KEY (`idCarrinho`),
  ADD KEY `fk_carrinho_id_cliente` (`idCliente`),
  ADD KEY `fk_carrinho_id_produto` (`idProduto`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD KEY `fk_id_login` (`idLogin`);

--
-- Índices para tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idLogin`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `FK_id_cliente` (`idCliente`),
  ADD KEY `FK_id_produto` (`idProduto`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`idProduto`);

--
-- Índices para tabela `recibo`
--
ALTER TABLE `recibo`
  ADD PRIMARY KEY (`idRecibo`),
  ADD KEY `FK_recibo_idPedido` (`idPedido`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `carrinho`
--
ALTER TABLE `carrinho`
  MODIFY `idCarrinho` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `login`
--
ALTER TABLE `login`
  MODIFY `idLogin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=235;

--
-- AUTO_INCREMENT de tabela `recibo`
--
ALTER TABLE `recibo`
  MODIFY `idRecibo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `carrinho`
--
ALTER TABLE `carrinho`
  ADD CONSTRAINT `fk_carrinho_id_cliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `fk_carrinho_id_produto` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`);

--
-- Limitadores para a tabela `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_id_login` FOREIGN KEY (`idLogin`) REFERENCES `login` (`idLogin`);

--
-- Limitadores para a tabela `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `FK_id_cliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `FK_id_produto` FOREIGN KEY (`idProduto`) REFERENCES `produto` (`idProduto`);

--
-- Limitadores para a tabela `recibo`
--
ALTER TABLE `recibo`
  ADD CONSTRAINT `FK_recibo_idPedido` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
