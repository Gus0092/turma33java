create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
	id bigint auto_increment,
    nome varchar(255),
    poderEspecial varchar(255),
    Mana int,
    primary key (id) 
);

insert into tb_classe (nome, poderEspecial, Mana) 
		values ("guerreiro", "espada afiada", 30);
insert into tb_classe (nome, poderEspecial, Mana) 
		values ("arqueira", "chuva de flechas", 100);
insert into tb_classe (nome, poderEspecial, Mana) 
		values ("sereia", "agua transbordante", 120);
insert into tb_classe (nome, poderEspecial, Mana) 
		values ("morte", "sugadora de almas", 150);
insert into tb_classe (nome, poderEspecial, Mana) 
		values ("mago", "barreira de fogo", 180);

select * from tb_classe;

create table tb_personagens(
id bigint auto_increment,
nome varchar(20),
genero varchar(20),
raça varchar(20),
poderDeAtaque int,
poderDeDefesa int,
primary key (id),
fk_id_classe bigint,
foreign key (fk_id_classe) references tb_classe(id)
);

insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("Gustavo","masculino", "Jacaré", 1800, 8000, 1);
insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("Joice","feminino", "humana", 2320, 1500, 3);
insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("Juan","neutro", "bullywug", 8080, 1000, 4);
insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("Raniere", "neutro", "gatuno", 7020, 1000, 2);
insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("Rony","masculino", "Humano", 2800, 5000, 1);
insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("Joana","feminino", "gatuna", 2400, 3000, 3);
insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("Rodrigo","outro", "elfo", 9080, 1000, 2);
insert into  tb_personagens (nome, genero, raça, poderDeAtaque, poderDeDefesa, fk_id_classe) 
values ("James", "masculino", "anão", 800, 9800, 1);

select * from tb_personagens where poderDeAtaque > 2000;

select * from tb_personagens where poderDeDefesa between 1000 and 2000;

select * from tb_personagens where nome like "%c%";

select * from tb_personagens inner join tb_classe 
on tb_classe.id = tb_personagens.fk_id_classe;

select * from tb_personagens inner join tb_classe
on tb_classe.id = tb_personagens.fk_id_classe
where fk_id_classe = 2