CREATE DATABASE exercicio1; #Cria um novo banco de dados

/*
Criar um novo banco de dados,
criar 1 tabela com nome, telefone, endereço, sexo, idade(int)
-- inserir 2 cadastros iguais,
-- inserir 2 cadastros com campos nulos

inserir pelo menos 10 cadastros
*/
CREATE TABLE cadastro(
	nome VARCHAR(50),
    sexo CHAR(1),
    idade INT(2),
    telefone VARCHAR(15),
    endereco VARCHAR(140)
); #Criando a tabela e seus atributos

INSERT INTO cadastro VALUES("Alan Albergaria Vitorino", 'M', 25, "(96) 98532-4456","Avenida Nove de Novembro"), ("Alan Albergaria Vitorino", "M", 25, "(96) 98532-4456","Avenida Nove de Novembro"), ("Gael Alves Quintela", 'M', 15, NULL, NULL), ("Berenice Dias Arruda", NULL, 48, "(31) 98288-8692", NULL), ("Thalia Bastos Arlia", 'F', 41, "(33) 98733-7405", "Travessa Florianópolis"), ("Antônia Pena Zuniga", 'F', 71, "(85) 97217-8164", "Rua Santa Mônica"), ("Clevisson Serra Gadelha", 'M', 36, "(82) 99974-7766", "Travessa Sampaio Marques"), ("Ivalter dos Passos Geraldo", 'M', 69, "(83) 99961-6094", "Rua José Francisco de Melo"), ("Gabriela Biango Couto", 'F', 45, "(94) 98547-3328", "Vila Batista"), ("Pedro Leonicio Estellet", 'M', 17, "(86) 96981-5651", "Quadra 355"); #Inserindo os valores na tebela, respeitando a ordem das colunas da tabela cadastro

SELECT * FROM cadastro;

SELECT sexo FROM cadastro; #Apresenta os sexos cadastrados

SELECT nome FROM cadastro WHERE nome = "Alan Albergaria Vitorino";#Apresenta os dados

SELECT nome FROM cadastro WHERE nome LIKE 'Alan%'; #Apresenta os dados

SELECT nome FROM cadastro WHERE nome LIKE '%Vitorino%'; #Apresenta os dados

SELECT nome, endereco, telefone FROM cadastro WHERE sexo = 'M'; #Apresenta os dados cadastrados que são do sexo Masculino

select nome, telefone from cadastro where sexo = 'F' or endereco like '%Quadra%'; #Apresenta os dados que possuam a palavra "Quadra" como dado ou que seja do sexo feminino

select nome, telefone from cadastro where sexo = 'M' and endereco like '%Quadra%'; #Selecionar alguns dados especificos

select  count(*) from cadastro; #Mostrar a quantidade de cadastro na tabela

select  count(*) as 'Quantidade'from cadastro; #Mostrar a quantidade, porém é apresentado o nome quantidade acima do resultado

select sexo, count(*) as 'Quantidade de cadastro agrupado por sexo' from cadastro group by sexo; #agrupando todos os dados

select idCadastro, nome, idade from cadastro where telefone is not null; #Apresentado os dados da tabela que não são nulos

update cadastro set telefone = '(61) 96541-5522' where nome = "Gael Alves Quintela"; #atualizar um dado
update cadastro set sexo = 'F' where idCadastro = 4; #atualizar um dado

set sql_safe_updates=0;#desativar o safe mode do update

alter table cadastro add idCadastro int primary key auto_increment; #Alteração da tabela, onde foi adicionado um no atributo, sendo ele do tipo inteiro e com uma key primaria com auto incremento

ALTER TABLE pessoa DROP COLUMN idPessoa; #dropar uma coluna

alter table cadastro modify column idCadastro int (10) first; #Modificando a posição da coluna idCadatro para primeira posição

alter table cadastro modify column idCadastro int (10) after nome; #Modificando a posição da coluna idCadastro para depois da coluna nome

select concat(nome, ' é do sexo: ', sexo) from cadastro; #concatenando os elementos da tabela

select concat(nome, ' é do sexo: ', sexo) as 'mensagem' from cadastro; #concatenando os elementos da tabela, porém ao inves de apresentar o nome "concat(nome, ' é do sexo: ', sexo)" é apresentrado a nome mensagem acima do elementos

select sum(2 + 2) as "soma";#teste

delete from cadastro where idCadastro like 2;#Não utilizavel

delete from cadastro where idCadastro = 11; #Deletando um dado da tabela utilizando o id

update cadastro set endereco = 'Quadra L' where idCadastro = 3;  #atualizar um dado utilizando o id


SELECT * FROM cadastro;