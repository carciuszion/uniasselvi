CREATE SCHEMA `acesso` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
CREATE TABLE `acesso`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(15) NULL,
  PRIMARY KEY (`idusuario`),
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC) VISIBLE);
  
  INSERT INTO `acesso`.`usuario` (`nome`, `senha`) VALUES ('carcius', '123');
  
  

				
			