create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(255),
    borda varchar(255),
    preco int,
    primary key (id) 
);

insert into tb_categoria (nome, borda, preco) 
		values ("Normal", "Normal", 60);
insert into tb_categoria (nome, borda, preco) 
		values ("broto", "borda de Catupiry", 35);
insert into tb_categoria (nome, borda, preco) 
		values ("Normal", "borda de Catupiry", 65);
insert into tb_categoria (nome, borda, preco) 
		values ("broto", "normal", 30);
insert into tb_categoria (nome, borda, preco) 
		values ("Snack", "Sem borda", 20);

select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
nome varchar(20),
sabor1 varchar(20),
sabor2 varchar(20),
sabor3 varchar(20),
tem_cebola boolean,
primary key (id),
fk_id_categoria bigint,
foreign key (fk_id_categoria) references tb_categoria(id)
);

insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("Portuguesa","Queijo", "Presunto", "ovo", true, 1);
insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("3 Queijos","Mussarela", "Parmesão", "catupiry", false, 1);
insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("Caipira","Queijo", "frango", "milho", true, 1);
insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("Calabresa","Calabresa", "Orégano", "", false, 2);
insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("Toscana","Calabresa", "Orégano", "", true, 2);
insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("Baiana","Calabresa", "Orégano", "pimenta", true, 1);
insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("Banana","Banana", "Canela", "Queijo", false, 2);
insert into  tb_pizza (nome, sabor1, sabor2, sabor3, tem_cebola, fk_id_categoria) 
values ("Marguerita","Queijo", "Manjericão", "", false, 1);

select * from tb_categoria where preco > 45;

select * from tb_categoria where preco between 29 and 60;

select * from tb_categoria where nome like "%c%";

select * from tb_categoria inner join tb_pizza 
on tb_categoria.id = tb_pizza.fk_id_categoria;

select * from tb_categoria inner join tb_pizza 
on tb_categoria.id = tb_pizza.fk_id_categoria
where fk_id_categoria = 2