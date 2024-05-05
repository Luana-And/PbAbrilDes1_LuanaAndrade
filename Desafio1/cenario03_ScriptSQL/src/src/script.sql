-- Script de criação das tabelas Gondola e Pessoa com relacionamentos

-- Tabela Pessoa
CREATE TABLE Pessoa (
                        id INT PRIMARY KEY,
                        name VARCHAR(255),
                        age INT,
                        parent_id INT,
                        gondola_id INT,
                        FOREIGN KEY (parent_id) REFERENCES Pessoa(id),
                        FOREIGN KEY (gondola_id) REFERENCES Gondola(id)
);

-- Tabela Gondola
CREATE TABLE Gondola (
                         id INT PRIMARY KEY,
                         capacity INT
);
