use db_rh;

create table funcionarios(
	id int(5) auto_increment,
    nome varchar(30) not null,
    genero enum('ela', 'elu', 'ele', 'outro'),
    dataNascimento date,
    salario decimal(6,2),
    primary key (id));
insert into funcionarios (nome, genero, dataNascimento, salario) values ("Denis", "ele", '1992-02-10', 2500);
insert into funcionarios (nome, genero, dataNascimento, salario) values ("Roberto", "ele", '1994-02-15', 9100);
insert into funcionarios (nome, genero, dataNascimento, salario) values ("Jorge", "elu", '1999-11-22', 2000);
insert into funcionarios (nome, genero, dataNascimento, salario) values ("Amanda", "ela", '1994-11-24', 6700);
insert into funcionarios (nome, genero, dataNascimento, salario) values ("Raissa", "outro", '1990-09-28', 2700);
insert into funcionarios (nome, genero, dataNascimento, salario) values ("Gus", "ele", '1992-06-02', 6900);
insert into funcionarios (nome, genero, dataNascimento, salario) values ("Creuza", "ela", '1990-09-01', 8200);
select * from funcionarios;
delete from funcionarios where id>7;    
select * from funcionarios where salario > 2000;
select * from funcionarios where salario < 2000;
update funcionarios set salario = 8000.50 where id = 6;
select * from funcionarios;