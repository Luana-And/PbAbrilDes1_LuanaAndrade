-- Creating the Gondola table
CREATE TABLE Gondola (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         capacity INT
);

-- Creating the Pessoa table
CREATE TABLE Pessoa (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255),
                        age INT,
                        gondola_id INT,
                        FOREIGN KEY (gondola_id) REFERENCES Gondola(id)
);