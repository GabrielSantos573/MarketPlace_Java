create database java;
use java;

create table Cliente(
	email varchar(90) not null,
    senha varchar(45) not null,
    nome varchar(45) not null,
    CPF varchar(45) unique not null,
    CEP varchar(45) not null,
    sexo varchar(45) not null,
    telefone varchar(45) not null,
    idade int not null
);

create table Produto(
	nome varchar(45) not null,
    marca varchar(45) not null,
    preço float not null,
    tamanhos varchar(20) not null,
    categoria varchar(45) not null,
    genero varchar(20) not null
);

create table Carrinho(
	compra varchar(45) not null,
    comprador varchar(45) not null,
    total float not null,
    formaPagamento varchar(45) not null,
    senha int not null
);