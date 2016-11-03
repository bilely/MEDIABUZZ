--Creation de la database
CREATE DATABASE mediabuzz_sql;

--Utilisation de la table
USE mediabuzz_sql;

--Création des tables
CREATE TABLE utilisateur(
    id INT NOT NULL auto_increment,
    pseudo VARCHAR (100),
    nom VARCHAR (100),
    prenom VARCHAR(100),
    mail VARCHAR (100),
    dateInscription DATE,
    compteActif TINYINT,
    PRIMARY KEY(id)
);

CREATE TABLE commentaire(
    id INT NOT NULL auto_increment,
    datePublication DATE,
    titre VARCHAR(100),
    contenu VARCHAR(250),
    PRIMARY KEY(id)
);

CREATE TABLE alerte(
    id INT NOT NULL auto_increment,
    sujet VARCHAR(100),
    dateNotification DATE,
);

CREATE TABLE media(
    id INT NOT NULL auto_increment,
    auteur VARCHAR(100),
    datePublication DATE,
    nom VARCHAR(100),
    descrption VARCHAR(100),
    taille INT,
    type CHAR(10),
    nbVue INT
    PRIMARY KEY(id)
);

CREATE TABLE tag(
    id INT NOT NULL auto_increment,
    nom VARCHAR(100),
    PRIMARY KEY(id)
);

CREATE TABLE vote(
    id INT NOT NULL auto_increment,
    nombreTop INT,
    nombreFlop INT,
    PRIMARY KEY(id)
);


CREATE TABLE dynamique(
    id INT NOT NULL auto_increment
    duree DATE
    PRIMARY KEY(id)
);

CREATE TABLE statique(
    id INT NOT NULL auto_increment
    PRIMARY KEY(id)
);

CREATE TABLE audio(
    id INT NOT NULL auto_increment
    PRIMARY KEY(id)
);

CREATE TABLE image(
    id INT NOT NULL auto_increment
    PRIMARY KEY(id)
)